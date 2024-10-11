package dataInt;

import java.util.List;
import java.util.Random;

public class Ejercicio4 {
    public static void main(String[] args) {
        final var listaArray = Utiles.generarListaNumeros(15, 1, 30, new Random());
        System.out.printf("Números Aleatorios: %s%n", listaArray);
        ordenarNumeros(listaArray);
        mostrarResultado(listaArray);
    }

    //Metodo de Ordenamiento
    public static void ordenarNumeros(List<Integer> array) {
        final var n = array.size();
        for (var i = 0; i < n; i++) {
            for (var j = 0; j < n - i - 1; j++) {
                if (array.get(j) > array.get(j + 1)) {
                    final var temp = array.get(j);
                    array.set(j, array.get(j + 1));
                    array.set(j + 1, temp);
                }
            }
        }
    }

    //Imprimir valores ordenados
    private static void mostrarResultado(List<Integer> ordenar) {
        System.out.printf("Ordenamiento de los números: %s%n", ordenar);
    }
}
