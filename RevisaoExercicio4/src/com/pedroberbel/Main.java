package com.pedroberbel;

public class Main {

    public static void main(String[] args) {
        Casa casa = new Casa();

        casa.setCor("Azul");
        casa.setPorta1(false);
        casa.setPorta2(true);
        casa.setPorta3(true);

        int portasAbertas = casa.quantasPortasEstaoAbertas();

        if (portasAbertas == 1){
            System.out.println("Existe " + portasAbertas + " porta aberta na casa " + casa.getCor() + ".");
        } else {
            System.out.println("Existem " + portasAbertas + " portas abertas na casa " + casa.getCor() + ".");
        }
        }
}
