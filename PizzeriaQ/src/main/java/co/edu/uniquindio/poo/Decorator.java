package co.edu.uniquindio.poo;

public abstract class Decorator implements Pizza{
    protected Pizza pizza;

    public Decorator(Pizza comida){
        this.pizza = comida;
    }

    @Override
    public double getPrecio(){
        return pizza.getPrecio();
    }

    @Override
    public String getDescripcion(){
        return pizza.getDescripcion();
    }
}
