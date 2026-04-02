package co.edu.uniquindio.poo;

import java.util.ArrayList;

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

    @Override
    public ArrayList<String> getIngredientes(){
        ArrayList<String> listIngredientes = pizza.getIngredientes();
        listIngredientes.add("Pepperoni");
        return listIngredientes; 
    }
}
