package pokemones;

import leerArchivo.JsonReader;
import modelo.Pokemon;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio4 {
    public static void main(String[] args) {
        final var listaPokemon = JsonReader.getPokemon();
        final var actualizarHp = actualizarListaHp(listaPokemon);
        System.out.printf("Lista de nuevo valor HP: %s%n", actualizarHp);
        System.out.printf("Cantidad Actualizado: %s%n", actualizarHp.size());
    }

    //Método que sirve para actualizar el valor del campo HP
    private static List<Pokemon> actualizarListaHp(List<Pokemon> lista) {
        final var actualizarHp = new ArrayList<Pokemon>();

        for (var elemento : lista) {
            elemento.setHp(elemento.getHp() + 500);
            actualizarHp.add(elemento);
        }
        return actualizarHp;
    }
}
