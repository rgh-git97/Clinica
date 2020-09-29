package clinica;

import javax.swing.JOptionPane;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import static clinica.TestClinica.doctores;


public class Doctor extends GestorPaciente {

    private String id;
    private String nombre;
    private String apellidos;
    private String especialidad;

    public Doctor(String id, String nombre, String apellidos, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.especialidad = especialidad;
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

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    /**
     * Muestra por panel todos los datos del doctor
     */
    public void mostrar() {
        String mensaje = "ID doctor: " + id + "\nNombre: " + nombre
                + "\nApellidos: " + apellidos + "\nEspecialidad: " + especialidad;
        JOptionPane.showMessageDialog(null, mensaje, "Mostrar doctor", JOptionPane.INFORMATION_MESSAGE);
    }

    public void nuevoDoctor() {
        System.out.println("\nALTA NUEVO DOCTOR");
        System.out.println("---- ----- ------\n");
        System.out.print("ID: ");
        Scanner teclado = null;
        String id = teclado.nextLine();
        System.out.print("Nombre: ");
        String nombre = teclado.nextLine();
        System.out.print("Apellidos: ");
        String apell = teclado.nextLine();
        System.out.print("Especialidad: ");
        String espe = teclado.nextLine();

        doctores.add(new Doctor(id, nombre, apell, espe));
        crearCSV(); //Añadimos nueva línea CSV al archivo en disco
    }

    public void crearCSV() {

        File archivo = new File("D:/csv/doctores.csv");

        try {
            //Si no existe archivo, intentamos crearlo
            boolean primeraVez = false;
            if (!archivo.exists()) {
                File carpeta = archivo.getParentFile();
                carpeta.mkdirs();
                archivo.createNewFile();
                primeraVez = true; //Primera vez que trabajamos en este archivo
            }

            FileWriter escritor = new FileWriter(archivo, true);
            //Cabecera para datos del CSV, solo si es la primera vez
            if (primeraVez)
                escritor.append("#ID;Nombre;Apellidos;Especialidad\n");

            //Datos del último Doctor registrado
            int ultimo = doctores.size() - 1;
            escritor.append(doctores.get(ultimo).generaLineaCSV());//Insertamos linea CSV

            escritor.close();
        } catch (IOException e) {
            System.out.println("Error de acceso a: " + archivo.getAbsolutePath());
        }
    }
}
