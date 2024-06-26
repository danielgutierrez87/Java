/* Faça um algoritmo para ler dois vetores V1 e V2 de 15 números cada. Calcular e
escrever a quantidade de vezes que V1 e V2 possuem os mesmos números e nas
mesmas posições. */

import java.util.Scanner;

public class ComparacaoVetores {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando os vetores V1 e V2 com 15 posições cada
        int[] V1 = new int[15];
        int[] V2 = new int[15];

        // Lendo os valores para preencher o vetor V1
        System.out.println("Digite os valores para preencher o vetor V1 de 15 posições:");
        for (int i = 0; i < 15; i++) {
            System.out.print("V1[" + i + "]: ");
            V1[i] = scanner.nextInt();
        }

        // Lendo os valores para preencher o vetor V2
        System.out.println("\nDigite os valores para preencher o vetor V2 de 15 posições:");
        for (int i = 0; i < 15; i++) {
            System.out.print("V2[" + i + "]: ");
            V2[i] = scanner.nextInt();
        }

        // Contando quantas vezes V1 e V2 possuem os mesmos números na mesma posição
        int contador = 0;
        for (int i = 0; i < 15; i++) {
            if (V1[i] == V2[i]) {
                contador++;
            }
        }

        // Exibindo o resultado
        System.out.println("\nQuantidade de vezes que V1 e V2 possuem os mesmos números nas mesmas posições: " + contador);

        scanner.close();
    }
}
