package clinica;
import javax.swing.*;
import java.util.ArrayList;

public class GestorCita {

    private ArrayList<Cita> citas;

    //Referencias a las instancias de los gestores de doctores y pacientes
    private GestorDoctor doctores;
    private GestorPaciente pacientes;

    public GestorCita(GestorDoctor gestDoc, GestorPaciente gestPaci) {
        citas = new ArrayList<Cita>();
        doctores = gestDoc;
        pacientes = gestPaci;
    }

    public boolean nuevoCita() {
        String id = JOptionPane.showInputDialog(null, "Introduzca Identificador:", "Nuevo Cita", JOptionPane.QUESTION_MESSAGE);
        String fecha = JOptionPane.showInputDialog(null, "Fecha:", "Nuevo Fecha", JOptionPane.QUESTION_MESSAGE);
        String hora = JOptionPane.showInputDialog(null, "Hora:", "Nuevo Hora", JOptionPane.QUESTION_MESSAGE);
        String motivo = JOptionPane.showInputDialog(null, "Motivo:", "Nuevo Motivo", JOptionPane.QUESTION_MESSAGE);
        String iDdoctor = JOptionPane.showInputDialog(null, "ID del Doctor:", "Nuevo Doctor", JOptionPane.QUESTION_MESSAGE);
        String iDpaciente = JOptionPane.showInputDialog(null, "ID del Paciente:", "Nuevo Paciente", JOptionPane.QUESTION_MESSAGE);

        //Pedimos los datos a los gestores que tenemos referenciados
        Doctor doctor = doctores.getDoctor(iDdoctor);
        Paciente paciente = pacientes.getPaciente(iDpaciente);

        Cita nuevoCita = new Cita(id, fecha, hora, motivo, doctor, paciente);
        return citas.add(nuevoCita);
        //Devuelve TRUE si se insertó correctamente, FALSE si no se pudo insertar
    }

}

