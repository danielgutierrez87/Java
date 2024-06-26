/* Escreva um algoritmo que procure por um determinado elemento em um vetor e
imprima quantas vezes ele aparece no vetor (caso ele esteja no vetor). Seu
algoritmo deve, inicialmente, ler os valores e armazená-los em um vetor de 16
posições. */

import java.util.Scanner;

public class BuscaElemento {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando o vetor de 16 posições
        int[] vetor = new int[16];

        // Lendo os valores para preencher o vetor
        System.out.println("Digite os valores para preencher o vetor de 16 posições:");
        for (int i = 0; i < 16; i++) {
            System.out.print("Posição " + i + ": ");
            vetor[i] = scanner.nextInt();
        }

        // Pedindo ao usuário o elemento a ser procurado
        System.out.print("Digite o elemento que deseja buscar no vetor: ");
        int elementoBusca = scanner.nextInt();

        // Contando quantas vezes o elemento aparece no vetor
        int contador = 0;
        for (int i = 0; i < 16; i++) {
            if (vetor[i] == elementoBusca) {
                contador++;
            }
        }

        // Exibindo o resultado
        if (contador > 0) {
            System.out.println("O elemento " + elementoBusca + " aparece " + contador + " vezes no vetor.");
        } else {
            System.out.println("O elemento " + elementoBusca + " não foi encontrado no vetor.");
        }

        scanner.close();
    }
}