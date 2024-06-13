/*Faça um algoritmo para ler: número da conta do cliente, saldo, débito e crédito.
Após, calcular e escrever o saldo atual (saldo atual = saldo - débito + crédito).
Também testar se saldo atual for maior ou igual a zero escrever a mensagem 'Saldo
Positivo', senão escrever a mensagem 'Saldo Negativo'. */

import java.util.Scanner;

public class contaCorrente {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite o número da conta corrente: ");
        int numeroConta = scan.nextInt();
        
        System.out.print("Digite o saldo da conta: ");
        double saldo = scan.nextDouble();
        
        System.out.print("Digite o valor do débito: ");
        double debito = scan.nextDouble();
        
        System.out.print("Digite o valor do crédito: ");
        double credito = scan.nextDouble();
        
        // Cálculo do saldo atual
        double saldoAtual = saldo - debito + credito;
        
        // Saída de dados
        System.out.printf("Número da Conta: %d%n", numeroConta);
        System.out.printf("Saldo Atual: R$ %.2f%n", saldoAtual);
        
        if (saldoAtual >= 0) {
            System.out.println("Saldo Positivo");
        } else {
            System.out.println("Saldo Negativo");
        }
        
        scan.close();
    }

}
    

