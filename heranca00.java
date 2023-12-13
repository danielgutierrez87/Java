public class heranca00 {
    public static void main (String[] args) {
        Cachorro rambo = new Cachorro();
        rambo.fazBarulho();
        rambo.descrever();
    }
}

abstract class Animal {
    String onomatopeia; 
    String cor;
    String raca;
    Integer idade;  

    public void fazBarulho() {
        System.out.println(this.onomatopeia);
    }

    public void descrever() {
        System.out.println("Raça: " + this.raca);
        System.out.println("Cor: " + this.cor);
        System.out.println("Idade: " + this.idade);
    }
}

class Cachorro extends Animal {
    public Cachorro() {
        this.onomatopeia = "auau";
        this.raca = "vira-lata";
        this.cor = "caramelo";
        this.idade = 2;

    } 
}
