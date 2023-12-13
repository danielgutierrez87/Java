public class heranca00 {
    public static void main (String[] args) {
        Cachorro rambo = new Cachorro();
        rambo.fazBarulho();
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
}

class Cachorro extends Animal {
    public Cachorro() {
        this. onomatopeia = "auau";
    } 
}
