import java.util.Arrays;

public class vetores04 {
    public static void main(String[] args) {
        
        int vet[] = {3, 7, 6, 1, 9, 4, 2};

        for (int valor: vet) {
            System.out.print( " " + valor);
        }
        System.out.println(""); // PARA PULAR UMA LINHA NO TERMINAL.
        int posicao = Arrays.binarySearch(vet, 1);
        /* Arrays.binarySearch() É UTILIZADO PARA ENCONTRAR A 
        POSIÇÃO DE UM VALOR DENTRO DE UM VETOR. */ 
        System.out.println("Encontrei o valor na posição " + posicao);
    }
}
