public class Capitan {
    private String matricula, nombre, apellido;

    public Capitan(String matricula, String nombre, String apellido) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String toString(){
        return "Capitan\n" + "Matricula: " + matricula + "\nNombre: " + nombre + "\nApellido: " + apellido + ".\n";
    }
}
