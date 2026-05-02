import java.util.ArrayList;
import java.util.Scanner;

public class ArraysList {
    public static void main(String[] args) {
        // Crear una lista de tareas usando un ArrayList.
        ArrayList<String> tareas = new ArrayList<>();
        // Para leer lo que escribe el usuario
        Scanner scanner = new Scanner(System.in);
        // Inicializar la opción que elige el usuario
        int opcion = 0;
        // Repetir el menú mientras el usuario no elija la opción 5
        while (opcion != 5){
            // Menú
            System.out.println("MENÚ");
            System.out.println("1. Agregar tarea");
            System.out.println("2. Mostrar tareas");
            System.out.println("3. Marcar tarea completada");
            System.out.println("4. Mostrar tareas pendientes");
            System.out.println("5. Salir");
            System.out.println("Elige una opción: ");
            // Leer la opción que escribe el usuario
            opcion = scanner.nextInt();
            scanner.nextLine();
            // Acciones de acuerdo a la opción elegida
            if (opcion == 1) {
                agregarTarea(tareas, scanner);
            } else if (opcion == 2) {
                mostrarTareas(tareas);
            } else if (opcion == 3) {
                marcarCompletada(tareas, scanner);
            } else if (opcion == 4) {
                mostrarTotalPendientes(tareas);
            } else if (opcion == 5) {
                System.out.println("Hasta pronto");
            } else {
                System.out.println("Opción inválida");
            }
        }
        // Cerrar scanner
        scanner.close();
    }

    // 1. Method Agregar tareas a la lista.
    public static void agregarTarea(ArrayList<String> lista, Scanner scanner) {
        System.out.println(" Escribe la tarea que deseas agregar: ");
        String tarea = scanner.nextLine();
        lista.add(tarea);
        System.out.println(" La tarea ha sido agregada: " + tarea);
    }
    // 2. Method Mostrar todas las tareas disponibles
    public static void mostrarTareas(ArrayList<String> lista) {
        if (lista.isEmpty()) {
            System.out.println("No hay tareas pendientes");
        } else {
            System.out.println("Tareas:");
            for (int i = 0; i < lista.size(); i++) {
                // Imprime el número i + 1 de la lista
                System.out.println(" " + (i + 1) + ". " + lista.get(i));
            }
        }
    }
    // 3. Marcar una tarea como completada, eliminándola de la lista.
    public static void marcarCompletada (ArrayList<String> lista, Scanner scanner) {
        if (lista.isEmpty()) {
            System.out.println("No hay tareas para completar");
            return;
        }
        mostrarTareas(lista);
        System.out.println("Elije el número de la tarea completada");
        // Guardar el número que el usuario ingresa
        int numero = scanner.nextInt();
        scanner.nextLine();
        if (numero >= 1 && numero <= lista.size()) {
            String tareaCompletada = lista.get(numero - 1);
            lista.remove(numero - 1);
            System.out.println("Tarea completada: " + tareaCompletada);
        } else {
            System.out.println("El número ingresado no es válido");
        }
    }
    // 4. Mostrar el número total de tareas pendientes.
    public static void mostrarTotalPendientes(ArrayList<String> lista) {
        System.out.println("Total de tareas pendientes: " + lista.size());
    }
}

