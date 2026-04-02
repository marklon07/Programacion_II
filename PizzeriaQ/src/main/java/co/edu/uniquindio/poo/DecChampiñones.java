package co.edu.uniquindio.poo;

import java.util.ArrayList;

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

    @Override
    public ArrayList<String> getIngredientes(){
        ArrayList<String> listIngredientes = pizza.getIngredientes();
        listIngredientes.add("Champiñones");
        return listIngredientes;
    }
}
