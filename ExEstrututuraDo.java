import java.util.Scanner;

public class ExEstrututuraDo {
    public static void main(String[] args) {
        
        int n, s=0;
        String resp;
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("Digite um número: ");
            n = teclado.nextInt();
            s += n; // s = s + n;
            System.out.println("Quer continuar? [S/N] ");
            resp = teclado.next();
        } while (resp.equals("S"));
        System.out.println("A soma de todos os valor é " + s);
    }
}
