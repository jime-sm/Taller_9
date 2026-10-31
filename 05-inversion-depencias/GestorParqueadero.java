import java.util.*;
public class GestorParqueadero {
    private List<Vehiculo> vehiculos = new ArrayList<>();
    private final RepositorioCobros repositorio;
    private final ExportadorCSV exportador;
    private final NotificadorSMS notificador;
    public GestorParqueadero(RepositorioCobros repositorio,
                             ExportadorCSV exportador,
                             NotificadorSMS notificador) {
        this.repositorio = repositorio;
        this.exportador = exportador;
        this.notificador = notificador;
    }
    public void registrar(Vehiculo v) { vehiculos.add(v); }
    public void cerrarMes() {
        int total = 0;
        for (Vehiculo v : vehiculos) {
            int cobro = v.calcularCobro();
            total += cobro;
            repositorio.guardar(v.getPlaca(), cobro);
        }
        exportador.exportar(total);
        notificador.enviar("Cierre mensual terminado. Total: $" + total);
    }
}