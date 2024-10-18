package pokemones;

import leerArchivo.JsonReader;
import modelo.Pokemon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ejercicio3 {
    public static void main(String[] args) {
        final var listaPokemon = JsonReader.getPokemon();
        final var filtrarPokemon = filtrarPokemonUbicacion(listaPokemon, "CERULEAN CITY");
        final var arrayPokemon = filtrarPokemon.toArray(new Pokemon[0]);
        ordenarArrayPokemon(arrayPokemon);
        System.out.printf("Imprimir lista Ordenado A - Z: %n%s%n", Arrays.toString(arrayPokemon));
        System.out.printf("Cantidad encontrado: %d%n", arrayPokemon.length);
    }

    //Método para filtrar pokemon por ubicación
    private static List<Pokemon> filtrarPokemonUbicacion(List<Pokemon> lista, String tipo) {
        final var listaPokemon = new ArrayList<Pokemon>();

        for (var elemento : lista) {
            if (elemento.getUbicacion().equals(tipo)) {
                listaPokemon.add(elemento);
            }
        }
        return listaPokemon;
    }

    //Método para ordenar el array de pokemon por nombre A-Z
    private static void ordenarArrayPokemon(Pokemon[] array) {
        final var n = array.length;

        for (var i = 0; i < n; i++) {
            for (var j = 0; j < n - i - 1; j++) {
                if (array[j].getNombre().compareTo(array[j + 1].getNombre()) > 0) {
                    final var temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
