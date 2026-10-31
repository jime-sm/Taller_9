public class Moto extends Vehiculo {
    public Moto(String placa, int minutos) { super(placa, minutos); }
    public int calcularCobro() { return (int)Math.ceil(minutos / 60.0) * 2000; }
}