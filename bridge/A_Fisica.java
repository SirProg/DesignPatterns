package bridge;

public class A_Fisica extends T_Atencion {
    public A_Fisica(Canal canal){
        super(canal) ;
    }
    public void atender(String transaccion) {
        System.out.println("Atención Presencial:");
        canal.procesar(transaccion);
    }
}
