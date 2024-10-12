package usuarios;

import leerArchivo.ExcellReader;
import modelo.Usuario;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio1 {
    public static void main(String[] args) {
        final var listaUsuarios = ExcellReader.getUsuariosList();
        final var resultadoFiltro = filtrarUsuarios(listaUsuarios);
        System.out.printf("Lista de resultados: %s%n", resultadoFiltro);
        System.out.printf("Cantidad encontrado: %s%n", resultadoFiltro.size());
    }

    //Método que filtrar de una lista, a los usuarios que cumplen la condición
    private static List<Usuario> filtrarUsuarios(List<Usuario> lista) {
        final var listaFiltrado = new ArrayList<Usuario>();

        for (var elemento : lista) {
            if (elemento.getPeso() > 50.00) {
                if (elemento.getNombre().startsWith("R")) {
                    if (elemento.getApellido().endsWith("O")) {
                        listaFiltrado.add(elemento);
                    }
                }
            }
        }
        return listaFiltrado;
    }
}
