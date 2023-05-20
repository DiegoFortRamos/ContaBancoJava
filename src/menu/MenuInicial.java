package menu;

import dgBank.Conta;

import java.util.Scanner;



public class MenuInicial extends Conta {


    public void funcionalidadeBanco(Conta conta, Conta destino, double valor){
        System.out.println("================================\n");
        System.out.println("           DG BANK              \n");
        System.out.println("================================\n");

        Scanner entrada = new Scanner(System.in);


        System.out.printf("Bem vindo senhor %s /n",conta.getNome());
        System.out.println("Escolha uma opção \n");
        System.out.println("[1] Entrar [2] Sair");

        int opcao = entrada.nextInt();


           while (true){
               if (opcao == 1){
                   System.out.println("Escolha uma ação  : \n ");
                   System.out.println("[1] Sacar [2] Trasferir  [3] Depositar [4] Ver saldo");
                   int acao = entrada.nextInt();

                   if (acao == 1){
                       System.out.println("SACANDO......");
                       conta.saca(valor);

                   }else if (acao == 2){
                       System.out.println("Transferindo......");
                       conta.transfere(valor,destino);
                   }else if (acao == 3){
                       System.out.println("Depositando");
                       conta.deposita(valor);
                   }else if (acao == 4 ){
                       conta.getSaldo();
                   } else{
                       System.out.println("Valor invalido!!");
                   }
                   System.out.println("Deseja Fazer outra transação  [1] Continuar  [2] Sair : ");
                   int transacao = entrada.nextInt();
                   if(transacao == 1){
                       continue;
                   }else if(opcao ==2) {
                       break;
                   }else {
                       System.out.println("Digite uma opção valida!!");
                   }

               }else if (opcao ==2){
                   System.out.println("Encerrando Operação.... ");
                   break;
               }else {
                   System.out.println("Digite uma opção valida!!!");
               }
           }


    }
}
