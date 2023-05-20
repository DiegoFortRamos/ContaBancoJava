import  dgBank.Conta;
import menu.CadastraFuncionario;
import menu.MenuInicial;

public class Main {
    public static void main(String[] args) {
        Conta conta01 = new Conta();
        CadastraFuncionario cadastraFuncionario = new CadastraFuncionario();
        cadastraFuncionario.cadastraFuncionario(conta01,"Diego","Rj","1254254125","Dev",
                1998,1,01);

        Conta conta02 = new Conta();
        cadastraFuncionario.cadastraFuncionario(conta02,"Ana","Rj","7425412542","Contadora"
                ,1998,2,01);


        MenuInicial menuInicial = new MenuInicial();

        menuInicial.funcionalidadeBanco(conta01,conta02);


    }
}