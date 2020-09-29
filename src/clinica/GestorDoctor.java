package clinica;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public final class GestorDoctor {

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
            for (GestorPaciente doc : pacientes) {
                escritor.append(doc.generaLineaCSV());//Insertamos linea CSV
            }

            escritor.close();
        } catch (IOException e) {
            System.out.println("Error de acceso a: " + archivo.getAbsolutePath());
        }
    }

    public Doctor getDoctor(String iDdoctor) {
    }

    public GestorPaciente get(int ultimo) {
    }


//public void nuevoDoctor() {


  //  public void modificarDoctor() {
  //  }

   // public void mostrarDoctores() {
  //  }

   // public void add(Doctor doctor) {
  //  }

   // public void size() {
   // }

  //  public void get(int ultimo) {
    //}