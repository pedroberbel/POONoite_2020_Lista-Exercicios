package com.pedroberbel;

public class Main {

	public int sorteiaNumero(){

		return (int)(1 + Math.random() * 75);
	}



    public static void main(String[] args) {

	    Main sort = new Main();
	    Jogador jogador1 = new Jogador();

	    int numeroSorteado = 0;
		boolean bingo = false;

		jogador1.compraCartela();

		while(!bingo) {
			numeroSorteado = sort.sorteiaNumero();

			System.out.println("Número sorteado: " + numeroSorteado);
			bingo = jogador1.confereCartela(numeroSorteado);
		}

    }
}
