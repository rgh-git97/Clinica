package clinica;
import java.util.ArrayList;
import java.util.Scanner;

public class Clinica {
/**
 private static ArrayList<Administrador> administradores = new ArrayList<Administrador>();
 private static GestorDoctor doctores = new GestorDoctor();
 private static GestorPaciente pacientes = new GestorPaciente();
 private static GestorCita citas = new GestorCita(doctores, pacientes);//Pasamos referencias
 private static Scanner teclado = new Scanner(System.in);

 public static void main(String[] args) {
 crearAdmins();

 if (validarAcceso()) {
 System.out.println("\nUsuario autorizado\n");
 //Comienza el programa
 //...
 //...
 //...
 //...
 }
 else
 System.out.println("\nUsuario no autorizado.");

 System.out.println("\n\t\tFIN DE PROGRAMA");

 }

 public static void crearAdmins() {
 administradores.add(new Administrador("Ruben", "1234"));

 }

 static boolean validarAcceso() {

 System.out.println("ACCESO AL SISTEMA");
 System.out.println("------ -- -------\n");
 System.out.print("Nombre: ");
 String nombre = teclado.nextLine();
 System.out.print("Password: ");
 String password = teclado.nextLine();

 Administrador admin = new Administrador(nombre, password);

 return administradores.contains(admin);

 }

 private static class Administrador {
 }

 private static class GestorDoctor {
 }

 private static class GestorPaciente {
 }
 **/
}