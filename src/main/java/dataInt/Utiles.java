package dataInt;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Utiles {
    //Método que recorre la lista
    static List<Integer> generarListaNumeros(int n, int min, int max, Random random) {
        final var lista = new ArrayList<Integer>();
        for (var i = 0; i < n; i++) {
            lista.add(aleatorioInt(min, max, random));
        }
        return lista;
    }

    //Método que recorre el array
    public static int[] generarArrayNumeros(int n, int min, int max, Random random) {
        final var array = new int[n];
        for (var i = 0; i < n; i++) {
            array[i] = aleatorioInt(min, max, random);
        }
        return array;
    }

    //Metodo que genera los numeros random
    static int aleatorioInt(int minimo, int maximo, Random random) {
        return random.nextInt(maximo - minimo + 1) + minimo;
    }
}
