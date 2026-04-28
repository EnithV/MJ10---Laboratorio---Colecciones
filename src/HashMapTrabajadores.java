import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapTrabajadores {

    public static void main(String[] args) {
        Map<String, Double> trabajadores = new HashMap<>();
        trabajadores.put("Camilo", 2500.0);
        trabajadores.put("Marcela", 3000.0);
        trabajadores.put("Luis", 2800.0);

        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 5) {
            System.out.println("¿Qué quieres hacer?\n 1. Agregar trabajador\n 2. Mostrar todos los trabajadores y salarios\n 3. Actualizar salario de un trabajador\n 4. Calcular salario promedio\n 5. Salir ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            if (opcion == 1) {
                agregarTrabajador(trabajadores, scanner);
            } else if (opcion == 2) {
                mostrarTrabajadores(trabajadores);
            } else if (opcion == 3) {
                actualizarSalario(trabajadores, scanner);
            } else if (opcion == 4) {
                calcularPromedio(trabajadores);
            } else if (opcion == 5) {
                System.out.println("Salir");
            } else {
                System.out.println("Opción inválida");
            }
        }

        scanner.close();
    }

    // Métod 1: Agregar trabajador
    public static void agregarTrabajador(Map<String, Double> trabajadores, Scanner scanner) {
        System.out.println("Escriba el nombre del trabajador");
        String nombre = scanner.nextLine();
        System.out.println("Escriba el salario del trabajador");
        double salario = scanner.nextDouble();
        scanner.nextLine();
        trabajadores.put(nombre, salario);
        System.out.println("Trabajador agregado");
    }

    // Métod 2: Mostrar todos los trabajadores
    public static void mostrarTrabajadores(Map<String, Double> trabajadores) {
        System.out.println("Trabajadores y salarios");
        for (Map.Entry<String, Double> entry : trabajadores.entrySet()) {
            System.out.println(entry.getKey() + " -> $" + String.format("%.2f", entry.getValue()));
        }
    }

    // Métod 3: Actualizar salario
    public static void actualizarSalario(Map<String, Double> trabajadores, Scanner scanner) {
        System.out.println("Escriba el nombre del trabajador para actualizar salario");
        String nombre = scanner.nextLine();
        if (trabajadores.containsKey(nombre)) {
            System.out.println("Escriba el nuevo salario");
            double nuevoSalario = scanner.nextDouble();
            scanner.nextLine();
            trabajadores.put(nombre, nuevoSalario);
            System.out.println("Salario actualizado");
        } else {
            System.out.println("Trabajador no encontrado");
        }
    }

    // Métod 4: Calcular salario promedio
    public static void calcularPromedio(Map<String, Double> trabajadores) {
        double suma = 0;
        for (double salario : trabajadores.values()) {
            suma += salario;
        }
        double promedio = suma / trabajadores.size();
        System.out.println("Salario promedio: $" + String.format("%.2f", promedio));
    }
}