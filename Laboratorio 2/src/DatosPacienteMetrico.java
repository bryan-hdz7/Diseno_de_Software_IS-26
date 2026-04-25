public class DatosPacienteMetrico implements DatosPaciente {
    private double pesoKg;
    private double alturaMetros;

    public DatosPacienteMetrico(double pesoKg, double alturaMetros) {
        this.pesoKg = pesoKg;
        this.alturaMetros = alturaMetros;
    }

    @Override
    public double getPesoKg() {
        return pesoKg;
    }

    @Override
    public double getAlturaMetros() {
        return alturaMetros;
    }
}