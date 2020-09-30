package com.pedroberbel;

public class Porta {
    private boolean aberta;
    private String cor;
    private double dimensaoX;
    private double dimensaoY;
    private double dimensaoZ;
    
    //getter setter

    public boolean isAberta() {
        return aberta;
    }

    public void setAberta(boolean aberta) {
        this.aberta = aberta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getDimensaoX() {
        return dimensaoX;
    }

    public void setDimensaoX(double dimensaoX) {
        this.dimensaoX = dimensaoX;
    }

    public double getDimensaoY() {
        return dimensaoY;
    }

    public void setDimensaoY(double dimensaoY) {
        this.dimensaoY = dimensaoY;
    }

    public double getDimensaoZ() {
        return dimensaoZ;
    }

    public void setDimensaoZ(double dimensaoZ) {
        this.dimensaoZ = dimensaoZ;
    }
    
    //métodos
    
    public void abre(){
        if(!this.aberta){
            this.aberta = true;
        } else {
            System.out.println("Porta já está aberta");
        }
    }
    
    public void fecha(){
        if (this.aberta){
            this.aberta = false;
        } else {
            System.out.println("Porta já está fechada");
        }
    }
    
    public void pinta(String cor){
        this.cor = cor;
    }
    
    public boolean estaAberta(){
        if (this.aberta){
            return true;
        }
        return false;
    }
}
