package com.pedroberbel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Funcionario {
    //Atributos
    //a) Declare os campos membros da Classe funcionário como públicos.
    //b) O campo membro dataContratacao deve ser do tipo java.time.LocalDate. Importe essa biblioteca.
    //c) O campo ativo é do tipo booleano. Servirá para indicar se o funcionário é ativo ou não.
    public int idFunc;
    public String nomeFunc;
    public String departamento;
    public LocalDate dataContratacao;
    public double salario;
    public String documento;
    public boolean ativo;

    //Getters and Setters
    //d) Crie os modificadores gets/sets para todos os atributos no padrão da linguagem Java.
    public int getIdFunc() {
        return idFunc;
    }

    public void setIdFunc(int idFunc) {
        this.idFunc = idFunc;
    }

    public String getNomeFunc() {
        return nomeFunc;
    }

    public void setNomeFunc(String nomeFunc) {
        this.nomeFunc = nomeFunc;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public LocalDate getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(LocalDate dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }


    //Métodos da Classe Funcionário
    /*e) O método atualizaSalario recebe como argumento um valor double que se refere
    ao valor dado como aumento, deve atualizar o campo salário.
    Importante validar a entrada, ou seja, aumento deve ser positivo. */

    public void aumentarSalario(double aumento){
        if(aumento > 0){
            this.salario += aumento;
        } else {
            System.out.println("O Valor digitado não é válido");
        }
    }

    //f) O método demiteFuncionario altera o campo ativo para false.
    public void demiteFuncionario(){
        if (this.ativo){
            this.ativo = false;
        } else {
            System.out.println("Funcionário não está ativo");
        }

    }

    //g) O método imprimir deve exibir todos os dados de um objeto instanciado.
    public void imprimir(){
        System.out.println("idFunc = " + idFunc);
        System.out.println("nomeFunc = " + nomeFunc);
        System.out.println("departamento = " + departamento);

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("dataContratacao = " + dataContratacao.format(formatador));

        System.out.println("salario = " + salario);
        System.out.println("documento = " + documento);
        System.out.println("ativo = " + ativo);
        System.out.println("------------");
    }


}
