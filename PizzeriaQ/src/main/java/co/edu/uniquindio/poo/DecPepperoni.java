package co.edu.uniquindio.poo;

public class DecPepperoni extends Decorator{
    public DecPepperoni(Pizza pizza){
        super(pizza);
    }

    @Override
    public double getPrecio(){
        return pizza.getPrecio() + 5000;
    }

    @Override
    public String getDescripcion(){
        return pizza.getDescripcion() + " + Pepperoni";
    }
}
