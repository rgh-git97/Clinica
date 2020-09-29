
package clinica;

import javax.swing.JOptionPane;

public class Paciente {


    private String id;
    private String nombre;
    private String apellidos;
    private int edad;
    private String genero;

    public Paciente(String id, String nombre, String apellidos, int edad, String genero) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.genero = genero;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * Muestra en un panel todos los datos del Paciente
     */
    public void mostrar() {
        String mensaje = "ID Paciente: " + id + "\nNombre: " + nombre
                + "\nApellidos: " + apellidos + "\nEdad: " + edad
                + "\nGenero: " + genero;
        JOptionPane.showMessageDialog(null, mensaje, "Mostrar Paciente", JOptionPane.INFORMATION_MESSAGE);
    }

    public String generaLineaCSV() {
        return String.format("%s;%s;%s;%s;%s\n", id, nombre, apellidos,edad,genero);
    }

}