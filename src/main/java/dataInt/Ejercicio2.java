package dataInt;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Ejercicio2 {
    public static void main(String[] args) {
        final var listaArray = Utiles.generarArrayIntAletario(25, 1, 50);
        System.out.printf("Lista de números aleatorios     : %s%n", Arrays.toString(Arrays.stream(listaArray).toArray()));
        final var numerosSinDuplicados = quitarDuplicados(listaArray);
        System.out.printf("Lista de números sin duplicados : %s%n", Arrays.toString(numerosSinDuplicados.toArray()));
    }

    //Método que filtrar duplicados
    private static Set<Integer> quitarDuplicados(int[] array) {
        final var numero = new TreeSet<Integer>();
        for (var elemento : array) {
            numero.add(elemento);
        }
        return numero;
    }
}
