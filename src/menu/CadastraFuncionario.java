package menu;

import dgBank.Conta;

public class CadastraFuncionario extends MenuInicial {


    public void cadastraFuncionario(Conta conta, String nome, String endereco, String cpf, String profissao,
                                    int anoNascimento, int numeroConta, int agencia){
        conta.setTitular(nome);
        conta.setNome(nome);
        conta.setEndereco(endereco);
        conta.setCpf(cpf);
        conta.setProfissao(profissao);
        conta.setAnoNascimento(anoNascimento);
        conta.setNumeroConta(numeroConta);
        conta.setAgencia(agencia);
        conta.mostraDadosCliente();




    }
}
