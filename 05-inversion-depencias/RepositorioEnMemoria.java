import java.util.*;
public class RepositorioEnMemoria implements RepositorioCobros {
    private List<String> registros = new ArrayList<>();
    public void guardar(String placa, int valor) {
        registros.add(placa + " - $" + valor);
        System.out.println("[Memoria] Guardado: " + placa + " - $" + valor);
    }
}