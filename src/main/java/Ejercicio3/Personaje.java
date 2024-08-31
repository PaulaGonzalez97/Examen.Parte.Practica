package Ejercicio3;

public abstract class Personaje {

    private int salud;

    public Personaje(int salud) {
        this.salud = salud;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public abstract void Entrenar();
}
