package dgBank;

import java.util.Scanner;

public class Conta extends Cliente {

    private String titular;
    private int numeroConta;
    private int agencia;
    private  double saldo = 100;

    Scanner entrada = new Scanner(System.in);
    @Override
    public void mostraDadosCliente() {
        super.mostraDadosCliente();
        System.out.println("=======================");
        System.out.println("     Dados Bancarios    ");
        System.out.println("=======================");
        getTitular();
        getNumeroConta();
        getAgencia();

    }

    public void deposita(){
        System.out.println("Qual valor deseja Depositar :  ");
        double valor = entrada.nextDouble();

        if (valor < 0) {
            System.out.println("Valor não permitido!!");
        }else{
            this.saldo += valor;
            this.getSaldo();

        }
    }


    public void saca(){
        System.out.println("Qual valor deseja sacar :  ");
        double valor = entrada.nextDouble();

        if(valor < 0 ){
            System.out.println("Valor não permitido!!");
        }else if (valor <= this.saldo) {
            this.saldo -= valor;
            this.getSaldo();

        }else{
            System.out.println("Valor insuficiente");
        }
    }

    public void transfere( Conta destino){
        System.out.println("Qual valor deseja sacar :  ");
        double valor = entrada.nextDouble();
        if(valor <= this.saldo){
            this.saldo -= valor;
            destino.setSaldo(valor);
            this.getTitular();
            this.getSaldo();
            destino.getTitular();
            destino.getSaldo();
        }else if (valor > this.saldo) {
            System.out.println("Saldo insuficiente");
        }
    }

    public void setTitular(String titular){
        if(titular == ""){
            System.out.println("Por favor digite um nome valido!!");
        }else{
            this.titular = titular;
            System.out.printf("Seja bem vindo %s  ",titular);
        }
    }

    public void setNumeroConta(int numeroConta){
        this.numeroConta = numeroConta;
    }

    public void setAgencia(int agencia){
        this.agencia = agencia;
    }

    public void setSaldo(double valor){
        this.saldo = saldo;
    }


    public String  getTitular(){
        System.out.printf("Titular : %s\n",titular);
        return this.titular;
    }

    public int getNumeroConta() {
        System.out.printf("\nNúmero da Conta : %s\n",numeroConta);
        return this.numeroConta;
    }

    public int getAgencia(){
        System.out.printf("\nAgência  : %s\n",agencia);
        return this.agencia;
    }

    public double getSaldo(){
        System.out.printf("   Seu saldo atual é : R$ %.0f \n",saldo);
        return  this.saldo;
    }



}
