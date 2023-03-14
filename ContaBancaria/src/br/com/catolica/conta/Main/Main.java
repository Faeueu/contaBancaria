package br.com.catolica.conta.Main;
import br.com.catolica.conta.Model.ContaBancaria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ContaBancaria conta01 = new ContaBancaria(
                "Caixa",
                "Paulo",
                1234,
                123,
                123456789
        );
        conta01.valorEmConta = 1000;

        ContaBancaria conta02 = new ContaBancaria(
                "Caixa",
                "Rafael",
                4321,
                000,
                000000000);
        conta02.valorEmConta = 1000;

        ContaBancaria[] listaDeContas = new ContaBancaria[2];
        listaDeContas[0] = conta01;
        listaDeContas[1] = conta02;

        int agencia;
        int conta;
        long cpf;
        int opc;
        double transferir = 0;

        Scanner buscar = new Scanner(System.in);

        System.out.println("Qual o numero de sua agencia: ");
        agencia = buscar.nextInt();

        System.out.println("Qual o numero de sua conta: ");
        conta = buscar.nextInt();

        System.out.println("Qual o seu cpf: ");
        cpf = buscar.nextLong();

        if (listaDeContas[0].agencia == agencia){
            if(listaDeContas[0].conta == conta){
                if(listaDeContas[0].cpf == cpf){
                    System.out.println("[1]Transferir / [2]Depositar");
                    opc = buscar.nextInt();
                    if(opc == 1){
                        System.out.println("Qual o valor da transferencia?");
                        transferir = buscar.nextDouble();
                        conta01.depositar(transferir);
                        conta02.retirar(transferir);
                        System.out.printf("Valor em conta1 é de: %.2f\n" + conta01.valorEmConta);
                        System.out.printf("Novo valor em conta2 é de %.2f" + conta02.valorEmConta);
                    }
                    else if (opc == 2){
                        System.out.println("Qual o valor de deposito?");
                        transferir = buscar.nextDouble();
                        conta01.retirar(transferir);
                        conta02.depositar(transferir);
                        System.out.printf("Valor em conta1 é de: %.2f\n", conta01.valorEmConta);
                        System.out.printf("Novo valor em conta2 é de: %.2f", conta02.valorEmConta);
                    }
                }
            }
        }
        else if(listaDeContas[1].agencia == agencia){
            if(listaDeContas[1].conta == conta){
                if(listaDeContas[1].cpf == cpf){
                    System.out.println("[1]Transferir / [2]Depositar");
                    opc = buscar.nextInt();
                    if(opc == 1){
                        System.out.println("Qual o valor da transferencia?");
                        transferir = buscar.nextDouble();
                        conta02.depositar(transferir);
                        conta01.retirar(transferir);
                        System.out.printf("Valor em conta2 é de: %.2f\n", conta02.valorEmConta);
                        System.out.printf("Novo valor em conta1 é de: %.2f", conta01.valorEmConta);
                    }
                    else if (opc == 2){
                        System.out.println("Qual o valor de deposito?");
                        transferir = buscar.nextDouble();
                        conta02.retirar(transferir);
                        conta01.depositar(transferir);
                        System.out.printf("Valor em conta2 é de: %.2f\n", conta02.valorEmConta);
                        System.out.printf("Novo valor em conta1 é de: %.2f", conta01.valorEmConta);
                    }
                }
            }
        }
    }
}

