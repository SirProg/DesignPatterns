package bridge;

public class Movil implements Canal {
    public void procesar(String transaccion){
        System.out.println("Procesando: "+transaccion);
    }
}
