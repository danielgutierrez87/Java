/* Em uma danceteria o preço da entrada sofre variações. Segunda, Terça e Quinta (2,
3 e 5), ela oferece um desconto de 25% do preço normal de entrada. Nos dias de
músicas ao vivo, o preço da entrada ainda é acrescido em 15% em relação ao preço
normal da entrada. Fazer um programa que leia o preço normal da entrada, o dia da
semana (1a 7) e se é dia de música ao vivo (1) ou não (2). Calcular e imprimir o
preço final que deverá ser pago pela entrada. */

import java.util.Scanner;

public class danceteria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite o preço normal da entrada: ");
        double precoNormal = (Double.parseDouble(scanner.nextLine()));
        
        System.out.print("Digite o dia da semana: ");
        String diaSemana = scanner.nextLine();
        
        System.out.print("É dia de música ao vivo? (1 - Sim / 2 - Não): ");
        int musicaAoVivo = scanner.nextInt();
        
        // Cálculo do preço final
        double precoFinal = precoNormal;

        // Verifica se o dia é Segunda, Terça ou Quinta para aplicar o desconto
        if (diaSemana.equals("segunda") || diaSemana.equals("terca")  
        || diaSemana.equals("quinta")) {
            precoFinal = precoFinal * 0.75; // Aplicando desconto de 25%
        }
        
        // Verifica se é dia de música ao vivo para aplicar o acréscimo
        if (musicaAoVivo == 1) {
            precoFinal = precoFinal * 1.15; // Aplicando acréscimo de 15%
        }

        // Saída de dados
        System.out.printf("O preço final da entrada é: R$ %.2f%n", precoFinal);
        
        scanner.close();
    }
}
