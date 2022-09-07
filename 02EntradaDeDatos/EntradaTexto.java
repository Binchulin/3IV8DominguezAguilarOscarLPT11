//Esto es un comentario
/*
 * Todo programa en java debe tener el nombre de la calse tal cual como el archivo
 */

class EntradaTexto {
    public static void main(String[] args) {
        // Los limites de la clase

        // Toda clase debe tener un metodo principal
        /**
         * vamos a realizar un programa por el cual podemos introducir texto a nuestra
         * conveniencia
         */

        // Tipo de dato
        String nombre;

        // el ; es el fin de linea

        // Instancia
        System.out.println("Por favor introduce tu nombre así bien kawaii");

        // Vamos a obtener ek nombre del usuario
        nombre = System.console().readLine();

        System.out.println("Hola " + nombre + " bienvenido a tu programita.");
    }
}
