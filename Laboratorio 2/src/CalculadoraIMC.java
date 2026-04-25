public class CalculadoraIMC {

    public double calcularIMC(DatosPaciente paciente) {
        double peso = paciente.getPesoKg();
        double altura = paciente.getAlturaMetros();
        return peso / (altura * altura);
    }

    public String obtenerRangoSalud(double imc) {
        if (imc < 18.5) {
            return "Bajo peso";
        } else if (imc < 25) {
            return "Normal";
        } else {
            return "Sobrepeso";
        }
    }
}