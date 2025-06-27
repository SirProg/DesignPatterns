package FactoryMethod;

public abstract class Tarjeta_Credito {
    private float costoAnual;
    private int limite;
    abstract Tarjeta_Credito crearTarjeta();
}