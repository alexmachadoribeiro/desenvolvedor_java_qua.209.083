package com.entrada.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // instância do objeto leia
        Scanner leia = new Scanner(System.in);

        // declaração de variáveis
        String nome;
        String email;
        int idade;
        double altura;

        // entrada de dados
        System.out.println("Informe seu nome:");
        nome = leia.nextLine();
        System.out.println("Informe sua idade:");
        idade = leia.nextInt();
        System.out.println("Informe sua altura em metros:");
        altura = leia.nextDouble();

        // limpeza de buffer
        leia.nextLine();

        System.out.println("Informe seu e-mail:");
        email = leia.nextLine();

        // saída de dados
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura + " m");
        System.out.println("E-mail: " + email);

        // fecha objeto close
        leia.close();
    }
}
