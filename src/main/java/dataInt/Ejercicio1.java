package dataInt;

import utilities.Utiles;

import java.util.List;

public class Ejercicio1 {
    public static void main(String[] args) {
        final var listaArray = Utiles.generarListaIntaleatario(20, 1, 1000);
        imprimirValoresAleatorias(listaArray);
        mostrarResultadoMultiplicado(multiplicarArray(listaArray));
    }

    //Metodo que Multiplica los valores Aleatorios
    private static List<Integer> multiplicarArray(List<Integer> nuevaListaArray) {
        final var n = nuevaListaArray.size();
        for (var i = 0; i < n; i++) {
            nuevaListaArray.set(i, nuevaListaArray.get(i) * 2);
        }
        return nuevaListaArray;
    }

    //Imprimir Valores Aleatorios
    private static void imprimirValoresAleatorias(List<Integer> primerArray) {
        System.out.printf("Ver valores aleatorios     : %s%n", primerArray);
    }

    //Imprimir Valores Multiplicados
    private static void mostrarResultadoMultiplicado(List<Integer> resultadoArray) {
        System.out.printf("Ver resultado multiplicado : %s%n", resultadoArray);
    }
}
