package dataInt;

import utilities.Utiles;

import java.util.Arrays;

public class Ejercicio3 {
    public static void main(String[] args) {
        final var listaArray = Utiles.generarArrayIntAletario(10, 1, 40);
        imprimirValoresAleatorias(listaArray);
        imprimirSuma(mostrarSumaTotal(listaArray));
    }

    //Metodo que hace la suma total
    private static int mostrarSumaTotal(int[] nuevaListaArray) {
        var suma = 0;
        final var n = nuevaListaArray.length;
        for (var i = 0; i < n; i++) {
            suma += nuevaListaArray[i];
        }
        return suma;
    }

    //Imprimir valores aleatorios
    private static void imprimirValoresAleatorias(int[] primerArray) {
        System.out.printf("Números Aleatorios : %s%n", Arrays.toString(primerArray));
    }

    //Imprimir suma total
    private static void imprimirSuma(int resultado) {
        System.out.printf("La suma es         : %s%n", resultado);
    }
}
