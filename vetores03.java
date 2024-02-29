// ESTRUTURA FOR IT

import java.util.Arrays;

public class vetores03 {
    public static void main(String[] args) {
        
        int num[] = {3, 5, 1, 8, 4};
        Arrays.sort(num); // PARA ORGANIZAR O VETOR EM ORDEM CRESCENTE.
        for (int valor: num) {
            System.out.println(valor);
        }
    }
}
