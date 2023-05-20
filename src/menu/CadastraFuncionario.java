package menu;

import dgBank.Conta;

import java.util.Scanner;

public class CadastraFuncionario extends MenuInicial {


    public void cadastraFuncionario(Conta conta, String nome, String endereco, String cpf, String profissao,
                                    int anoNascimento, int numeroConta, int agencia){

        Scanner entrada = new Scanner(System.in);

        conta.setTitular(nome);
        conta.setNome(nome);
        conta.setEndereco(endereco);
        conta.setCpf(cpf);
        conta.setProfissao(profissao);
        conta.setAnoNascimento(anoNascimento);
        conta.setNumeroConta(numeroConta);
        conta.setAgencia(agencia);

        System.out.println("Deseja ver os Dados Cadastrados ? [1] Sim [2] Não");
        int opcao = entrada.nextInt();
        while (true) {
            if (opcao == 1){
                conta.mostraDadosCliente();
                break;
            } else if (opcao == 2) {
                break;
            }
        }




    }
}
