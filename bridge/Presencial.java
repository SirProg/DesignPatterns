package bridge;

public class Presencial implements Canal {
    public void procesar(String transaccion){
        System.out.println("Procesando: "+transaccion);
    }
}
