/* A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que
trabalhar mais de 40 horas receberá hora extra, cujo cálculo é o valor da hora regular
com um acréscimo de 50%.Escreva um algoritmo que leia o número de horas
trabalhadas em um mês, o salário por hora e escreva o salário total do funcionário,
que deverá ser acrescido das horas extras, caso tenham sido trabalhadas(considere
que o mês possua 4 semanas exatas). */

import java.util.Scanner;

public class horasExtras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite o número de horas trabalhadas no mês: ");
        double horasTrabalhadasMes = scanner.nextDouble();
        
        System.out.print("Digite o salário por hora: ");
        double salarioPorHora = scanner.nextDouble();
        
        // Constantes
        int horasPorSemana = 40;
        int semanasPorMes = 4;
        int horasRegularesMes = horasPorSemana * semanasPorMes;
        
        // Cálculo de salário
        double salarioTotal;
        
        if (horasTrabalhadasMes > horasRegularesMes) {
            double horasExtras = horasTrabalhadasMes - horasRegularesMes;
            double salarioHorasExtras = horasExtras * salarioPorHora * 1.5;
            salarioTotal = (horasRegularesMes * salarioPorHora) + salarioHorasExtras;
        } else {
            salarioTotal = horasTrabalhadasMes * salarioPorHora;
        }
        
        // Saída de dados
        System.out.printf("O salário total do funcionário no mês é: R$ %.2f%n", salarioTotal);
        
        scanner.close();
    }
}
