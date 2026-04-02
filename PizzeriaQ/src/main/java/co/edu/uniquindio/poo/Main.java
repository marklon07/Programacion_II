package co.edu.uniquindio.poo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Piza 1 con: Queso, Jamon, Pepperoni ($24500)
        Pizza pizza1 = new PizzaBasica();
        pizza1 = new DecQueso(pizza1);
        pizza1 = new DecJamon(pizza1);
        pizza1 = new DecChampiñones(pizza1);

        //Pizza 2 con: Queso, Pepperoni ($23000)
        Pizza pizza2 = new PizzaBasica();
        pizza2 = new DecQueso(pizza2);
        pizza2 = new DecPepperoni(pizza2);

        System.out.println(pizza1.getDescripcion() + " ($" + pizza1.getPrecio() + ")");
        System.out.println(pizza1.getIngredientes());

        System.out.println(pizza2.getDescripcion() + " ($" + pizza2.getPrecio() + ")");
        System.out.println(pizza2.getIngredientes());
    }
}