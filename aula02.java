public class aula02 {
    public static void main (String[] args) {
        Animal jorge = new Animal("auauau");
        jorge.atrapalharSono(); 
    }
}

class Animal {
    String onomatopeia;
    public void fazBarulho() {
        System.out.println(this.onomatopeia);
    }
    public void atrapalharSono() {
        for (int i = 0; i < 10; i++) {
            this.fazBarulho();
        }
    }
    public Animal (String som) {
        this.onomatopeia = som;
    }
}

