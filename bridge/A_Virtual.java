package bridge;

public class A_Virtual extends T_Atencion {
    public A_Virtual(Canal canal){
        super(canal) ;
    }
    public void atender(String transaccion) {
        System.out.println("Atención Virtual:");
        canal.procesar(transaccion);
    }
}