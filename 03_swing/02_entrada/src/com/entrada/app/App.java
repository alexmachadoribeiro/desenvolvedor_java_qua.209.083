package com.entrada.app;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        // declaração de variáveis
        String nome;
        String resultado;
        int idade;

        // entrada de dados
        nome = JOptionPane.showInputDialog("Informe seu nome:");
        idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade:"));

        // verifica maioridade
        resultado  = (idade >= 18) ?  "é maior de idade" : "é menor de idade";

        // saída de dados
        JOptionPane.showMessageDialog(null, nome + " " + resultado + ".");
    }
}
