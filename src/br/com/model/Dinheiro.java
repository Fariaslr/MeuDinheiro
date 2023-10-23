/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.model;

/**
 *
 * @author aluno
 */
public class Dinheiro {

    private float salario;
    private float GastoFixo;
    private float GastoVariavel;
    private float FundoMonetario;

    public Dinheiro() {
       
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getGastoFixo() {
        return GastoFixo;
    }

    public void setGastoFixo(int GastoFixo) {
        this.GastoFixo = GastoFixo;
    }

    public float getGastoVariavel() {
        return GastoVariavel;
    }

    public void setGastoVariavel(int GastoVariavel) {
        this.GastoVariavel = GastoVariavel;
    }

    public float getFundoMonetario() {
        return FundoMonetario;
    }

    public void setFundoMonetario(int FundoMonetario) {
        this.FundoMonetario = FundoMonetario;
    }
       
    public void administraSalario(){
        this.GastoFixo = this.salario * (float) 0.5;
        this.GastoVariavel = this.salario * (float) 0.3;
        this.FundoMonetario = this.salario * (float) 0.2;
    }
    
    public void mostraValores(){
        System.out.println("R$ " + GastoFixo + " para pagar suas contas\nR$" + GastoVariavel + " para gastar com a sua necessidade\nR$ " + FundoMonetario + " para ajudar no seu pé de meia!");
    }
}
