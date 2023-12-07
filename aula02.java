public class aula02 {
    public static void main (String[] args) {
        Pernilongo jorge = new Pernilongo();
        jorge.atrapalharSono(); 
        Cachorro cleyton = new Cachorro();
        cleyton.atrapalhaSono();
    }
}

class Pernilongo {
    String onomatopeia = "píííííí";
    public void atrapalharSono() {
        System.out.println(this.onomatopeia);
    }
}

class Cachorro {
    String onomatopeia = "auauau";
    public void atrapalhaSono() {
        System.out.println(this.onomatopeia);
    }
}


