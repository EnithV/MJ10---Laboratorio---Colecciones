import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class HashsetLibros {
    public static void main(String[] args) {
        Set<String> libros = new HashSet<>();
        libros.add("Las Aventuras De Tom Sawyer".toLowerCase());
        libros.add("El Conde De Montecristo".toLowerCase());
        libros.add("El Coronel No Tiene Quien Le Escriba".toLowerCase());

        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        while (opcion != 5) {
            System.out.println("¿Qué quieres hacer?\n 1. Agregar libro\n 2. Mostrar todos los libros\n 3. Verificar si un libro está disponible\n 4. Mostrar cantidad de libros\n 5. Salir ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            if (opcion == 1) {
                System.out.println("Escriba el nombre del libro a agregar\n");
                String libro = scanner.nextLine();
                libros.add(libro.toLowerCase());
                System.out.println("Libro agregado");
            } else if (opcion == 2) {
                System.out.println("Libros disponibles\n" + libros);
            } else if (opcion == 3) {
                System.out.println("Escriba el nombre del libro a verificar\n");
                String libro = scanner.nextLine();
                if (libros.contains(libro.toLowerCase())) {
                    System.out.println("El libro sí está disponible");
                } else {
                    System.out.println("El libro no está disponible");
                }
            } else if (opcion == 4) {
                System.out.println("Cantidad de libros: " + libros.size());
            } else if (opcion == 5) {
                System.out.println("Salir");
            } else {
                System.out.println("Opción inválida");
            }
        }

        scanner.close();
    }
}