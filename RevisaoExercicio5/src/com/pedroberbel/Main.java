package com.pedroberbel;

import java.util.ArrayList;

public class Main {

	private ArrayList<Integer> numerosSorteados = new ArrayList<Integer>();

	public int sorteiaNumero(){
	    //onde é o melhor lugar para criar esta arraylist? dentro ou fora?
	    //ArrayList<Integer> numerosSorteados = new ArrayList<Integer>();
	    int contadorAchou = 0;
	    int numeroSorteadoNovo = (int)(1 + Math.random() * 75);

		for (int numeroSorteado: this.numerosSorteados) {
			if (numeroSorteadoNovo == numeroSorteado) {
				contadorAchou++;
				System.out.println("Repetiu");
			}
		}
		if (contadorAchou > 0) {
			sorteiaNumero();
		}
		System.out.println(this.numerosSorteados);
		this.numerosSorteados.add(numeroSorteadoNovo);
		return numeroSorteadoNovo;
	    

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
