package com.pedroberbel;

import java.time.LocalDate;
import java.util.Scanner;

public class FuncionarioTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //a) No Método main() deve-se instanciar um objeto chamado func do tipo Funcionario.
	    Funcionario func = new Funcionario();

	    //b) Utilizando a classe Scanner, atribuir valores para cada campo de dado.
        System.out.println("ID: ");
	    func.setIdFunc(Integer.parseInt(sc.nextLine()));
        System.out.println("Nome: ");
        func.setNomeFunc(sc.nextLine());
        System.out.println("Departamento: ");
        func.setDepartamento(sc.nextLine());
        //System.out.println("Data Contratação");
        func.setDataContratacao(LocalDate.now());
        System.out.println("Salário: ");
        func.setSalario(Double.parseDouble(sc.nextLine()));
        System.out.println("Documento: ");
        func.setDocumento(sc.nextLine());
        //System.out.println("Ativo: ");
        func.setAtivo(true);

        //c) Invocar o método aumentarSalario passando o valor digitado pelo usuário. Experimente passar na primeira vez um valor negativo. Depois repita a operação passando um valor positivo. Verifique o tratamento dado.
        System.out.println("Valor de aumento do salário: ");
        func.aumentarSalario(Double.parseDouble(sc.nextLine()));

        //d) Imprimir os dados, invocando o método imprimir.
        func.imprimir();

        //e) Inativar o cliente usando o método demiteFuncionario.
        func.demiteFuncionario();

        //f) Imprimir novamente os dados.
        func.imprimir();
    }
}

//this.cc[indice].setNomeCliente(sc.nextLine());