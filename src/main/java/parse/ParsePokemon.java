package parse;

import leerArchivo.JsonReader;
import modelo.Pokemon;

import java.util.HashMap;
import java.util.Map;

public class ParsePokemon {
    public static Map<String, Pokemon> getPokemonMap() {
        final var mapPokemon = JsonReader.getPokemon();
        final var map = new HashMap<String, Pokemon>();

        for (var elemento : mapPokemon) {
            map.put(elemento.getId(), elemento);
        }
        return map;
    }
}
