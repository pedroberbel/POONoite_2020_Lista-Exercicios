package com.pedroberbel;

public class Pessoa {
    private String nome;
    private int idade;

    //Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    //Métodos

    public void fazAniversario(){
        System.out.println(this.nome + " fez aniversário, parabéns!");
        this.idade += 1;
    }
    
    public void imprimir(){
        System.out.println("nome = " + nome);
        System.out.println("idade = " + idade);
    }
}
