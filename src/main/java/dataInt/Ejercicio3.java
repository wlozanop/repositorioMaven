package dataInt;

import java.util.Arrays;

public class Ejercicio3 {
    public static void main(String[] args) {
        final var listaArray = Utiles.aletarioArray(10, 1, 40);
        imprimirValoresAleatorias(listaArray);
        mostrarSumaTotal(listaArray);
    }

    //Metodo que hace la suma total
    public static void mostrarSumaTotal(int[] nuevaListaArray) {
        var suma = 0;
        final var n = nuevaListaArray.length;
        for (int i = 0; i < n; i++) {
            suma += nuevaListaArray[i];
        }
        System.out.printf("La suma es         : %s%n", suma);
    }

    //Imprimir Valores Aleatorios
    private static void imprimirValoresAleatorias(int[] primerArray) {
        System.out.printf("Números Aleatorios : %s%n", Arrays.toString(primerArray));
    }
}
