package Ejercicio1;

import java.util.ArrayList;

public class BaseBuilderConjunto implements builder{
    private String nombre;
    private int numAmbulancias;
    private double tiempoAsistencia;
    private ArrayList<Base> bases;
    private Base base;

    @Override
    public void setNombre(String nombre){
        this.nombre = nombre;
        this.bases = new ArrayList<Base>();
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
        int numAmbulancias = 0;
        double tiempoAsistencia = 0;
        bases.add(new Base(nombre, this.numAmbulancias, this.tiempoAsistencia));
        for(Base base : bases){
            numAmbulancias += base.getNumAmbulancias();
            tiempoAsistencia += base.getTiempoAsistencia();
        }
        tiempoAsistencia = tiempoAsistencia / bases.size();
        return this.base = new Base("Majadahonda", numAmbulancias, tiempoAsistencia);

    }
    public void mostrar(){
        System.out.println("Nombre: " + this.base.getNombre());
        System.out.println("Numero de ambulancias: " + this.base.getNumAmbulancias());
        System.out.println("Tiempo de asistencia: " + this.base.getTiempoAsistencia());
    }

}
