package bridge;

public abstract class T_Atencion {
    protected Canal canal;

    public T_Atencion(Canal canal){
        this.canal=canal ;
    }

    public abstract void atender(String transaccion);
    
}
