package parse;

import leerArchivo.ExcellReader;
import modelo.Usuario;

import java.util.HashMap;
import java.util.Map;

public class UsuarioParse {
    //Método para obtener la información del excel
    public static Map<String, Usuario> getUsuarioLista() {
        final var listaUsuario = ExcellReader.getUsuariosList();
        final var map = new HashMap<String, Usuario>();

        for (var elemento : listaUsuario) {
            map.put(elemento.getId(), elemento);
        }
        return map;
    }
}
