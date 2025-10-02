package com.example;
import java.util.Scanner;

public class MenuInterativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;
        
        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Tabuada");
            System.out.println("2 - Números pares");
            System.out.println("3 - FizzBuzz personalizado");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            
            switch (opcao) {
                case 1 -> {
                    System.out.print("Número para tabuada: ");
                    int num = sc.nextInt();
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(num + " x " + i + " = " + (num * i));
                    }
                }
                case 2 -> {
                    System.out.print("Até que número? ");
                    int limite = sc.nextInt();
                    System.out.print("Pares até " + limite + ": ");
                    for (int i = 2; i <= limite; i += 2) {
                        System.out.print(i + " ");
                    }
                    System.out.println();
                }
                case 3 -> {
                    System.out.print("FizzBuzz até que número? ");
                    int n = sc.nextInt();
                    for (int i = 1; i <= n; i++) {
                        if (i % 3 == 0 && i % 5 == 0) System.out.println("FizzBuzz");
                        else if (i % 3 == 0) System.out.println("Fizz");
                        else if (i % 5 == 0) System.out.println("Buzz");
                        else System.out.println(i);
                    }
                }
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
        
        sc.close();
    }
}
