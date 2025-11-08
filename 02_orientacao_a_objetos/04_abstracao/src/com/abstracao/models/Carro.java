package com.abstracao.models;

final public class Carro extends Veiculo {
    // atributos
    public boolean motorEletrico;
    public boolean motorFlex;
    public boolean motorDiesel;
    public boolean motorGasolina;
    public boolean motorEtanol;

    public Carro() {
    }

    public void exibirDados() {
        super.exibirDados();
        if (motorEletrico == true) {
            System.out.println("Motor: Elétrico");
        }
        if (motorFlex == true) {
            System.out.println("Motor: Flex");
        }
        if (motorDiesel == true) {
            System.out.println("Motor: Diesel");
        }
        if (motorGasolina == true) {
            System.out.println("Motor: Gasolina");
        }
        if (motorEtanol == true) {
            System.out.println("Motor: Etanol");
        }
    }
    
}
