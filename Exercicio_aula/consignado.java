/* A prefeitura de Aparecida de Goiânia abriu uma linha de crédito para os funcionários
estatutários. O valor máximo da prestação não poderá ultrapassar 30% do salário
bruto. Fazer um algoritmo que permita entrar com o salário bruto e o valor da
prestação e informar se o empréstimo pode ou não ser concedido. */

import java.util.Scanner;

public class consignado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite o salário bruto: ");
        double salarioBruto = scanner.nextDouble();
        
        System.out.print("Digite o valor da prestação: ");
        double valorPrestacao = scanner.nextDouble();
        
        // Cálculo do valor máximo da prestação
        double valorMaximoPrestacao = salarioBruto * 0.30;
        
        // Verificação se o empréstimo pode ser concedido
        if (valorPrestacao <= valorMaximoPrestacao) {
            System.out.println("Empréstimo pode ser concedido.");
        } else {
            System.out.println("Empréstimo não pode ser concedido.");
        }
        
        scanner.close();
    }
}
    