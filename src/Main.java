import  dgBank.Conta;
import menu.MenuInicial;

public class Main {
    public static void main(String[] args) {
        Conta conta01 = new Conta();
        conta01.setNome("Diego");
        conta01.setSaldo(1200);
        conta01.setTitular("Diego Ramos");

        Conta conta02 = new Conta();
        conta02.setNome("Ana");
        conta02.setSaldo(200);

        MenuInicial menu = new MenuInicial();

        menu.funcionalidadeBanco(conta01,conta02,500);
        conta01.getSaldo();

    }
}