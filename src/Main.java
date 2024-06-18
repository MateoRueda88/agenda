import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Asignamos la capacidad de nuestra lista e instanciamos la clase Agenda
        int capacidad = 10;
        Agenda agenda = new Agenda(capacidad);
//Declaramos la variable opcion e implementamos un menu con un ciclo do-while
        int opcion;
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Añadir contacto");
            System.out.println("2. Listar contactos");
            System.out.println("3. Buscar contacto");
            System.out.println("4. Eliminar contacto");
            System.out.println("5. Verificar si la agenda está llena");
            System.out.println("6. Ver espacio libre");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt(); //Entrada por teclado de la opcion seleccionada por el usuario
            scanner.nextLine(); // Consumir el salto de línea
//implementacion del switch y llamado de clases
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del contacto: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese el teléfono del contacto: ");
                    String telefono = scanner.nextLine();
                    Contacto nuevoContacto = new Contacto(nombre, telefono); // Se crea nuevo contacto
                    agenda.añadirContacto(nuevoContacto); //Agregar nuevo contacto a nuestra Agenda
                    break;
                case 2:
                    agenda.listarContactos(); //imprimimos la lista de contactos
                    break;
                case 3:
                    System.out.print("Ingrese el nombre del contacto a buscar: ");
                    nombre = scanner.nextLine();
                    agenda.buscaContacto(nombre); //Busquedad del contacto
                    break;
                case 4:
                    System.out.print("Ingrese el nombre del contacto a eliminar: ");
                    nombre = scanner.nextLine();
                    Contacto contactoAEliminar = new Contacto(nombre, ""); //Creamos instancia de contacto a eliminar
                    agenda.eliminarContacto(contactoAEliminar); // Eliminamos el contacto
                    break;
                case 5:
                    //Verificar si la agenda esta llena
                    if (agenda.agendaLlena()) {
                        System.out.println("La agenda está llena.");
                    } else {
                        System.out.println("La agenda no está llena.");
                    }
                    break;
                case 6:
                    //verificar si nuestra agenda contiene espacio
                    System.out.println("Espacio libre en la agenda: " + agenda.espacioLibres());
                    break;
                case 7:
                    //Salimos del programa
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    //si la opcion no es correcta, volvemos a mostrar nuestro menu
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        } while (opcion != 7); // si la opcion es diferente a 7 se sigue ejecutando
//Cerramos Scanner
        scanner.close();
    }
}