package dataInt;

import com.github.javafaker.Faker;

import java.util.Arrays;

public class Ejercicio1 {
    public static void main(String[] args) {
        final var listaArray = new int[50];
        for (int i = 0; i <= listaArray.length - 1; i++) {
            listaArray[i] = new Faker().number().numberBetween(1, 1000);
        }
        valoresAleatorias(listaArray);
        resultadoMultiplicado(nuevoArray(listaArray));
    }

    //Metodo que Multiplica los valores Aleatorios
    public static int[] nuevoArray(int[] nuevaListaArray) {
        for (int i = 0; i <= nuevaListaArray.length - 1; i++) {
            nuevaListaArray[i] = nuevaListaArray[i] * 2;
        }
        return nuevaListaArray;
    }

    //Imprimir Valores Aleatorios
    private static void valoresAleatorias(int[] primerArray) {
        System.out.printf("Ver valores Aleatorios: %s%n", Arrays.toString(primerArray));
    }

    //Imprimir Valores Multiplicados
    private static void resultadoMultiplicado(int[] resultadoArray) {
        System.out.printf("Ver resultado multiplicado: %s%n", Arrays.toString(resultadoArray));
    }
}
