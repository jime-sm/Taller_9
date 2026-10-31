public class Carro extends Vehiculo {
    public Carro(String placa, int minutos) { super(placa, minutos); }
    public int calcularCobro() { return (int)Math.ceil(minutos / 60.0) * 3000; }
}