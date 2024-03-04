package javaPoo;

public class aula01 {
    
    public static void main(String[] args) {
        
        caneta c1 = new caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampar();
        c1.rabiscar();
        c1.status();

        caneta c2 = new caneta();
        c2.modelo = "Bic";
        c2.cor = "Preta";
        c2.destampar();
        c2.status();
        c2.rabiscar(); 
    }
}
