package com.heranca.app;

import com.heranca.models.PessoaFisica;
import com.heranca.models.PessoaJuridica;

public class App {
    public static void main(String[] args) throws Exception {
        PessoaFisica usuario = new PessoaFisica();
        PessoaJuridica empresa = new PessoaJuridica();

        usuario.nome = "Alex Machado";
        usuario.cpf = "123.456.789-12";
        usuario.email = "alex@gmail.com";
        usuario.telefone = "(61) 98765-4321";
        usuario.idade = 40;

        empresa.razaoSocial = "Alex LTDA";
        empresa.nomeFantasia = "Cyberdyne Systems";
        empresa.cnpj = "55.076.551/0001-20";
        empresa.email = "cyberdyne@gmail.com";
        empresa.telefone = "(61) 96666-6666";

        System.out.println("Nome do usuário: " + usuario.nome);
        System.out.println("CPF do usuário: " + usuario.cpf);
        System.out.println("E-mail do usuário: " + usuario.email);
        System.out.println("Telefone do usuário: " + usuario.telefone);
        System.out.println("Idade do usuário: " + usuario.idade + " anos.");
        System.out.println("\n-----------------\n");
        System.out.println("Razão Social da empresa: " + empresa.razaoSocial);
        System.out.println("Nome da empresa: " + empresa.nomeFantasia);
        System.out.println("CNPJ da empresa: " + empresa.cnpj);
        System.out.println("E-mail da empresa: " + empresa.email);
        System.out.println("Telefone da empresa: " + empresa.telefone);
    }
}
