package dataInt;

import java.util.Arrays;

public class Ejercicio2 {
    public static void main(String[] args) {
        var array = new int[20];
        final var n = array.length;
        Utiles.generarNumeros(array);
        System.out.printf("Lista aleatoria: %s%n", Arrays.toString(array));
        for (var i = 0; i < n; i++) {
            for (var j = 0; j < n; j++) {
                if (i != j) {
                    //VALIDAMOS SI EL VALOR DE LA PRIMERA POSICIÓN ES IGUAL AL DE LA SIGUIENTE POSICIÓN
                    if (array[i] == array[j]) {
                        //REEMPLAZAMOS EL DUPLICADO ENCONTRADO A "0"
                        array[i] = 0;
                    }
                }
            }
        }
        mostrarResultado(array);
    }

    //Método para filtrar los números unicos de los 0 (Antes eran números duplicados)
    private static void mostrarResultado(int[] array) {
        Arrays.sort(array);
        for (var numero : array) {
            //CONDICIONAL PARA FILTRAR LOS NÚMEROS UNICOS DE LOS "0"
            if (numero != 0) {
                System.out.printf("Número: %s%n", numero);
            }
        }
    }
}
