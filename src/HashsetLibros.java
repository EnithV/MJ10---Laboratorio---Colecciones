import java.util.HashSet;
import java.util.Scanner;

public class HashsetLibros {
    public static void main(String[] args) {
        // • Crear una  colección de libros usando un  HashSet para asegurar que no haya
        //títulos duplicados.
        HashSet<String> libros = new HashSet<>();
        // Leer lo que escribe el usuario
        Scanner scanner = new Scanner(System.in);
        // Inicializar opción del usuario
        int opcion = 0;
        // Repetir el menú mientras el usuario no elija la opción 5
        while (opcion != 5){
            // Menú
            System.out.println("MENÚ");
            System.out.println("1. Agregar libro");
            System.out.println("2. Mostrar todos los libros");
            System.out.println("3. Verificar si un libro existe");
            System.out.println("4. Mostrar total de libros unicos");
            System.out.println("5. Salir");
            System.out.println("Elige una opción: ");
            // Leer la opción que escribe el usuario
            opcion = scanner.nextInt();
            // Limpiar
            scanner.nextLine();
            // Acciones de acuerdo a la opción elegida
            if (opcion == 1) {
                agregarlibro(libros, scanner);
            } else if (opcion == 2) {
                mostrarlibros(libros);
            } else if (opcion == 3) {
                verificarLibro(libros, scanner);
            } else if (opcion == 4) {
                mostrarTotalLibros(libros);
            } else if (opcion == 5) {
                System.out.println("Hasta pronto");
            } else {
                System.out.println("Opción inválida");
            }
        }
        // Cerrar scanner
        scanner.close();
    }
    // 1. Agregar libros al conjunto.
    public static void agregarlibro(HashSet<String> libros, Scanner scanner) {
        // Solicitar al usuario que escriba el nombre del libro
        System.out.println("Ingresa el nombre del libro: ");
        // Giardar libro
        String libro = scanner.nextLine().toLowerCase();
        if (libros.add(libro)) {
            // Si add() regresa true, el libro no existía y se agrega
            System.out.println("Libro agregado: " + libro);
        } else {
            // Si add() regresa false, el libro ya existe
            System.out.println("El libro ya existe en la biblioteca");
        }
    }
    //2. Mostrar todos los libros disponibles.
    public static void mostrarlibros(HashSet<String> libros) {
        if (libros.isEmpty()) {
            System.out.println("No hay libros en la biblioteca");
        } else {
            System.out.println("Libros disponibles:");
                // for each para recorrer cada libro dentroo del HashSet
                // Por cada libro, lo guarda temporalmente en libro e imprime cada libro de la lista
                for (String libro: libros) {
                    System.out.println(" - " + libro);
                }
        }
    }
    //3. Verificar si un libro específico está disponible.
    public static void verificarLibro(HashSet<String> libros, Scanner scanner) {
        if (libros.isEmpty()) {
            System.out.println("No hay libros para verificar");
            return;
        }
        System.out.println("Ingresa el nombre del libro a verificar: ");
        String libro = scanner.nextLine().toLowerCase();
        if (libros.contains(libro)) {
            System.out.println("El libro " + libro + " esta disponible");
        } else {
            System.out.println("El libro " + libro + " no esta disponible");
        }
    }
    //4. Contar el número total de libros únicos en la biblioteca.
    public static void mostrarTotalLibros(HashSet<String> libros) {
        System.out.println("Total de libros únicos: " + libros.size());
    }
}