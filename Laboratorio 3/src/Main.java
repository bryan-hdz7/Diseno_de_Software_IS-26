public class Main {
    public static void main(String[] args) {
        SalaEmergencias sala = new SalaEmergencias();

        sala.registrarPaciente(new Paciente("Carlos", Prioridad.VERDE, 1));
        sala.registrarPaciente(new Paciente("Ana", Prioridad.ROJO, 2));
        sala.registrarPaciente(new Paciente("Luis", Prioridad.AMARILLO, 3));
        sala.registrarPaciente(new Paciente("María", Prioridad.ROJO, 4));
        sala.registrarPaciente(new Paciente("Sofía", Prioridad.VERDE, 5));
        sala.registrarPaciente(new Paciente("Pedro", Prioridad.AMARILLO, 6));

        IteradorPacientes iterador = sala.crearIteradorPorPrioridad();

        System.out.println("Orden de atención de pacientes:");

        while (iterador.haySiguiente()) {
            Paciente paciente = iterador.siguiente();
            System.out.println(paciente);
        }
    }
}
