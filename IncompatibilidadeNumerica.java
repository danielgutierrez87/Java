public class IncompatibilidadeNumerica {
    public static void main(String[] args) {
        
        int idade = 30;
        String valor = Integer.toString(idade);
        System.out.println(valor);
    }
}
/* Poderia apenas colocar String valor = idade, mas daria erro de compatibilidade.
 * Por isso usamos o método Integer.toString que converte um número inteiro em string
 * para resolver o problema de compatibilidade. E o contrário também é parecido, *como no exemplo abaixo: 
 * 
 * String valor = "30";
 * int idade = Integer.parseInt(valor);
 * System.out.println(idade); 
 */   