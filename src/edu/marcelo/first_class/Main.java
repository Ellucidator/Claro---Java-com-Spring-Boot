package edu.marcelo.first_class;

public class Main {
    public static void main(String[] args) {

        final String BR = "Brasil"; // Equivalente a const, constantes sempre são definidas em maiúsculo.

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
        System.out.println(nomeCompleto("Marcelo", "Leal Andrade"));
    }
    public static String nomeCompleto(String first_name, String last_name){
        return first_name +" "+ last_name;
    }
}