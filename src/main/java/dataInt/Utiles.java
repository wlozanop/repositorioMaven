package dataInt;

import com.github.javafaker.Faker;

public class Utiles {
    //Método para generar números enteros aleatorios entre 1 y 20
    public static void generarNumeros(int[] array) {
        final var n = array.length;
        for (int i = 0; i < n; i++) {
            array[i] = new Faker().number().numberBetween(1, 20);
        }
    }

    //Método para generar números enteros aleatorios entre 1 y 1000
    public static void numerosGrandes(int[] array) {
        final var n = array.length;
        for (int i = 0; i < n; i++) {
            array[i] = new Faker().number().numberBetween(1, 1000);
        }
    }
}
