package clinica;

import java.util.ArrayList;
import java.util.Scanner;

import static clinica.Clinica.crearAdmins;
import static clinica.Clinica.validarAcceso;

public final class TestClinica {

    private static ArrayList<Administrador> administradores = new ArrayList<Administrador>();
    private static Scanner teclado = new Scanner(System.in);
    static GestorPaciente pacientes = new GestorPaciente();
    static GestorCita citas = new GestorCita();
    static GestorDoctor doctores = new GestorDoctor();


    public static void main(String[] args) {

        crearAdmins();

        if (validarAcceso()) {
            System.out.println("\nUsuario autorizado\n");
            doctores.nuevoDoctor();
            doctores.modificarDoctor();
            doctores.mostrarDoctores();
            pacientes.nuevoPaciente();
            pacientes.mostrarPacientes();
            pacientes.modificarPaciente();
           // pacientes.borrarPaciente();
            citas.nuevoCita();
            //citas.mostrarCitas();
            doctores.crearCSV();
            //citas.crearCSV();
            pacientes.crearCSV();
        } else
            System.out.println("\nUsuario no autorizado.");

        System.out.println("\t\tFIN DE PROGRAMA");

    }

    private static class Administrador {
    }

    private static class GestorCita {
        public void nuevoCita() {
        }
    }

    private static class GestorPaciente {
        public void nuevoPaciente() {
        }

        public void mostrarPacientes() {
        }

        public void modificarPaciente() {
        }

        public void crearCSV() {
        }
    }
}