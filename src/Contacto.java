
//Creamos la clase Contacto con sus respectivas variables
public class Contacto {
    private String nombre;
    private String telefono;
//Creamos constructor de la clase Contacto
    public Contacto(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }
//Creamos Get
    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }
//Comparacion de lo que ingresamos en la variable nombre

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Contacto contacto = (Contacto) obj;
        return nombre.equals(contacto.nombre);
    }
// Buscador del objeto nombre
    public int hashCode() {
        return nombre.hashCode();
    }
// Estamos trayendo los atributos de nuestro objeto en formato string
    public String toString() {
        return "Nombre: " + nombre + ", Teléfono: " + telefono;
    }
}