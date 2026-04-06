public class Main {
    public static void main(String[] args) {
        ModuloLogin login = new ModuloLogin();
        ModuloReportes reportes = new ModuloReportes();

        ConfiguracionSistema instance1 = login.obtenerConfiguracion();
        ConfiguracionSistema instance2 = reportes.obtenerConfiguracion();

        System.out.println("Comparación de identidad:");
        System.out.println("instance1 == instance2 -> " + (instance1 == instance2));

        if (instance1 == instance2) {
            System.out.println("Ambas variables apuntan al mismo objeto.");
        } else {
            System.out.println("Las variables apuntan a objetos distintos");
        }
    }
}