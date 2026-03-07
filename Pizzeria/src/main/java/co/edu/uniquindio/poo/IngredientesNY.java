package co.edu.uniquindio.poo;

public class IngredientesNY implements IngredientesFactory{
    

    public Salsa crearSalsa(){
        return new SalsaNY();
    }

    public Queso crearQueso(){
        return new QuesoNY();
    }

    public Masa crearMasa(){
        return new MasaNY();
    }

}
