package dataInt;

import java.util.Arrays;

public class Ejercicio1 {
    public static void main(String[] args) {
        final var listaArray = new int[50];
        Utiles.numerosGrandes(listaArray);
        valoresAleatorias(listaArray);
        resultadoMultiplicado(nuevoArray(listaArray));
    }

    //Metodo que Multiplica los valores Aleatorios
    public static int[] nuevoArray(int[] nuevaListaArray) {
        final var n = nuevaListaArray.length;
        for (int i = 0; i < n; i++) {
            nuevaListaArray[i] = nuevaListaArray[i] * 2;
        }
        return nuevaListaArray;
    }

    //Imprimir Valores Aleatorios
    private static void valoresAleatorias(int[] primerArray) {
        System.out.printf("Ver valores aleatorios: %s%n", Arrays.toString(primerArray));
    }

    //Imprimir Valores Multiplicados
    private static void resultadoMultiplicado(int[] resultadoArray) {
        System.out.printf("Ver resultado multiplicado: %s%n", Arrays.toString(resultadoArray));
    }
}
