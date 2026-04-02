package co.edu.uniquindio.poo;

import java.util.ArrayList;

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

    @Override
    public ArrayList<String> getIngredientes(){
        ArrayList<String> listIngredientes = pizza.getIngredientes();
        listIngredientes.add("Queso");
        return listIngredientes;
    }
}
