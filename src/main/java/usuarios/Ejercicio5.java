package usuarios;

import modelo.Usuario;
import parse.UsuarioParse;

public class Ejercicio5 {
    public static void main(String[] args) {
        final var mapUsuario = UsuarioParse.getUsuarioLista();
        final var primerID = mapUsuario.get("USR-20");
        final var segundoID = mapUsuario.get("USR-33");

        final var edadPrimerUsuario = obtenerEdad(primerID);
        final var edadSegundoUsuario = obtenerEdad(segundoID);

        System.out.printf("Suma las edades de 2 ID: %d%n", edadPrimerUsuario + edadSegundoUsuario);
    }

    //Método que obtiene la edad del usuarioID
    private static int obtenerEdad(Usuario usuario) {
        return usuario.getEdad();
    }
}
