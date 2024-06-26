/* Ler um vetor Q de 20 posições (aceitar somente números positivos). Escrever a
seguir o valor do maior elemento de Q e a respectiva posição que ele ocupa no vetor.
Escrever o menor elemento do vetor e a respectiva posição dele nesse vetor. */

import java.util.Scanner;

public class MaiorMenorElemento {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando o vetor Q com 20 posições
        double[] Q = new double[20];

        // Leitura dos valores para o vetor Q
        System.out.println("Digite os 20 números positivos para preencher o vetor Q:");
        for (int i = 0; i < 20; i++) {
            do {
                System.out.print("Q[" + i + "]: ");
                Q[i] = scanner.nextDouble();
                if (Q[i] <= 0) {
                    System.out.println("Valor inválido. Digite apenas números positivos.");
                }
            } while (Q[i] <= 0);
        }

        // Encontrar o maior elemento e sua posição
        double maiorElemento = Q[0];
        int posicaoMaior = 0;
        for (int i = 1; i < 20; i++) {
            if (Q[i] > maiorElemento) {
                maiorElemento = Q[i];
                posicaoMaior = i;
            }
        }

        // Encontrar o menor elemento e sua posição
        double menorElemento = Q[0];
        int posicaoMenor = 0;
        for (int i = 1; i < 20; i++) {
            if (Q[i] < menorElemento) {
                menorElemento = Q[i];
                posicaoMenor = i;
            }
        }

        // Exibir os resultados
        System.out.println("\nResultados:");
        System.out.println("Maior elemento de Q: " + maiorElemento + ", na posição " + posicaoMaior);
        System.out.println("Menor elemento de Q: " + menorElemento + ", na posição " + posicaoMenor);

        scanner.close();
    }
}