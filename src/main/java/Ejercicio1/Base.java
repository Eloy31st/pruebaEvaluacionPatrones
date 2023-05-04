package Ejercicio1;

public class Base {
    private String nombre;
    private int numAmbulancias;
    private double tiempoAsistencia;

    public Base(String nombre, int numAmbulancias, double tiempoAsistencia){
        this.nombre = nombre;
        this.numAmbulancias = numAmbulancias;
        this.tiempoAsistencia = tiempoAsistencia;
    }

    public void mostrar(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Numero de ambulancias: " + this.numAmbulancias);
        System.out.println("Tiempo de asistencia: " + this.tiempoAsistencia);
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumAmbulancias() {
        return numAmbulancias;
    }

    public double getTiempoAsistencia() {
        return tiempoAsistencia;
    }
}
