package com.app.main;

import java.util.Scanner;

public class StoreApplication {
    public static void main (String[] args) throws InterruptedException {
        int i = 99;

        do {
            System.out.println("Menu: " +
                    "\n1 - Adicionar produto" +
                    "\n2 - Adicionar cliente" +
                    "\n3 - Adicionar livro" +
                    "\n4 - Adicionar disco" +
                    "\n0 - Para sair");

            Scanner scanner = new Scanner(System.in);
            i = scanner.nextInt();

            switch (i){
                case (1):
                    addProduto();
                    break;
                case (2):
                    addClient();
                    break;
                case (3):
                    addBook();
                    break;
                case (4):
                    addDisc();
                    break;
                default:
                    System.out.println("Valor inválido");
                    break;

            }
        }while(i != 0);


        System.out.println("Encerrando execução do programa");
        Thread.sleep (1000L);
        System.out.println("Programa encerrado");
    }

    private static void execSell () {
        System.out.println("\nValor inválido\n");
    }

    private static void addDisc () {
        System.out.println("\nAdicionando disco\n");
    }

    private static void addBook () {
        System.out.println("\nAdicionando livro\n");
    }

    private static void addClient () {
        System.out.println("\nAdicionando cliente\n");
    }

    private static void addProduto () {
        System.out.println("\nAdicionando produto\n");
    }
}
