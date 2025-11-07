package com.heranca.app;

// classe Java importada
import java.util.Scanner;

// classes criadas por mim
import com.heranca.models.PessoaFisica;
import com.heranca.models.PessoaJuridica;

public class App {
    public static void main(String[] args) throws Exception {
        // instancias
        Scanner leia = new Scanner(System.in);

        PessoaFisica usuario = new PessoaFisica(
            null, 
            null, 
            0, 
            null, 
            null
        );
        PessoaJuridica corp = new PessoaJuridica(
            null, 
            null, 
            null, 
            null, 
            null
        );

        // entrada de dados do usuário
        System.out.println("INFORME OS DADOS DO USUÁRIO:\n");
        System.out.println("Informe o nome:");
        usuario.nome = leia.nextLine();
        System.out.println("Informe o CPF:");
        usuario.cpf = leia.nextLine();
        System.out.println("Informe o e-mail:");
        usuario.email = leia.nextLine();
        System.out.println("Informe o telefone:");
        usuario.telefone = leia.nextLine();
        System.out.println("Informe a idade:");
        usuario.idade = leia.nextInt();

        // limpeza de buffer
        leia.nextLine();

        // entrada de dados da empresa
        System.out.println("\nINFORME OS DADOS DA EMPRESA:\n");
        System.out.println("Informe o nome da empresa:");
        corp.nomeFantasia = leia.nextLine();
        System.out.println("Informe a razão social:");
        corp.razaoSocial = leia.nextLine();
        System.out.println("Informe o CNPJ:");
        corp.cnpj = leia.nextLine();
        System.out.println("Informe o e-mail:");
        corp.email = leia.nextLine();
        System.out.println("Informe o telefone:");
        corp.telefone = leia.nextLine();

        // saída de dados
        System.out.println("\nDADOS DO USUÁRIO:\n");
        usuario.exibirDados();
        System.out.println("\nDADOS DA EMPRESA:\n");
        corp.exibirDados();

        // fecha objeto leia
        leia.close();
    }
}
