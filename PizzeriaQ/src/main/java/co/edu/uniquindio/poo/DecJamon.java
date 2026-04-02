package co.edu.uniquindio.poo;

import java.util.ArrayList;

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

    @Override
    public ArrayList<String> getIngredientes(){
        ArrayList<String> listIngredientes = pizza.getIngredientes();
        listIngredientes.add("Jamon");
        return listIngredientes;
    }
}
