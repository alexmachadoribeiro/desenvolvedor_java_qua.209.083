package com.construtor.models;

public class Pessoa {
    // atributos
    public String nome;
    public String cpf;
    public String email;
    public String telefone;
    public int idade;

    public Pessoa(String nome, String cpf, String email, String telefone, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.idade = idade;
    }

    public String apresentar() {
        return "Olá, meu nome é " + this.nome + ", tenho " + this.idade + " anos. Meu e-mail é " + this.email + ", meu telefone é " + this.telefone + " e meu CPF é " + this.cpf + ".";
    }

}
