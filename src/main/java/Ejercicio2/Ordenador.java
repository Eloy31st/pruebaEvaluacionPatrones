package Ejercicio2;

import java.util.ArrayList;

public class Ordenador {
    private UnidadCentral unidadCentral;
    private DispositivoSalida dispositivoSalida;
    private DispositivoEntrada dispositivoEntrada;
    private ArrayList<DispositivoSalida> dispositivosSalida;
    private ArrayList<DispositivoEntrada> dispositivosEntrada;

    public Ordenador(UnidadCentral unidadCentral, DispositivoSalida dispositivoSalida, DispositivoEntrada dispositivoEntrada) {
        this.unidadCentral = unidadCentral;
        this.dispositivoSalida = dispositivoSalida;
        this.dispositivoEntrada = dispositivoEntrada;
    }
    public double getPrice(){
        double price = 0;
        price += this.unidadCentral.getPrice();
        for(DispositivoEntrada dispositivoEntrada : dispositivosEntrada){
            price += dispositivoEntrada.getPrice();
        }
        for(DispositivoSalida dispositivoSalida : dispositivosSalida){
            price += dispositivoSalida.getPrice();
        }
        return price;
    }

}
