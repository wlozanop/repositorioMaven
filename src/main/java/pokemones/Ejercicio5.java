package pokemones;

import parse.ParsePokemon;

public class Ejercicio5 {
    public static void main(String[] args) {
        final var listaPokemon = ParsePokemon.getPokemonLista();
        final var primerPokemon = listaPokemon.get("PKM-9");
        final var segundoPokemon = listaPokemon.get("PKM-28");

        System.out.printf("Sumar las defensas: %s%n", primerPokemon.getDefensa() + segundoPokemon.getDefensa());
    }
}
