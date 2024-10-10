package dataInt;

import com.github.javafaker.Faker;

import java.util.Arrays;

public class Ejercicio3 {
    public static void main(String[] args) {
        final var listaNumeros = new int[10];
        for (int i = 0; i <= listaNumeros.length - 1; i++) {
            listaNumeros[i] = new Faker().number().numberBetween(1, 100);
        }
        valoresAleatorias(listaNumeros);
        muestraSumaTotal(listaNumeros);
    }

    //Metodo que hace la suma total
    public static void muestraSumaTotal(int[] nuevaListaArray) {
        var suma = 0;
        for (int i = 0; i <= nuevaListaArray.length - 1; i++) {
            suma += nuevaListaArray[i];
        }
        System.out.printf("La suma total es: %s%n", suma);
    }

    //Imprimir Valores Aleatorios
    private static void valoresAleatorias(int[] primerArray) {
        System.out.printf("Ver valores Aleatorios: %s%n", Arrays.toString(primerArray));
    }
}
