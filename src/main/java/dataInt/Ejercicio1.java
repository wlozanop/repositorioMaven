package dataInt;

import java.util.List;
import java.util.Random;

public class Ejercicio1 {
    public static void main(String[] args) {
        final var listaArray = Utiles.generarListaNumeros(20, 1, 1000, new Random());
        valoresAleatorias(listaArray);
        resultadoMultiplicado(nuevoArray(listaArray));
    }

    //Metodo que Multiplica los valores Aleatorios
    public static List<Integer> nuevoArray(List<Integer> nuevaListaArray) {
        final var n = nuevaListaArray.size();
        for (int i = 0; i < n; i++) {
            nuevaListaArray.set(i, nuevaListaArray.get(i) * 2);
        }
        return nuevaListaArray;
    }

    //Imprimir Valores Aleatorios
    private static void valoresAleatorias(List<Integer> primerArray) {
        System.out.printf("Ver valores aleatorios     : %s%n", primerArray);
    }

    //Imprimir Valores Multiplicados
    private static void resultadoMultiplicado(List<Integer> resultadoArray) {
        System.out.printf("Ver resultado multiplicado : %s%n", resultadoArray);
    }
}
