package pokemones;

import leerArchivo.JsonReader;
import modelo.Pokemon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ejercicio2 {
    public static void main(String[] args) {
        final var listaPokemon = JsonReader.getPokemon();
        final var filtroPokemon = filtrarPokemonElectrico(listaPokemon, "ELECTRICIDAD");
        final var arrayPokemon = filtroPokemon.toArray(new Pokemon[0]);
        ordenarPokemonPorNivel(arrayPokemon);
        System.out.printf("Imprime lista de pokemones: %n%s%n", Arrays.toString(arrayPokemon));
        System.out.printf("Cantidad encontrado: %d%n", arrayPokemon.length);
    }

    //Método que filtra los pokemones por Tipo
    private static List<Pokemon> filtrarPokemonElectrico(List<Pokemon> lista, String tipo) {
        final var listaPokemon = new ArrayList<Pokemon>();

        for (var elemento : lista) {
            if (elemento.getTipo().equals(tipo)) {
                listaPokemon.add(elemento);
            }
        }
        return listaPokemon;
    }

    //Método que ordena el array de pokemones por nivel Mayor a Menor
    private static void ordenarPokemonPorNivel(Pokemon[] array) {
        final var n = array.length;

        for (var i = 0; i < n; i++) {
            for (var j = 0; j < n - i - 1; j++) {
                if (array[j].getNivel() < array[j + 1].getNivel()) {
                    final var temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
