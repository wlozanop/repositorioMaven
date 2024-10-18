package pokemones;

import leerArchivo.JsonReader;
import modelo.Pokemon;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio1 {
    public static void main(String[] args) {
        final var listaJson = JsonReader.getPokemon();
        final var filtrarResultado = filtrarPokemon(listaJson, "AIRE");
        System.out.printf("Ver resultado: %n%s%n", filtrarResultado);
        System.out.printf("Cantidad resultado: %d%n", filtrarResultado.size());
    }

    //Método que filtra los pokemos por tipo y por sexo "hembra"
    private static List<Pokemon> filtrarPokemon(List<Pokemon> lista, String tipo) {
        final var listaPokemon = new ArrayList<Pokemon>();

        for (var elemento : lista) {
            if (elemento.getTipo().equals(tipo) && !elemento.isEsMacho()) {
                listaPokemon.add(elemento);
            }
        }
        return listaPokemon;
    }
}
