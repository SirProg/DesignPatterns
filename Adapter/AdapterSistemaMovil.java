public class AdapterSistemaMovil implements CanalMovil {
    private SistemaPresencial sistema;

    @Override
    public void estadoAfiliacion() {
        sistema.estadoAfiliacion();
    }
    
}
