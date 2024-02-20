public class ExemploFormat {
    public static void main(String[] args) {
        String nome = "Daniel";
        float nota = 8.5f;
        System.out.format("A nota de %s é %.2f \n", nome, nota);
    }
}

// format substitui o printf! 
// %.2f = o 2 é o número de casas decimais.