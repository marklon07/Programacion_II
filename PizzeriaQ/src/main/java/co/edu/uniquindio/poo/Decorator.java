package co.edu.uniquindio.poo;

import java.util.ArrayList;

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

    @Override
    public ArrayList<String> getIngredientes(){
        return pizza.getIngredientes();
    }
}
