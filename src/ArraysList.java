import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArraysList {
    public static void main(String[] args) {
        List<String> tareas = new ArrayList<>();
        tareas.add("Barrer");
        tareas.add("Lavar");
        tareas.add("Planchar");
        // Crear Scanner para leer lo que escriba el usuario
        Scanner scanner = new Scanner(System.in);
        // Variable para guardar la opción que elija
        int opcion = 0;

        // Repetir el menú mientras no elija salir (opcion 5)
        while (opcion != 5) {
            System.out.println("¿Qué quieres hacer?\n 1. Agregar tarea\n 2. Mostrar tareas disponibles\n 3. Marcar tarea como completada y eliminarla de la lista\n 4. Mostrar número de tareas pendientes\n 5. Salir ");

            // Leer y guardar la opción elegida
            opcion = scanner.nextInt();

            if (opcion == 1) {
                System.out.println("Escriba tarea a agregar\n");
                String tarea = scanner.next();
                tareas.add(tarea);
            } else if (opcion == 2) {
                System.out.println("Mostrar tareas disponibles\n" + tareas);
            } else if (opcion == 3) {
                System.out.println("Escriba la tarea que quiere marcar como completada\n");
                String tarea = scanner.next();
                tareas.remove(tarea);
            } else if (opcion == 4) {
                System.out.println("Tareas pendientes\n" + tareas.size());
            } else if (opcion == 5) {
                System.out.println("Salir");
            } else {
                System.out.println("Opción no válida");
            }
        }

        scanner.close();
    }
}