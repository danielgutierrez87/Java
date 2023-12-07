public class aula02 {
    public static void main (String[] args) {
        Pernilongo jorge = new Pernilongo();
        jorge.atrapalharSono(); 
    }
}

class Pernilongo {
    String onomatopeia = "píííííí";
    public void atrapalharSono() {
        System.out.println(this.onomatopeia);
    }
}


