public class Main {
    public static void main(String[] args) {
        CalculadoraIMC calculadora = new CalculadoraIMC();
        DispositivoImperial dispositivo = new DispositivoImperial(160, 5.8);
        DatosPaciente pacienteAdaptado = new AdaptadorDispositivoImperial(dispositivo);

        double imc = calculadora.calcularIMC(pacienteAdaptado);
        String rango = calculadora.obtenerRangoSalud(imc);

        System.out.println("Datos originales del dispositivo con sistema imperial:");
        System.out.println("Peso: " + dispositivo.obtenerPesoEnLibras() + "lb");
        System.out.println("Altura: " + dispositivo.obtenerAlturaEnPies() + "pies");

        System.out.println();

        System.out.println("Datos convertidos por el adaptador:");
        System.out.println("Peso: " + pacienteAdaptado.getPesoKg() + "kg");
        System.out.println("Altura: " + pacienteAdaptado.getAlturaMetros() + "m");

        System.out.println();

        System.out.println("Resultado procesado por el sistema de salud:");
        System.out.println("IMC: " + imc);
        System.out.println("Rango de salud: " + rango);
    }
}