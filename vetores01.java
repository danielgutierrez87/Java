public class vetores01 {
    public static void main(String[] args) {
        
        int n[] = {3,2,8,7,5,4}; // FORMA DE VETOR SIMPLIFICADO 
        System.out.println("Total de casas de N é: " + n.length);
        // n.length identifica o tamanho do vetor.
        for (int c=0; c<=n.length-1; c++) {
            // n.length-1 está substituindo o número 5 que poderia ser usado.
            System.out.println("Na posição " + c+ " temos o valor " + n[c]); 
            // n[c] é n na posição c.
        }
    }
}
/* VETOR FEITO DE FORMA NÃO SIMPLIFICADA:
 * int n[] = new int[6];
 * n[0] = 3;
 * n[1] = 2;
 * n[2] = 8;
 * n[3] = 7;
 * n[4] = 5;
 * n[5] = 4; */