package usuarios;

import leerArchivo.ExcellReader;
import modelo.Usuario;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio2 {
    public static void main(String[] args) {
        final var listaUsuarios = ExcellReader.getUsuariosList();
        final var listaResultado = filtrarPorDominioCorreo(listaUsuarios, "GMAIL");
        System.out.printf("Lista de resultados: %s%n", listaResultado);
        System.out.printf("Cantidad encontrado: %s%n", listaResultado.size());
    }

    //Método que filtrar de una lista, a los usuarios que cumplan con el dominio de búsqueda
    private static List<Usuario> filtrarPorDominioCorreo(List<Usuario> lista, String dominio) {
        final var listaEncontrado = new ArrayList<Usuario>();

        for (var elemento : lista) {
            if (elemento.getCorreo().contains(dominio)) {
                listaEncontrado.add(elemento);
            }
        }
        return listaEncontrado;
    }
}
