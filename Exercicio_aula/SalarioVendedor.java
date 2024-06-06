/* Uma revendedora de carros usados paga a seus funcionários vendedores um salário
fixo por mês, mais uma comissão também fixa para cada carro vendido e mais 5% do
valor das vendas por ele efetuadas. Escrever um algoritmo que leia o número de
carros por ele vendidos, o valor total de suas vendas, o salário fixo e o valor que ele
recebe por carro vendido. Calcule e escreva o salário final do vendedor. */ 

import java.util.Scanner;

public class SalarioVendedor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura do número de carros vendidos
        System.out.println("Digite o número de carros vendidos:");
        int numCarrosVendidos = scanner.nextInt();

        // Leitura do valor total das vendas
        System.out.println("Digite o valor total das vendas:");
        double valorTotalVendas = scanner.nextDouble();

        // Leitura do salário fixo
        System.out.println("Digite o salário fixo:");
        double salarioFixo = scanner.nextDouble();

        // Leitura do valor por carro vendido
        System.out.println("Digite o valor por carro vendido:");
        double valorPorCarro = scanner.nextDouble();

        // Cálculo da comissão fixa por carro vendido
        double comissaoFixa = numCarrosVendidos * valorPorCarro;

        // Cálculo da comissão sobre o valor total de vendas
        double comissaoTotalVendas = valorTotalVendas * 0.05;

        // Cálculo do salário final
        double salarioFinal = salarioFixo + comissaoFixa + comissaoTotalVendas;

        // Exibição do salário final
        System.out.println("O salário final do vendedor é: R$" + salarioFinal);

        scanner.close();
    }
}
