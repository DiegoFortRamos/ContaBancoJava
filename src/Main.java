import  dgBank.Conta;
import menu.CadastraFuncionario;
import menu.MenuInicial;

public class Main {
    public static void main(String[] args) {
        Conta conta01 = new Conta();
        CadastraFuncionario cadastraFuncionario = new CadastraFuncionario();
        cadastraFuncionario.cadastraFuncionario(conta01,"Diego","Rj","1254254125","Dev",
                1998,1,01);




    }
}