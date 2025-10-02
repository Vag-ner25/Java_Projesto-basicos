package com.example;

import java.util.Scanner;

public class Conversor {
    
    public static double celsiusParaFahrenheit(double c){
        return c  * 9/ 5 + 32;
    }
    public static double fahrenheitParaCelsius(double f ){
        return (f - 32) * 5/9;
    }
    public static double kmParaMilhas(double km){
        return km * 0.621371;
    }
    public static double milhasParaKm(double mi){
        return mi / 0.621371;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String continuar;
        do {
        System.out.print("Digite 1 para C->F, 2 para F->C, 3 para KM -> MI, 4 para MI ->KM" );
        int op = sc.nextInt();
        System.out.print("Digite o valor: ");
        double valor = sc.nextDouble();
        double res = 0;

        if (op == 1) res = celsiusParaFahrenheit(valor);
        else if (op == 2) res = fahrenheitParaCelsius(valor);
        else if (op == 3) res = kmParaMilhas(valor);
        else if (op == 4) res = milhasParaKm(valor);
        else System.out.println("Opção inválida.");

        if (op >= 1 && op <=4)
            System.out.println("Resultado: " + res);
        System.out.print("Deseja fazer outra conversão (S/N)? ");
            sc.nextLine(); // Limpa buffer após nextDouble
            continuar = sc.nextLine();
        } while (continuar.equalsIgnoreCase("S"));
        sc.close();

    
    }








}

