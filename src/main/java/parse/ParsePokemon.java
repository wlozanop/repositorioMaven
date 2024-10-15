package parse;

import leerArchivo.JsonReader;
import modelo.Pokemon;

import java.util.HashMap;
import java.util.Map;

public class ParsePokemon {
    public static Map<String, Pokemon> getPokemonLista() {
        final var listaUsuario = JsonReader.getPokemon();
        final var map = new HashMap<String, Pokemon>();

        for (var elemento : listaUsuario) {
            map.put(elemento.getId(), elemento);
        }
        return map;
    }
}
