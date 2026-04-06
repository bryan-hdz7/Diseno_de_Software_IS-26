public class ModuloLogin {
    public ConfiguracionSistema obtenerConfiguracion() {
        ConfiguracionSistema config = ConfiguracionSistema.getInstancia();

        System.out.println("ModuloLogin usa la configuración:");
        System.out.println("URL Base: " + config.getUrlBase());
        System.out.println("Puerto: " + config.getPuerto());
        System.out.println("Timeout: " + config.getTimeout());
        System.out.println("Hash de instancia en Login: " + System.identityHashCode(config));
        System.out.println();

        return config;
    }
}