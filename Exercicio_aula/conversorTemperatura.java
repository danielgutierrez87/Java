/* Um canal de notícias internacionais, previa temperatura máxima para Brasília de 85
graus Farenheit. Escrever um programa que lhe permita converter esta temperatura
(e qualquer outra) para graus Celsius, sabendo que a relação entre elas é C=5/9*(F–
32). */

import java.util.Scanner;

public class conversorTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura da temperatura em Fahrenheit
        System.out.println("Digite a temperatura em Fahrenheit:");
        double temperaturaFahrenheit = scanner.nextDouble();

        // Conversão para Celsius
        double temperaturaCelsius = (5.0 / 9.0) * (temperaturaFahrenheit - 32);

        // Exibição do resultado
        System.out.println("A temperatura em Celsius é: " + temperaturaCelsius + "°C");

        scanner.close();
    }
}