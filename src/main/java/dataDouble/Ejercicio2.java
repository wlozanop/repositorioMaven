package dataDouble;

import utilities.Utiles;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Ejercicio2 {
    public static void main(String[] args) {
        final var listaArray = Utiles.generarArrayDoubleAletario(20, 1, 50);
        System.out.printf("Lista de números aleatorios     : %s%n", Arrays.toString(Arrays.stream(listaArray).toArray()));
        final var numerosSinDuplicados = quitarDuplicados(listaArray);
        System.out.printf("Lista de números sin duplicados : %s%n", Arrays.toString(numerosSinDuplicados.toArray()));
    }

    //Método que filtrar duplicados tipo double
    private static Set<Double> quitarDuplicados(double[] array) {
        final var numero = new TreeSet<Double>();
        for (var elemento : array) {
            numero.add(elemento);
        }
        return numero;
    }
}
