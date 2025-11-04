package com.atividade04.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // instancia a classe Scanner
        Scanner leia = new Scanner(System.in);

        // declaração de variáveis
        String[] salas = new String[5];
        String nome;
        String sala;
        int idade;
        int idadeMinima = 0;

        // inicializar o array
        salas[0] = "A Roda Quadrada";
        salas[1] = "A Volta dos Que Não Foram";
        salas[2] = "Poeira em Alto Mar";
        salas[3] = "As Tranças do Rei Careca";
        salas[4] = "A Vingança do Peixe Frito";

        // entrada de dados
        System.out.println("Informe o nome:");
        nome = leia.nextLine();
        System.out.println("Informe a idade:");
        idade = leia.nextInt();

        // limpeza de buffer
        leia.nextLine();

        // loop
        do {
            // menu
            System.out.println("Sala 1 - " + salas[0] + " - Livre");
            System.out.println("Sala 2 - " + salas[1] + " - 12 anos");
            System.out.println("Sala 3 - " + salas[2] + " - 14 anos");
            System.out.println("Sala 4 - " + salas[3] + " - 16 anos");
            System.out.println("Sala 5 - " + salas[4] + " - 18 anos");
            System.out.println("Informe a sala desejada:");
            sala = leia.nextLine();

            // TODO: terminar o programa
        } while (idade < idadeMinima);

        // fecha objeto leia
        leia.close();
    }
}
// TODO: atividade 04
/*
* Crie um programa que receba do usuário: o nome e a idade.
* Depois, exiba um menu com 5 filmes, suas respectivas salas
* de cinema e suas respectivas classificações indicativas.
* O usuário deve escolher o filme, e se caso ele tiver a idade
* mínima para ver o filme, o programa imprime o ingresso e
* encerra. Caso o usuário não tenha a idade mínima, o programa
* bloqueia a entrada do usuário e exibe novamente os filmes.
* Filmes em cartaz:
* - Sala 1 - A Roda Quadrada - Livre
* - Sala 2 - A Volta dos Que Não Foram - 12 anos
* - Sala 3 - Poeira em Alto Mar - 14 anos
* - Sala 4 - As Tranças do Rei Careca - 16 anos
* - Sala 5 - A Vingança do Peixe Frito - 18 anos
*/