package Ejercicio1;

import Ejercicio1.Director.Director;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        BaseBuilderSimple baseBuilderSimple = new BaseBuilderSimple();
        BaseBuilderConjunto baseBuilderConjunto = new BaseBuilderConjunto();
        director.construirBaseSimple(baseBuilderSimple, "Base 1", 2, 3.5);
        director.construirBaseConjunto(baseBuilderConjunto, "Conjunto 1",  3, 4.5);
        Base baseSimple = baseBuilderSimple.getBase();
        Base baseConjunto = baseBuilderConjunto.getBase();
        baseSimple.mostrar();
        baseConjunto.mostrar();
    }
}
