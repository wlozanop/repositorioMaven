package dataDouble;

import utilities.Utiles;

import java.util.Arrays;

public class Ejercicio3 {
    public static void main(String[] args) {
        final var listaArray = Utiles.generarArrayDoubleAletario(10, 1, 40);
        imprimirValoresAleatorias(listaArray);
        imprimirSuma(mostrarSumaTotal(listaArray));
    }

    //Metodo que hace la suma total tipo double
    private static double mostrarSumaTotal(double[] nuevaListaArray) {
        var suma = 0.0;
        final var n = nuevaListaArray.length;
        for (var i = 0; i < n; i++) {
            suma += nuevaListaArray[i];
        }
        return suma;
    }

    //Imprimir números aleatorios tipo double
    private static void imprimirValoresAleatorias(double[] primerArray) {
        System.out.printf("Números Aleatorios : %s%n", Arrays.toString(primerArray));
    }

    //Imprimir resultado suma total tipo double
    private static void imprimirSuma(double resultado) {
        System.out.printf("La suma es         : %s%n", resultado);
    }
}
