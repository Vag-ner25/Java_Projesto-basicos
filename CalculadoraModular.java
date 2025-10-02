package com.example;

import java.util.Scanner;

public class CalculadoraModular {

    static double soma(double a, double b) { return a + b; }
    static double subtrai(double a, double b) { return a - b; }
    static double multiplica(double a, double b) { return a * b; }
    static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Erro: Divisão por zero!");
            return Double.NaN;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;
        
        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - +");
            System.out.println("2 - -");
            System.out.println("3 - *");
            System.out.println("4 - /");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                case 2:
                case 3:
                case 4: {
                    System.out.print("Primeiro número: ");
                    double num1 = sc.nextDouble();
                    System.out.print("Segundo número: ");
                    double num2 = sc.nextDouble();
                    double resultado = 0;

                    switch (opcao) {
                        case 1:
                            resultado = soma(num1, num2);
                            break;
                        case 2:
                            resultado = subtrai(num1, num2);
                            break;
                        case 3:
                            resultado = multiplica(num1, num2);
                            break;
                        case 4:
                            resultado = divide(num1, num2);
                            break;
                    }

                    if (!Double.isNaN(resultado)) {
                        System.out.println("Resultado: " + resultado);
                    }
                    break;
                }
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        
    } while (opcao != 0);
        sc.close();
} 
            }
        
    