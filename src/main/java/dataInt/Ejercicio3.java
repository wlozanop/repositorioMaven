package dataInt;

import java.util.Arrays;

public class Ejercicio3 {
    public static void main(String[] args) {
        final var listaNumeros = new int[10];
        Utiles.generarNumeros(listaNumeros);
        valoresAleatorias(listaNumeros);
        muestraSumaTotal(listaNumeros);
    }

    //Metodo que hace la suma total
    public static void muestraSumaTotal(int[] nuevaListaArray) {
        var suma = 0;
        final var n = nuevaListaArray.length;
        for (int i = 0; i < n; i++) {
            suma += nuevaListaArray[i];
        }
        System.out.printf("La suma total es: %s%n", suma);
    }

    //Imprimir Valores Aleatorios
    private static void valoresAleatorias(int[] primerArray) {
        System.out.printf("Ver valores Aleatorios: %s%n", Arrays.toString(primerArray));
    }
}
