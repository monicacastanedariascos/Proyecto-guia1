public class Proyectil {
    private float velocidad;
    private float angulo;

    public Proyectil(float velocidad, float angulo) {
        this.velocidad=velocidad;
        this.angulo=angulo;
    }

    public void setVelocidad(float velocidad){
        this.velocidad=velocidad;
    }
    public void setAngulo(float angulo){
        this.angulo=angulo;
    }
    public float getAngulo(){
        return angulo;
    }
    public float getVelocidad(){
        return velocidad;
    }

    @Override
    public String toString() {
        return "Proyectil{" +
                "velocidad=" + velocidad +
                ", angulo=" + angulo +
                '}';
    }
}
