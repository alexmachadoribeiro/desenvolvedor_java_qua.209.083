package com.heranca.models;

public class Pessoa {
    // atributos
    public String email;
    public String telefone;

    public Pessoa(String email, String telefone) {
        this.email = email;
        this.telefone = telefone;
    }

    public void exibirDados() {
        System.out.println("E-mail: " + this.email);
        System.out.println("Telefone: " + this.telefone);
    }
}
