package clinica;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

/**final class GestorDoctor {

    private ArrayList<Doctor> doctores;

    public GestorDoctor() {
        doctores = new ArrayList<Doctor>();
    }

    public boolean nuevoDoctor() {
        String id = JOptionPane.showInputDialog(null, "Introduzca Identificador:", "Nuevo Doctor", JOptionPane.QUESTION_MESSAGE);
        String nombre = JOptionPane.showInputDialog(null, "Nombre:", "Nuevo Doctor", JOptionPane.QUESTION_MESSAGE);
        String apellidos = JOptionPane.showInputDialog(null, "Apellidos:", "Nuevo Doctor", JOptionPane.QUESTION_MESSAGE);
        String especialidad = JOptionPane.showInputDialog(null, "Especialidad:", "Nuevo Doctor", JOptionPane.QUESTION_MESSAGE);

    }
        Doctor nuevoDoctor = new Doctor(id, nombre, apellidos, especialidad);
        return doctores.add(nuevoDoctor());//Devuelve TRUE si se insertó correctamente, FALSE si no se pudo insertar
    }

    public void mostrarDoctoress() {
        for (Doctor p: doctores)
            p.mostrar2();
    }

/**
 private ArrayList<Doctor> pacientes;

 public void crearCSV() {

 File archivo = new File("C:/csv/Doctores.csv");

 try {
 //Si no existe archivo, intentamos crearlo
 if (!archivo.exists()) {
 File carpeta = archivo.getParentFile();
 carpeta.mkdirs();
 archivo.createNewFile();
 }

 FileWriter escritor = new FileWriter(archivo);
 //Cabecera para datos del CSV
 escritor.append("#ID;Nombre;Apellidos\n");

 //Datos de los pacientes
 for (Paciente doc : pacientes)
 escritor.append(doc.generaLineaCSV());//Insertamos linea CSV

 escritor.close();
 } catch (IOException e) {
 System.out.println("Error de acceso a: " + archivo.getAbsolutePath());
 }
 }

 public Doctor getDoctor(String iDdoctor) {
 }

 public void nuevoDoctor() {
 }

 public void modificarDoctor() {
 }

 public void mostrarDoctores() {
 }
 **/
