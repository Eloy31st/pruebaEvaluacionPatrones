package Ejercicio1;

public class BaseBuilderSimple implements builder{
    private String nombre;
    private int numAmbulancias;
    private double tiempoAsistencia;

    @Override
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    @Override
    public void setNumAmbulancias(int numAmbulancias){
        this.numAmbulancias = numAmbulancias;
    }

    @Override
    public void setTiempoAsistencia(double tiempoAsistencia){
        this.tiempoAsistencia = tiempoAsistencia;
    }


    public Base getBase(){
        return new Base(nombre, numAmbulancias, tiempoAsistencia);
    }
}
