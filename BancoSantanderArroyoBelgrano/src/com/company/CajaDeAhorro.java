package com.company;

public class CajaDeAhorro extends Cuenta{

   //Atributo

    private Double Interes;

    //Constructor

    public CajaDeAhorro(Cliente titular) {
        super(titular);
        this.interes=10.0;


}
    public void cobrarInteres(){
        depositar(platita: getSaldo()*interes);
    }
}


//