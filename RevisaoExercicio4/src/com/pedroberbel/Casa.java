package com.pedroberbel;

public class Casa {
    private String cor;
    private boolean porta1, porta2, porta3;

    //Getters and setters

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isPorta1() {
        return porta1;
    }

    public void setPorta1(boolean porta1) {
        this.porta1 = porta1;
    }

    public boolean isPorta2() {
        return porta2;
    }

    public void setPorta2(boolean porta2) {
        this.porta2 = porta2;
    }

    public boolean isPorta3() {
        return porta3;
    }

    public void setPorta3(boolean porta3) {
        this.porta3 = porta3;
    }

    //Métodos

    public void pinta(String s){
        this.cor = s;
    }

    public int quantasPortasEstaoAbertas(){
        int aberta = 0;

        if (porta1){
            aberta++;
        }
        if (porta2){
            aberta++;
        }
        if (porta3){
            aberta++;
        }

        return aberta;
    }
}
