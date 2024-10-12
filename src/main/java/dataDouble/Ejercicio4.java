package dataDouble;

import utilities.Utiles;

import java.util.Arrays;

public class Ejercicio4 {
    public static void main(String[] args) {
        final var listaArray = Utiles.generarArrayDoubleAletario(20, 1, 40);
        System.out.printf("Números Aleatorios          : %s%n", Arrays.toString(listaArray));
        ordenarNumeros(listaArray);
        imprimirResultado(listaArray);
    }

    //Metodo de Ordenamiento de tipo double
    private static void ordenarNumeros(double[] array) {
        final var n = array.length;
        for (var i = 0; i < n; i++) {
            for (var j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    final var temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    //Imprimir valores ordenados de tipo double
    private static void imprimirResultado(double[] ordenar) {
        System.out.printf("Ordenamiento de los números : %s%n", Arrays.toString(ordenar));
    }
}
