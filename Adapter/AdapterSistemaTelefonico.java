public class AdapterSistemaTelefonico implements CanalTelefonico {
    private SistemaPresencial sistema;

    @Override
    public void estadoAfiliacion() {
        sistema.estadoAfiliacion();
    }

    @Override
    public void anularCompra() {
        sistema.anularCompra();
    }
    
}
