public class aula02 {
    public static void main (String[] args) {
        Animal jorge = new Animal("auauau");
        jorge.atrapalharSono();
        Animal gato = new Animal("miau miau");
        gato.atrapalharSono(); 
        Animal pinto = new Animal("piu piu");
        pinto.atrapalharSono();
        Animal vaca = new Animal("muuu");
        vaca.atrapalharSono();
        Animal papagaio = new Animal("loroooo");
        papagaio.atrapalharSono();
        Animal cabra = new Animal("béhhhhh");
        cabra.atrapalharSono();
        Animal passaro = new Animal("bentivii");
        passaro.atrapalharSono();
        Animal porco = new Animal("ronc ronc");
        porco.atrapalharSono();
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

