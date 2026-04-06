public class ModuloReportes {

    public ConfiguracionSistema obtenerConfiguracion() {
        ConfiguracionSistema config = ConfiguracionSistema.getInstancia();

        System.out.println("ModuloReportes usa la configuración:");
        System.out.println("URL Base: " + config.getUrlBase());
        System.out.println("Puerto: " + config.getPuerto());
        System.out.println("Timeout: " + config.getTimeout());
        System.out.println();

        return config;
    }
}