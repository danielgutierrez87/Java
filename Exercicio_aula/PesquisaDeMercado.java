/* Uma certa firma fez uma pesquisa de mercado para saber se as pessoas gostaram
ou não de um novo produto lançado no mercado. Para isso, forneceu o sexo do
entrevistado e sua resposta (sim ou não). Sabendo-se que foram entrevistadas 10
pessoas, fazer um programa que calcule e escreva: O número de pessoas que
responderam sim O número de pessoas que responderam não A porcentagem de
pessoas do sexo feminino que responderam sim A porcentagem de pessoas do sexo
masculino que responderam não. */

import java.util.Scanner;

public class PesquisaDeMercado {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pessoasSim = 0;
        int pessoasNao = 0;
        int mulheresSim = 0;
        int homensNao = 0;
        int totalMulheres = 0;
        int totalHomens = 0;

        // Loop para entrevistar 10 pessoas
        for (int i = 1; i <= 10; i++) {
            System.out.println("Entrevista " + i);
            System.out.print("Informe o sexo (F/M): ");
            char sexo = scanner.next().toUpperCase().charAt(0);
            System.out.print("Resposta (sim ou nao): ");
            String resposta = scanner.next().toLowerCase();

            // Contagem de respostas sim e não
            if (resposta.equals("sim")) {
                pessoasSim++;
                if (sexo == 'F') {
                    mulheresSim++;
                }
            } else if (resposta.equals("nao")) {
                pessoasNao++;
                if (sexo == 'M') {
                    homensNao++;
                }
            }

            // Contagem total de mulheres e homens
            if (sexo == 'F') {
                totalMulheres++;
            } else if (sexo == 'M') {
                totalHomens++;
            }
        }

        // Calcular as porcentagens
        double porcentagemMulheresSim = (double) mulheresSim / totalMulheres * 100;
        double porcentagemHomensNao = (double) homensNao / totalHomens * 100;

        // Exibir os resultados
        System.out.println("\nResultados da Pesquisa:");
        System.out.println("Número de pessoas que responderam sim: " + pessoasSim);
        System.out.println("Número de pessoas que responderam não: " + pessoasNao);
        System.out.printf("Porcentagem de mulheres que responderam sim: %.2f%%\n", porcentagemMulheresSim);
        System.out.printf("Porcentagem de homens que responderam não: %.2f%%\n", porcentagemHomensNao);

        scanner.close();
    }
}