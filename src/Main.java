import java.util.*;

public class Main {

    private static HashMap<String, String> estudiantes = new HashMap<>();
    private static Scanner scanner = new Scanner((System.in));

    static void main(String[] args) {
        while(true) {
            mostraMenu();

            String opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    agregarAlumno();
                    break;
                case "2":
                    buscarAlumno();
                    break;
                case "3":
                    eliminarAlumno();
                    break;
                case "4":
                    mostrarTodos();
                    break;
                case "5":
                    System.exit(0);
                default:
                    System.out.println("Opción invalida. Intente de nuevo");
            }
        }
    }

    private static void mostraMenu() {
        System.out.println("----- MENU -----");
        System.out.println("1. Agregar alumno");
        System.out.println("2. Buscar alumno");
        System.out.println("3. Eliminar alumno");
        System.out.println("4. Mostrar todos");
        System.out.println("5. Cerrar");
        System.out.println("Escoja una opción: ");
    }

    private static void agregarAlumno() {
        System.out.print("ID del estudiante: ");
        String id = scanner.nextLine();
        System.out.print("Nombre Completo del estudiante: ");
        String nombreCompleto = scanner.nextLine();

        estudiantes.put(id, nombreCompleto);
        System.out.println("Estudiante ingresado correctamente!");
    }

    private  static void buscarAlumno() {

    }

    private static void eliminarAlumno() {

    }

    private static void mostrarTodos() {

    }
}
