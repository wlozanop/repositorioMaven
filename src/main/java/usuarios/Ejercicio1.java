package usuarios;

import leerArchivo.ExcellReader;
import modelo.Usuario;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio1 {
    public static void main(String[] args) {
        final var listaUsuarios = ExcellReader.getUsuariosList();
        final var resultadoFiltro = filtrarUsuarios(listaUsuarios, 50.00, "R", "O");
        System.out.printf("Lista de resultados: %s%n", resultadoFiltro);
        System.out.printf("Cantidad encontrado: %s%n", resultadoFiltro.size());
    }

    //Método que filtrar de una lista, a los usuarios que cumplen la condición
    private static List<Usuario> filtrarUsuarios(List<Usuario> lista, double peso,
                                                 String primeraLetraNombre, String ultimaLetraApellido) {
        final var listaFiltrado = new ArrayList<Usuario>();

        for (var elemento : lista) {
            if (elemento.getPeso() > peso &&
                    elemento.getNombre().startsWith(primeraLetraNombre) &&
                    elemento.getApellido().endsWith(ultimaLetraApellido)) {
                listaFiltrado.add(elemento);
            }
        }
        return listaFiltrado;
    }
}
