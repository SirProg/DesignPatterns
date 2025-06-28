package bridge;

public class Web implements Canal {
    public void procesar(String transaccion){
        System.out.println("Procesando: "+transaccion);
    }
}
