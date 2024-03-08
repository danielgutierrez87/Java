public class calculadora1 {
    public static void main(String[] args) {
        
        double resultado = 0;
        double n1 = Double.parseDouble(args[0]);
        double n2 = Double.parseDouble(args[2]);
        String operador = args[1];

        Calcular calc = new Calcular(n1, n2);

        if (operador.equals("+")) {
            resultado = calc.somar();
        } else 
        if (operador.equals("-")) {
            resultado = calc.subtrair();
        } else 
        if (operador.equals("x")) {
            resultado = calc.multiplicar();
        } else
        if (operador.equals("/")) {
            resultado = calc.dividir();
        }

        System.out.println(resultado); 
    }
}

class Calcular {
    private double numero1;
    private double numero2;

    Calcular(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public double somar() {
        return this.numero1 + this.numero2;
    }

    public double subtrair() {
        return this.numero1 - this.numero2;
    }

    public double multiplicar() {
        return this.numero1 * this.numero2;
    }

    public double dividir() {
        return this.numero1 / this.numero2;
    }

}
