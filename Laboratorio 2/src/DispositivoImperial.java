public class DispositivoImperial {

    private double pesoLibras;
    private double alturaPies;

    public DispositivoImperial(double pesoLibras, double alturaPies) {
        this.pesoLibras = pesoLibras;
        this.alturaPies = alturaPies;
    }

    public double obtenerPesoEnLibras() {
        return pesoLibras;
    }

    public double obtenerAlturaEnPies() {
        return alturaPies;
    }
}