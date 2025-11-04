package com.atividade03.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // instancia o Scanner
        Scanner leia = new Scanner(System.in);

        // declaração de variáveis
        String nome;
        String resultado;
        double peso;
        double altura;
        double imc;

        // entrada de dados
        System.out.println("Informe o nome:");
        nome = leia.nextLine();
        System.out.println("Informe o peso em kg:");
        peso = leia.nextDouble();
        System.out.println("Informe altura em metros:");
        altura = leia.nextDouble();

        // calcular o imc
        imc = peso/Math.pow(altura, 2);

        // exibe o imc na tela
        System.out.println(nome + ", seu IMC é " + String.format("%.2f", imc) + ".");

        // verifica o diagnóstico
        resultado = (imc < 18.5) ? " está abaixo do peso" :
        (imc < 25) ? " está no peso ideal" :
        (imc < 30) ? " está acima do peso" :
        (imc < 35) ? " está obeso" :
        (imc < 40) ? " está com obesidade nível 2" :
        " está com obesidade mórbida";

        // exibe o resultado
        System.out.println(nome + resultado + ".");

        // fecha objeto leia
        leia.close();
    }
}
// TODO: atividade 03
/*
* Crie um programa que receba do usuário:
* - Nome
* - Peso em kg
* - Altura em metros
* E depois, calcule e exiba na tela o IMC.
* Exiba o diagnóstico de acordo com a tabela do IMC.
*/