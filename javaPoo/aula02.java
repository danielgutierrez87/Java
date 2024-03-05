package javaPoo;

/*ESSE EXERCÍCIO AGORA É COM AS VISIBILIDADES NOS MÉTODOS E ATRIBUTOS */ 

public class aula02 {
    
    public static void main(String[] args) {
        
        caneta c1 = new caneta();
        c1.modelo = "Bic cristal";
        c1.cor = "Azul";
        // c1.ponta = 0.5f;
        c1.carga = 80;
        c1.tampada = true;
        c1.status();
        c1.rabiscar();
    }
}
