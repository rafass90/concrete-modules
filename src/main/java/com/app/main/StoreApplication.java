package com.app.main;

import java.io.Console;
import java.util.Scanner;

public class StoreApplication {
    public static void main (String[] args) {

        System.out.println("Menu: " +
                "1 - Adicionar produto" +
                "2 - Adicionar cliente");

        Scanner scanner = new Scanner(System.in);
        scanner.nextInt();

        do {
            switch (scanner.nextInt ()){
                case (1):
                    addProduto();
                    break;
                case (2):
                    addClient();
                    break;
                case (3):
                    execSell();
                    break;
            }
        }while(scanner.nextInt() != 0);


        try {
            System.out.println("Encerrando execução do programa");
            Thread.sleep (1000L);
            System.out.println("Programa encerrado");
        } catch (InterruptedException e) {
            e.printStackTrace ();
        }

    }

    private static void execSell () {
        int
        System.out.println("-- Produto -- \n" +
                "1 - Para adicionar um livro" +
                "2 - Para adicionar um disco");

        Scanner scanner = new Scanner(System.in);
        if(scanner.nextInt () == 1)
            addBook();
        else
            addDisc();
    }

    private static void addDisc () {
        
    }

    private static void addBook () {
    }

    private static void addClient () {

    }

    private static void addProduto () {

    }
}
