package utilities;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;

public class Utiles {
    //Metodo que genera una lista de números aleatorios
    public static List<Integer> generarListaIntaleatario(int n, int min, int max) {
        final var array = new ArrayList<Integer>();
        for (var i = 0; i < n; i++) {
            array.add(i, new Faker().number().numberBetween(min, max));
        }
        return array;
    }

    //Metodo que genera un array de números aleatorios
    public static int[] generarArrayIntAletario(int n, int min, int max) {
        final var array = new int[n];
        for (var i = 0; i < n; i++) {
            array[i] = new Faker().number().numberBetween(min, max);
        }
        return array;
    }

    //Metodo que genera una lista de números aleatorios tipo Double
    public static List<Double> generarListaDoubleAleatario(int n, int min, int max) {
        final var array = new ArrayList<Double>();
        for (var i = 0; i < n; i++) {
            array.add(i, new Faker().number().randomDouble(n, min, max));
        }
        return array;
    }

    //Metodo que genera un array de números aleatorios tipo Double
    public static double[] generarArrayDoubleAletario(int n, int min, int max) {
        final var array = new double[n];
        for (var i = 0; i < n; i++) {
            array[i] = new Faker().number().randomDouble(n, min, max);
        }
        return array;
    }
}
