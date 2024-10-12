package usuarios;

import leerArchivo.ExcellReader;
import modelo.Usuario;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio3 {
    public static void main(String[] args) {
        final var listaUsuarios = ExcellReader.getUsuariosList();
        final var listaResultado = filtrarPorPais(listaUsuarios, "CHINA");
        System.out.printf("Lista de resultados: %s%n", listaResultado);
        System.out.printf("Cantidad encontrado: %d%n", listaResultado.size());
    }

    //Método que filtrar de una lista, a los usuarios que son de CHINA
    private static List<Usuario> filtrarPorPais(List<Usuario> lista, String pais) {
        final var listaEncontrado = new ArrayList<Usuario>();

        for (var elemento : lista) {
            if (elemento.getPais().equals(pais)) {
                listaEncontrado.add(elemento);
            }
        }
        return listaEncontrado;
    }
}
