package com.atividade01.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // isntancia o Scanner
        Scanner leia = new Scanner(System.in);

        // declaração de variáveis
        String nome;
        String dataNasc;
        String cpf;
        String email;
        String telefone;

        // entrada de dados
        System.out.println("Informe seu nome:");
        nome = leia.nextLine();
        System.out.println("Informe a data de nascimento:");
        dataNasc = leia.nextLine();
        System.out.println("Informe seu CPF:");
        cpf = leia.nextLine();
        System.out.println("Informe seu e-mail:");
        email = leia.nextLine();
        System.out.println("Informe seu telefone:");
        telefone = leia.nextLine();

        // saída de dados
        System.out.println("Nome: " + nome);
        System.out.println("Data de nascimento: " + dataNasc);
        System.out.println("CPF: " + cpf);
        System.out.println("E-mail: " + email);
        System.out.println("Telefone: " + telefone);

        // fecha objeto leia
        leia.close();
    }
}
// TODO: atividade
/*
* Crie um programa que receba do usuário:
* - Nome
* - Data de nascimento
* - CPF
* - E-mail
* - Telefone
* Exiba os dados na tela
*/