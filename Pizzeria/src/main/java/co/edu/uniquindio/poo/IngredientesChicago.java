package co.edu.uniquindio.poo;

public class IngredientesChicago implements IngredientesFactory{
    

    public Salsa crearSalsa(){
        return new SalsaChicago();
    }

    public Queso crearQueso(){
        return new QuesoChicago();
    }

    public Masa crearMasa(){
        return new MasaChicago();
    }
}
