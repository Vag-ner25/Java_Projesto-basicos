package com.example;

import java.util.Scanner;

public class idade {
    public static void main (String[] args){
        System.out.print("Qual sua idade? ");
         Scanner scanner = new Scanner(System.in);
        int idade = scanner.nextInt();
        if (idade >=18){
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }    
}
}
    
