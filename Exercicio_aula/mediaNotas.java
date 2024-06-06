/* O critério de notas semestrais numa faculdade consiste em dois bimestres, sendo
que, cada nota varia de 0 a 10 e tem os respectivos pesos 4 e 6. Elabore um
algoritmo que leia as notas bimestrais, calcule e escreva a media semestral. */

import java.util.Scanner;

public class mediaNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura das notas dos dois bimestres
        System.out.println("Digite a nota do primeiro bimestre:");
        double notaBimestre1 = scanner.nextDouble();

        System.out.println("Digite a nota do segundo bimestre:");
        double notaBimestre2 = scanner.nextDouble();

        // Cálculo da média semestral
        double mediaSemestral = (notaBimestre1 * 4 + notaBimestre2 * 6) / 10;

        // Exibição do resultado
        System.out.println("A média semestral é: " + mediaSemestral);

        scanner.close();
    }
}
