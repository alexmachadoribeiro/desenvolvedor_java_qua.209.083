package com.contador.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // instancia o Scanner
        Scanner leia = new Scanner(System.in);

        // declaração de variável
        int n;

        // entrada de dados
        System.out.println("Informe um número inteiro:");
        n = leia.nextInt();

        // loop (laço de repetição)
        while (n >= 0) {
            n--;
            System.out.println(n);
        }

        // fecha o objeto leia
        leia.close();
    }
}
