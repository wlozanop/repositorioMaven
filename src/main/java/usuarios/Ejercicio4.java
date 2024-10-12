package usuarios;

import leerArchivo.ExcellReader;
import modelo.Usuario;

import java.util.Arrays;

public class Ejercicio4 {
    public static void main(String[] args) {
        final var listaUsuarios = ExcellReader.getUsuariosList();
        final var arrayLista = listaUsuarios.toArray(new Usuario[0]);
        ordenarLista(arrayLista);
        imprimirArray(arrayLista);
    }

    //Método para ordenar la lista DESCENDENTE Z - A
    static void ordenarLista(Usuario[] lista) {
        final var n = lista.length;

        for (var i = 0; i < n; i++) {
            for (var j = 0; j < n - i - 1; j++) {
                if (lista[j].getApellido().compareTo(lista[j + 1].getApellido()) < 0) {
                    final var temp = lista[j];
                    lista[j] = lista[j + 1];
                    lista[j + 1] = temp;
                }
            }
        }
    }

    //Método para mostrar el resultado
    static void imprimirArray(Usuario[] array) {
        System.out.printf("%s%n", Arrays.toString(array));
        System.out.printf("Cantidad encontrado: %d%n", array.length);
    }
}
