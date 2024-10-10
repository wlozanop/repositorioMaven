package dataInt;

import java.util.Arrays;

public class Ejercicio2 {
    public static void main(String[] args) {
        final var array = new String[]{"1", "2", "3", "3", "4", "4", "5", "5", "6", "8", "8"};
        for (var i = 0; i < array.length; i++) {
            for (var j = 0; j < array.length; j++) {
                if (i != j) {
                    if (array[i].equals(array[j])) {
                        array[i] = "";
                    }
                }
            }
        }
        mostrarResultado(array);
    }

    //Metodo para filtrar los numeros que no son repetidos
    private static void mostrarResultado(String[] array) {
        Arrays.sort(array);
        for (var numero : array) {
            if (!numero.isEmpty()) {
                System.out.printf("Ver resultado: %s%n", numero);
            }
        }
    }
}
