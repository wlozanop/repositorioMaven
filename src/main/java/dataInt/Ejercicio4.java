package dataInt;

import com.github.javafaker.Faker;

import java.util.Arrays;

public class Ejercicio4 {
    public static void main(String[] args) {
        final var listaArray = new int[10];
        for (int i = 0; i <= listaArray.length - 1; i++) {
            listaArray[i] = new Faker().number().numberBetween(1, 50);
        }
        ordenarNumeros(listaArray);
        mostrarResultado(listaArray);
    }

    //Metodo de Ordenamiento
    public static void ordenarNumeros(int[] array) {
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

    //Imprimir Valores
    private static void mostrarResultado(int[] ordenar) {
        System.out.printf("Ordenar números aleatorios: %s", Arrays.toString(ordenar));
    }

}
