package dataInt;

import java.util.List;
import java.util.Random;

public class Ejercicio3 {
    public static void main(String[] args) {
        final var listaArray = Utiles.generarListaNumeros(10, 1, 40, new Random());
        valoresAleatorias(listaArray);
        muestraSumaTotal(listaArray);
    }

    //Metodo que hace la suma total
    public static void muestraSumaTotal(List<Integer> nuevaListaArray) {
        var suma = 0;
        final var n = nuevaListaArray.size();
        for (int i = 0; i < n; i++) {
            suma += nuevaListaArray.get(i);
        }
        System.out.printf("La suma es         : %s%n", suma);
    }

    //Imprimir Valores Aleatorios
    private static void valoresAleatorias(List<Integer> primerArray) {
        System.out.printf("Números Aleatorios : %s%n", primerArray);
    }
}
