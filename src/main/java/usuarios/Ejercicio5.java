package usuarios;

import parse.UsuarioParse;

public class Ejercicio5 {
    public static void main(String[] args) {
        final var mapUsuario = UsuarioParse.getUsuarioLista();
        final var primerUsuario = mapUsuario.get("USR-20");
        final var segundoUsuario = mapUsuario.get("USR-33");
        imprimirSumaEdades(primerUsuario.getEdad(), segundoUsuario.getEdad());
    }

    //Método que devuelve la suma de edades
    private static void imprimirSumaEdades(int primeraEdad, int segundaEdad) {
        System.out.printf("Suma las edades de 2 usuarios es: %d%n", primeraEdad + segundaEdad);
    }
}
