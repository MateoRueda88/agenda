import java.util.ArrayList;
//Creamos clase Agenda
public class Agenda {
    //Creamos un arraylist de contactos y declaramos su capacidad.
    private ArrayList<Contacto> contactos;
    private int capacidad;
    //Creamos el constructor de la clase Agenda
    public Agenda(int capacidad) {
        this.capacidad = capacidad;
        this.contactos = new ArrayList<>(capacidad);
    }
//Creacion de  metodos donde le pasamos como parametro la clase Contacto
    public void añadirContacto(Contacto c) {
        if (agendaLlena()) {
            System.out.println("La agenda está llena. No se pueden añadir más contactos.");
            return;
        }
        if (existeContacto(c)) {
            System.out.println("El contacto ya existe. No se puede añadir contactos duplicados.");
            return;
        }
        //Se validad la existencia del contacto y el espacio en agenda para agregar un nuevo contacto
        contactos.add(c);
        System.out.println("Contacto añadido: " + c);
    }
//Validar si el contacto existe
    public boolean existeContacto(Contacto c) {
        for (Contacto contacto : contactos) {
            if (contacto.equals(c)) {
                return true;
            }
        }
        return false;
    }
//Mostrar lista de contactos
    public void listarContactos() {
        if (contactos.isEmpty()) {
            System.out.println("La agenda está vacía.");
        } else {
            System.out.println("Lista de contactos:");
            for (Contacto c : contactos) {
                System.out.println(c.toString());
            }
        }
    }
//Buscar un contacto dentro de la lista e imprimir la informacion del contacto
    public void buscaContacto(String nombre) {
        boolean encontrado = false;
        for (Contacto c : contactos) {
            if (c.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Teléfono de " + nombre + ": " + c.getTelefono());
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("El contacto " + nombre + " no existe en la agenda.");
        }
    }
//Eliminar un contacto de la lista
    public void eliminarContacto(Contacto c) {
        if (contactos.remove(c)) {
            System.out.println("Contacto eliminado: " + c.toString());
        } else {
            System.out.println("El contacto no existe en la agenda.");
        }
    }
//Verificar si la lista esta llena de contactos
    public boolean agendaLlena() {
        return contactos.size() >= capacidad;
    }
//Verificar si la lista contiene espacios libres para agregar un nuevo contacto
    public int espacioLibres() {
        return capacidad - contactos.size();
    }
}