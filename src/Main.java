import  conta.Conta;
public class Main {
    public static void main(String[] args) {
        Conta diego = new Conta();
        diego.setTitular("Diego Ramos");
        diego.setNumeroConta(1);
        diego.setAgencia(01);
        diego.deposita(100);


        Conta ana = new Conta();
        ana.setTitular("Ana Carolina");
        ana.setNumeroConta(1);
        ana.setAgencia(01);
        ana.deposita(100);


        diego.saca(50);
        ana.transfere(50,diego);
        diego.getSaldo();
    }
}