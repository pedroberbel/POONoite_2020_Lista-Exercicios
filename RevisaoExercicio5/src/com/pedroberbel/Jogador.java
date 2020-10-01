package com.pedroberbel;

public class Jogador {
    private String nome;
    private int id;
    Cartela cartela = new Cartela();


    public void compraCartela(){
        //this.cartela = new Cartela();

        this.cartela.geraCartela();

        this.cartela.imprimeCartela();
    }

    public boolean confereCartela(int numeroSorteado){
        this.cartela.marcaCartela(numeroSorteado);
        boolean bingo = cartela.deuBingo();
        return bingo;
    }
}
