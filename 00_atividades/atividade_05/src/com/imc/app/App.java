package com.imc.app;

import javax.swing.JOptionPane;

import com.imc.models.IMC;

public class App {
    public static void main(String[] args) throws Exception {
        IMC objIMC = new IMC();

        // declarações
        String[] opcoes = {"Informar dados", "Sair"};
        Object opcao;

        // laço de repetição
        do {
            // mostra as opções
            opcao = JOptionPane.showInputDialog(
                null, 
                "Escolha a opção:", 
                null, 
                JOptionPane.INFORMATION_MESSAGE, 
                null, 
                opcoes, 
                opcoes[0]
            );

            // verifica a opção do usuário
            if (opcao == "Informar dados") {
                // entrada de dados
                objIMC.setNome(JOptionPane.showInputDialog("Informe o nome:"));
                objIMC.setPeso(Double.parseDouble(JOptionPane.showInputDialog("Informe o peso em kg:").replace(",", ".")));
                objIMC.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Informe a altura em metros:").replace(",", ".")));

                // saída de dados
                JOptionPane.showMessageDialog(
                    null, 
                    objIMC.getNome() + 
                    ", seu IMC é: " +
                    String.format("%.2f", objIMC.calcularImc()) +
                    ".\n" +
                    objIMC.getNome() +
                    objIMC.diagnostico()
                );
            }
        } while (opcao != "Sair");
    }
}
// TODO: atividade 05
/*
 * Recrie o programa do IMC, desta vez usando os conceitos de Orientação
 * a Objetos, encapsulamento e Interface Gráfica com JOptionPane.
 * O programa deverá ter a opção de sair.
 * Ao terminar, gere o executável.
 * NOTE: Divirtam-se!!! 💗😎☕
 */