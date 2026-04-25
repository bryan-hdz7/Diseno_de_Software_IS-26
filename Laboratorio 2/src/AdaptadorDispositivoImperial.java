public class AdaptadorDispositivoImperial implements DatosPaciente {
    private DispositivoImperial dispositivoImperial;

    public AdaptadorDispositivoImperial(DispositivoImperial dispositivoImperial) {
        this.dispositivoImperial = dispositivoImperial;
    }

    @Override
    public double getPesoKg() {
        return dispositivoImperial.obtenerPesoEnLibras() * 0.4536;
    }

    @Override
    public double getAlturaMetros() {
        return dispositivoImperial.obtenerAlturaEnPies() * 0.3048;
    }
}