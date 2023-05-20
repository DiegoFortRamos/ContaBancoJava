package dgBank;

public class Conta extends Cliente {

    private String titular;
    private int numeroConta;
    private int agencia;
    private  double saldo = 100;


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
        System.out.printf("titular : %s",titular);
        return this.titular;
    }

    public int getNumeroConta() {
        return this.numeroConta;
    }

    public int getAgencia(){
        return this.agencia;
    }

    public double getSaldo(){
        System.out.printf("   Seu saldo atual é : R$ %.0f \n",saldo);
        return  this.saldo;
    }


   public void deposita(double valor){
        if (valor < 0) {
            System.out.println("Valor não permitido!!");
        }else{
            this.saldo += valor;
            this.getSaldo();

        }
    }


   public void saca(double valor ){
        if(valor < 0 ){
            System.out.println("Valor não permitido!!");
        }else if (valor <= this.saldo) {
            this.saldo -= valor;
            this.getSaldo();

        }else{
            System.out.println("Valor insuficiente");
        }
    }

   public void transfere(double valor , Conta destino){
        if(valor <= this.saldo){
            this.saldo -= valor;
            destino.deposita(valor);
            this.getTitular();
            this.getSaldo();
            destino.getTitular();
            destino.getSaldo();
        }else if (valor > this.saldo) {
            System.out.println("Saldo insuficiente");
        }
    }
}
