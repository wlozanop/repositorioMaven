package pokemones;

import parse.ParsePokemon;

public class Ejercicio5 {
    public static void main(String[] args) {
        final var mapPokemon = ParsePokemon.getPokemonMap();
        final var primerPokemon = mapPokemon.get("PKM-9");
        final var segundoPokemon = mapPokemon.get("PKM-28");
        
        System.out.printf("Sumar las defensas: %s%n", primerPokemon.getDefensa() + segundoPokemon.getDefensa());
    }
}
