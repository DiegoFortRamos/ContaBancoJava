package menu;

import dgBank.Conta;

import java.util.Scanner;

public class MenuInicial {

    public void funcionalidadeBanco(Conta conta, Conta destino, double valor){
        System.out.println("================================\n");
        System.out.println("           DG BANK              \n");
        System.out.println("================================\n");

        Scanner entrada = new Scanner(System.in);

        System.out.printf("Bem vindo senhor %s /n",conta.getNome());
        System.out.println("Escolha uma opção \n");
        System.out.println("[1] Sacar [2] Transferir [3] Depositar [4] Ver saldo [5] Sair");

        int opcao = entrada.nextInt();

       while (true){
           if (opcao == 1){
               System.out.println("SACANDO......");
               conta.saca(valor);

           }else if (opcao == 2){
               System.out.println("Transferindo......");
               conta.transfere(valor,destino);
           }else if (opcao == 3){
               System.out.println("Depositando");
               conta.deposita(valor);
           }else if (opcao == 4 ){
               conta.getSaldo();
           }else if (opcao == 5){
               break;
           }else{
               System.out.println("Valor invalido!!");
           }
        }

    }
}
