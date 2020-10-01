package com.pedroberbel;

import java.util.ArrayList;

public class Main {

	private ArrayList<Integer> numerosSorteados = new ArrayList<Integer>();

	public int sorteiaNumero(){
		int numeroSorteadoNovo = 0;
		boolean numeroValido = false;

		//for (int i = 0 ; i < 25 ;i++) {
		while (!numeroValido) {
			numeroSorteadoNovo = (int) (1 + Math.random() * 75);
			if (numerosSorteados.contains(numeroSorteadoNovo)) {
				//i--;
				continue;
			}
			numeroValido = true;
		}
			numerosSorteados.add(numeroSorteadoNovo);
		//}
		return numeroSorteadoNovo;
	}
/*	Método estourando memória
	public int sorteiaNumero(){
	    int contadorAchou = 0;
	    int numeroSorteadoNovo = (int)(1 + Math.random() * 75);

		for (int numeroSorteado: this.numerosSorteados) {
			if (numeroSorteadoNovo == numeroSorteado) {
				contadorAchou++;
			}
		}
		if (contadorAchou > 0) {
			sorteiaNumero();   // <<<<----------
		}
		//System.out.println(this.numerosSorteados);
		this.numerosSorteados.add(numeroSorteadoNovo);
		return numeroSorteadoNovo;
	}
*/


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
