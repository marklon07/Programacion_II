package co.edu.uniquindio.poo;

public class DecQueso extends Decorator{
    public DecQueso(Pizza pizza){
        super(pizza);
    }

    @Override
    public double getPrecio(){
        return pizza.getPrecio() + 3000;
    }

    @Override
    public String getDescripcion(){
        return pizza.getDescripcion() + " + Queso";
    }
}
