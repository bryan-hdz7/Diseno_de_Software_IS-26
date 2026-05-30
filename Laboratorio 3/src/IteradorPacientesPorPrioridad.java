import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class IteradorPacientesPorPrioridad implements IteradorPacientes {
    private List<Paciente> pacientesOrdenados;
    private int posicionActual;

    public IteradorPacientesPorPrioridad(List<Paciente> pacientes) {
        this.pacientesOrdenados = new ArrayList<>(pacientes);
        this.pacientesOrdenados.sort(Comparator.comparing(Paciente::getPrioridad).thenComparing(Paciente::getOrdenLlegada));
        this.posicionActual = 0;
    }

    @Override
    public boolean haySiguiente() {
        return posicionActual < pacientesOrdenados.size();
    }

    @Override
    public Paciente siguiente() {
        if (!haySiguiente()) {
            return null;
        }

        Paciente paciente = pacientesOrdenados.get(posicionActual);
        posicionActual++;

        return paciente;
    }
}