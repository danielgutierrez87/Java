import java.util.Scanner;

public class ProgramaVoto {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Em que ano você nasceu?");
        int nasc = teclado.nextInt();
        int idade = 2024 - nasc;
        System.out.println("Sua idade é " + idade);
        if (idade < 16) {
            System.out.println("Não vota!");
        } else {
            if ((idade >= 16 && idade < 18) || (idade > 70)) {
                System.out.println("Voto opcional!");
            } else {
                System.out.println("Voto obrigatório!"); 
            }
        }
    }
}
