package Ejercicio3;

public class Torre extends Personaje{

    private int nivel;

    public Torre(int salud, int nivel) {
        super(salud);
        this.nivel = nivel;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    @Override
    public void Entrenar() {
        this.nivel += 1;
    }
}
