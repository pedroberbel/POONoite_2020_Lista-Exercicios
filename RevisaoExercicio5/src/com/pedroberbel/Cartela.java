package com.pedroberbel;

import java.util.Random;
import java.util.stream.IntStream;

public class Cartela {
    private String[][] cartela = new String[5][5];
    private int[] vetorGerador = new int[5];


   private int[] numeroAleatorio(int tamanho){
       int vetor[] = new int[tamanho];
       boolean achou = false;
       int numerosGerados = 0;
       int i = 0;

       while (numerosGerados < tamanho){
           achou = false;
           int novoNumero = (int)(1 + Math.random() * 75);
           for(i=0;i<numerosGerados;i++){
               if (vetor[i] == novoNumero){
                   achou = true;
               }
           }
           if (achou){
               continue;
           } else {
               vetor[numerosGerados] = novoNumero;
               numerosGerados++;
           }
       } //fim while

       return vetor;
   }

    public void geraCartela(){
        int vetor[] = new int[24];
        vetor = numeroAleatorio(24);
        int p = 0;

        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if (i==2 && j==2){
                    cartela[i][j] = "JK";
                } else {
                    cartela[i][j] = String.valueOf(vetor[p]);
                    p++;
                }
            }
        }
    }

    public void marcaCartela(int numeroSorteado){
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++) {
                if(cartela[i][j].compareTo(String.valueOf(numeroSorteado)) == 0){
                    cartela[i][j] = "X";
                    atualizaCartela();
                }
            }
        }
    }

    public boolean deuBingo(){
       int contaBingo = 0;
       //horizontais
        for (int i =0; i<5;i++){
            for(int j=0;j<5;j++){
                if(this.cartela[i][j].compareTo("X") == 0){
                    contaBingo ++;
                }
                if (contaBingo == 5){
                    return true;
                }
            }
        }

       return false;
    }

    public void imprimeCartela(){
        System.out.println("| \tB\tI\tN\tG\tO |");

        for(int i=0;i<5;i++) {
            System.out.print('|');
            for (int j = 0; j < 5; j++) {
                //System.out.print(' ');
                System.out.print('\t'+cartela[i][j]);
                //System.out.print(' ');
            }
            //System.out.print('|');
            System.out.println('|');
        }
    }

    public void atualizaCartela(){
       imprimeCartela();
    }
}
