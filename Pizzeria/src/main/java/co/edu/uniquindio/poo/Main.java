package co.edu.uniquindio.poo;

public class Main {
    public static void main(String[] args) {
        IngredientesFactory ingredientes1 = new IngredientesNY();
        IngredientesFactory ingredientes2 = new IngredientesChicago();
        
        Pizza pizza1 = new Pizza(ingredientes1);
        System.out.println(pizza1);


        Pizza pizza2 = new Pizza(ingredientes2);
        System.out.println(pizza2);
    }
}