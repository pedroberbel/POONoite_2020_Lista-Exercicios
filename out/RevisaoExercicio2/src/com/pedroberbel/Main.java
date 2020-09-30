package com.pedroberbel;

public class Main {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("José");
        pessoa.setIdade(23);

        pessoa.fazAniversario();
        pessoa.fazAniversario();
        pessoa.fazAniversario();
        pessoa.fazAniversario();

        pessoa.imprimir();
    }
}
