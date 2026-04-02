package co.edu.uniquindio.poo;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class PizzaBasica implements Pizza{
    private ArrayList<String> listIngredientes = new ArrayList<>();
    @Override
    public double getPrecio() {
        return 15000; }

    @Override
    public String getDescripcion() {
        return "Pizza masa tradicional"; }

    @Override
    public ArrayList<String> getIngredientes(){
         return new ArrayList<String>();
    }
}
