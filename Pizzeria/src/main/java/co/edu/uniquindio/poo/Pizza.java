package co.edu.uniquindio.poo;

public class Pizza{
    private IngredientesFactory ingredientes;

    public Pizza(IngredientesFactory ingredientes){
        this.ingredientes = ingredientes;
    }

    public Pizza armarPizza(IngredientesFactory ingredientes){
        return new Pizza(ingredientes);
    }

    public String descripcioPizza(IngredientesFactory ingredientes){
        return ingredientes.crearSalsa().descripcion() + ", " + ingredientes.crearQueso().descripcion() + ", " + ingredientes.crearMasa().descripcion();
    }

    public double precioPizza(IngredientesFactory ingredientes){
        return ingredientes.crearSalsa().precio() + ingredientes.crearQueso().precio() + ingredientes.crearMasa().precio();
    }

    @Override
    public String toString(){
        return "Fabrica: " + ingredientes.getClass().getSimpleName() + 
        "\nDescripcion: " + descripcioPizza(ingredientes) +
        "\nPrecio: " + precioPizza(ingredientes);
    }
}
