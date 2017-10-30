package com.app.main;

import com.app.bean.Book;
import com.app.bean.Disc;
import com.app.bean.IProduct;
import com.app.service.ConsumerService;

import java.util.*;

import com.app.bean.Consumer;
import com.app.service.StoreService;

public class StoreApplication {
    public static void main (String[] args) throws Exception {
        int i = 99;

        do {
            System.out.println("Menu: " +
                    "\n1 - Adicionar cliente" +
                    "\n2 - Adicionar livro" +
                    "\n3 - Adicionar disco" +
                    "\n4 - Vender" +
                    "\n5 - Para sair");

            Scanner scanner = new Scanner(System.in);
            i = scanner.nextInt();

            switch (i) {
                case (1):
                    addClient();
                    break;
                case (2):
                    addBook();
                    break;
                case (3):
                    addDisc();
                    break;
                case (4):
                    sell();
                    break;
                case (5):
                    extract();
                    break;
                default:
                    System.out.println("Valor inválido");
                    break;
            }
        }while (i != 0) ;

        System.out.println("Encerrando execução do programa");
        Thread.sleep(1000L);
        System.out.println("Programa encerrado");
    }

    private static void extract () {
        System.out.println ("Extrato das vendas");

        ConsumerService consumerService = new ConsumerService ();
        consumerService.listSales();

    }


    private static void addDisc () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nDigite o nome do artista\n");
        String singer = scanner.next ();

        System.out.println("\nDigite o nome do disco\n");
        String name = scanner.next ();

        System.out.println("\nDigite o valor\n");
        Double price = scanner.nextDouble ();

        System.out.println("\nTipo do álbum:\n     1 - Para CD\n     2 - Para DVD\n     3 - Para outro formato");
        int typeNumber = scanner.nextInt ();
        Disc.Type type = typeNumber == 1? Disc.Type.CD : typeNumber == 2? Disc.Type.DVD : Disc.Type.OUTROS;

        StoreService store = new StoreService ();
        store.insertDisc(new Disc (singer, name, price, type));
    }

    private static void addBook () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nDigite o nome\n");
        String name = scanner.next ();

        System.out.println("\nDigite a quantidade de páginas\n");
        int pages = scanner.nextInt ();

        System.out.println("\nDigite o valor\n");
        Double price = scanner.nextDouble ();

        StoreService store = new StoreService ();
        store.insertBook (new Book (name, pages, price));
    }

    private static void addClient () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nDigite o nome\n");
        String name = scanner.next ();

        System.out.println("\nDigite a idade\n");
        int age = scanner.nextInt ();

        ConsumerService c = new ConsumerService ();
        c.insertConsumer (new Consumer (name, age));
    }

    private static void sell() throws Exception {
        System.out.println("\nVenda\n");
        Scanner scanner = new Scanner(System.in);
        System.out.println("cliente: ");
        int clientId = scanner.nextInt();

        System.out.println("\nProdutos a venda: ");
        ConsumerService consumer = new ConsumerService ();

        Map<Long, IProduct> products = new HashMap<> ();

        StoreService storeService = new StoreService ();
        storeService.listAllProducts ()
                .stream ()
                .peek (p -> products.put (p.getId (), p))
                .forEach (System.out::println);

        System.out.println("\nInsira os ids\n   0 para parar");

        List<IProduct> prdcts = new ArrayList<> ();
        while(scanner.hasNextInt ()){
              int id = scanner.nextInt ();
              if(id == 0)
                  return;
            prdcts.add (products.get (id));
        }
        consumer.insertSale (consumer.findConsumer (Long.valueOf (clientId)), prdcts);

    }
}
