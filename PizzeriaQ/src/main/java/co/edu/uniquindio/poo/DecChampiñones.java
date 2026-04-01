package co.edu.uniquindio.poo;

public class DecChampiñones extends Decorator{
    public DecChampiñones(Pizza pizza){
        super(pizza);
    }

    @Override
    public double getPrecio(){
        return pizza.getPrecio() + 2500;
    }

    @Override
    public String getDescripcion(){
        return pizza.getDescripcion() + " + Champiñones";
    }
}
