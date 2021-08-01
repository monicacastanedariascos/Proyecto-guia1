public class Fraccionario {
    private int numerador;
    private int denominador;
//Este es el constructor
    public Fraccionario(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }
//Este es el constructor por defecto
    public Fraccionario() {
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    @Override
    public String toString() {
        return "Fraccionario{" +
                 numerador +
                "/" + denominador +
                '}';
    }
}
