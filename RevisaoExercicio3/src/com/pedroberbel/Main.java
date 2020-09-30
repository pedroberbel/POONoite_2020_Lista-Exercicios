package com.pedroberbel;

public class Main {

    public static void main(String[] args) {
        Porta porta = new Porta();

        porta.setAberta(false);
        porta.setCor("Branca");
        porta.setDimensaoX(90);
        porta.setDimensaoY(180);
        porta.setDimensaoZ(4);

        porta.abre();

        porta.fecha();

        porta.pinta("Verde");
        porta.pinta("Azul");
        porta.pinta("Preta");

        porta.setDimensaoZ(5);
        porta.setDimensaoX(95);
        porta.setDimensaoY(190);

        boolean estaAberta = porta.isAberta();
        if(estaAberta) {
            System.out.println("A porta " + porta.getCor() + " esta aberta");
        } else {
            System.out.println("A porta " + porta.getCor() + " esta fechada");
        }
    }
}
