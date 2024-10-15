package usuarios;

import leerArchivo.ExcellReader;
import modelo.Usuario;

import java.util.Arrays;

public class Ejercicio4 {
    public static void main(String[] args) {
        final var listaUsuarios = ExcellReader.getUsuariosList();
        final var arrayLista = listaUsuarios.toArray(Usuario[]::new);
        ordenarLista(arrayLista);
        imprimirArray(arrayLista);
    }

    //Método para ordenar la lista DESCENDENTE Z - A
    private static void ordenarLista(Usuario[] array) {
        final var n = array.length;

        for (var i = 0; i < n; i++) {
            for (var j = 0; j < n - i - 1; j++) {
                if (array[j].getApellido().compareTo(array[j + 1].getApellido()) < 0) {
                    final var temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    //Método para mostrar el resultado
    private static void imprimirArray(Usuario[] array) {
        System.out.printf("%s%n", Arrays.toString(array));
        System.out.printf("Cantidad encontrado: %d%n", array.length);
    }
}
