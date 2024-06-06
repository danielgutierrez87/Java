/* Escreva um algoritmo para ler o número total de eleitores de um município, o
número de votos brancos, nulos e válidos. Calcular e escrever o percentual que cada
um representa em relação ao total de eleitores. */ 

import java.util.Scanner;

public class CalculadoraVotos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura do número total de eleitores
        System.out.println("Digite o número total de eleitores:");
        int totalEleitores = scanner.nextInt();

        // Leitura do número de votos brancos
        System.out.println("Digite o número de votos brancos:");
        int votosBrancos = scanner.nextInt();

        // Leitura do número de votos nulos
        System.out.println("Digite o número de votos nulos:");
        int votosNulos = scanner.nextInt();

        // Leitura do número de votos válidos
        System.out.println("Digite o número de votos válidos:");
        int votosValidos = scanner.nextInt();

        // Cálculo dos percentuais
        double percentualBrancos = votosBrancos / totalEleitores * 100;
        double percentualNulos = votosNulos / totalEleitores * 100;
        double percentualValidos = votosValidos / totalEleitores * 100;

        // Exibição dos resultados
        System.out.println("Percentual de votos brancos: " + percentualBrancos + "%");
        System.out.println("Percentual de votos nulos: " + percentualNulos + "%");
        System.out.println("Percentual de votos válidos: " + percentualValidos + "%");

        scanner.close();
    }
}
