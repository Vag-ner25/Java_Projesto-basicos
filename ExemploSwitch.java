package com.example;

public class ExemploSwitch {
    public static void main(String[] args) {
        int dia = 5;
        String nomeDia;
        switch (dia) {
            case 1 -> nomeDia ="Segunda";
            case 2 -> nomeDia ="Terça";
            case 3 -> nomeDia ="Quarta";
            case 4 -> nomeDia ="Quinta";
            case 5 -> nomeDia ="Sexta";
            case 6 -> nomeDia ="Sábado";
            case 7 -> nomeDia ="Domingo";
            default -> nomeDia ="Dia inválido";
        }
        System.out.println("Hoje é " + nomeDia);
    }
}
