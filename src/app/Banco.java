package app;

import model.Conta;

import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {

        Conta conta = new Conta();

        conta.setNumeroConta(1234);
        conta.setAgencia("0001");
        conta.setTitular("Matheus");
        conta.setSaldo(100.0);

        Scanner entrada = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Exibir informações");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Sair");

            System.out.println("Escolha uma opção: ");
            int opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    conta.exibirInformacoes();
                    break;
                case 2: {
                    System.out.println("Digite o valor para depósito: ");
                    int valor = entrada.nextInt();
                    conta.depositar(valor);
                    break;
                }
                case 3: {
                    System.out.println("Digite o valor para saque: ");
                    int valor = entrada.nextInt();
                    conta.sacar(valor);
                    break;
                }
                case 4:
                    System.out.println("Saindo...");
                    return; // ou break fora do while
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}