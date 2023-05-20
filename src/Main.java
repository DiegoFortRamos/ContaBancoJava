import  dgBank.Conta;
import menu.MenuInicial;

public class Main {
    public static void main(String[] args) {
        Conta conta01 = new Conta();
        conta01.setNome("Diego");
        conta01.setTitular("Diego Ramos");

        Conta conta02 = new Conta();
        conta02.setNome("Ana");

        MenuInicial menu = new MenuInicial();

        menu.funcionalidadeBanco(conta01,conta02,50);


    }
}