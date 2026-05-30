import java.util.ArrayList;
import java.util.List;

public class SalaEmergencias {
    private List<Paciente> pacientes;

    public SalaEmergencias() {
        this.pacientes = new ArrayList<>();
    }

    public void registrarPaciente(Paciente paciente) {
        pacientes.add(paciente);
    }

    public IteradorPacientes crearIteradorPorPrioridad() {
        return new IteradorPacientesPorPrioridad(pacientes);
    }
}