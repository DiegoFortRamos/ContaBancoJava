package conta;

public class Conta {

    private String titular;
    private int numeroConta;
    private int agencia;
    private  double saldo;


    public void setTitular(String titular){
        if(titular == ""){
            System.out.println("Por favor digite um número valido!!");
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


    public String  getTitular(String titular){
        return this.titular;
    }

    public int getNumeroConta() {
        return this.numeroConta;
    }

    public int getAgencia(){
        return this.agencia;
    }

    public double getSaldo(){
        System.out.printf(" %s  Seu saldo atual é : R$ %.0f \n",titular,saldo);
        return  this.saldo;
    }


   public void deposita(double valor){
        if (valor < 0) {
            System.out.println("Valor não permitido!!");
        }else{
            this.saldo += valor;
            getSaldo();
        }
    }


   public void saca(double valor ){
        if(valor < 0 ){
            System.out.println("Valor não permitido!!");
        }else if (valor <= this.saldo) {
            this.saldo -= valor;
            getSaldo();
        }else{
            System.out.println("Valor insuficiente");
        }
    }

   public void transfere(double valor , Conta destino){
        if(valor > this.saldo){
            System.out.println("Saldo insuficiente!!");
        }else {
            this.saldo -= valor;
            destino.deposita(valor);
            destino.getSaldo();
            getSaldo();
        }
    }
}
