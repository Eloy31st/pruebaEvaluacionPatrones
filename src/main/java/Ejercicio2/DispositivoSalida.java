package Ejercicio2;

public interface DispositivoSalida {
    void impresoraLaser (String fabricante, String modelo, double precio, int[] puertos, String cartucho);
    void impresoraTinta (String fabricante, String modelo, double precio, int[] puertos, String cartucho, int numPaginas);
    void pantalla (String fabricante, String modelo, double precio, int[] puertos);
}
