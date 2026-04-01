package co.edu.uniquindio.poo;

public class DecJamon extends Decorator{
    public DecJamon (Pizza pizza){
        super(pizza);
    }

    @Override
    public double getPrecio(){
        return pizza.getPrecio() + 4000;
    }

    @Override
    public String getDescripcion(){
        return pizza.getDescripcion() + " + Jamon";
    }
}
