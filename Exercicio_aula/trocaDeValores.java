/* Escreva um algoritmo que armazene o valor 10 em uma variável A e o valor 20 em
uma variável B. A seguir (utilizando apenas atribuições entre variáveis) troque os
seus conteúdos fazendo com que o valor que está em A passe para B e vice-versa.
Ao final, escrever os valores que ficaram armazenados nas variáveis. */

public class trocaDeValores {
    public static void main(String[] args) {
       
        double a = 10;
        double b = 20;
        double c;
        
        c = a;
        a = b;
        System.out.println("A variável A vale: " + b);
        b = c;        
        System.out.print("A variável B vale " + c);
    }
}