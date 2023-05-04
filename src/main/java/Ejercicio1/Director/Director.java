package Ejercicio1.Director;

import Ejercicio1.builder;

public class Director {
    public void construirBaseSimple(builder builder, String nombre, int numAmbulancias, double tiempoAsistencia){
        builder.setNombre(nombre);
        builder.setNumAmbulancias(numAmbulancias);
        builder.setTiempoAsistencia(tiempoAsistencia);
    }
    public void construirBaseConjunto(builder builder, String nombre, int numAmbulancias, double tiempoAsistencia){
        builder.setNombre(nombre);
        builder.setNumAmbulancias(numAmbulancias);
        builder.setTiempoAsistencia(tiempoAsistencia);
    }
}
