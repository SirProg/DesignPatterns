public class AdapterSistemaWeb implements CanalWeb {
    private SistemaPresencial sistema;

    @Override
    public void pagoDigital(float cantidad) {
        sistema.pagoPresencial(cantidad);
    }

    @Override
    public void anularCompra() {
        sistema.anularCompra();
    }
}
