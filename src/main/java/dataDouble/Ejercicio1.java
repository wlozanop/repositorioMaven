package dataDouble;

import utilities.Utiles;

import java.util.List;

public class Ejercicio1 {
    public static void main(String[] args) {
        final var listaArray = Utiles.generarListaDoubleAleatario(50, 100, 1000);
        imprimirValoresAleatorias(listaArray);
        mostrarResultadoMultiplicado(multiplicarArray(listaArray));
    }

    //Metodo que divide los valores Aleatorios tipo double
    private static List<Double> multiplicarArray(List<Double> nuevaListaArray) {
        final var n = nuevaListaArray.size();
        for (var i = 0; i < n; i++) {
            nuevaListaArray.set(i, nuevaListaArray.get(i) / 1000);
        }
        return nuevaListaArray;
    }

    //Imprimir Valores Aleatorios
    private static void imprimirValoresAleatorias(List<Double> primerArray) {
        System.out.printf("Ver valores aleatorios     : %s%n", primerArray);
    }

    //Imprimir resultado de la division
    private static void mostrarResultadoMultiplicado(List<Double> resultadoArray) {
        System.out.printf("Ver resultado multiplicado : %s%n", resultadoArray);
    }
}
