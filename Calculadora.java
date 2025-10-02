package com.example;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String continuar;

        do { 
            
       
        
        System.out.print("Digite o primeiro número: ");
        double num1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = sc.nextDouble();

        System.out.print("Escolha a operação (+, -, *, /): ");
        char op = sc.next().charAt(0);

        double resultado = 0;
        boolean valido = true;

        if (op =='+') resultado = num1 + num2;
        else if (op == '-') resultado = num1 - num2;
        else if (op == '*') resultado = num1 * num2;
        else if (op == '/') {
            if (num2 != 0) resultado = num1 / num2;
            else {
                System.out.println("Erro: Divisão por zero não é permitida.");
                valido = false;
            }
        } else {
            System.out.println("Operação inválida.");
            valido = false;
        }
        if (valido)
            System.out.println("Resultado: " + resultado );
            System.out.print("Deseja fazer outro cálculo? (S/N): ");
            sc.nextLine(); // Limpa o buffer após nextDouble/nextChar
            continuar = sc.nextLine();

        } while (continuar.equalsIgnoreCase("S"));
        sc.close();
        
        
        }
    
}
