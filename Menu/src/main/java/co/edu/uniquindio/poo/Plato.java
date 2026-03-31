package co.edu.uniquindio.poo;

public class Plato implements ItemMenu{
    private String nombre;
    private double precio;

    public Plato(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public double getPrecio(){
        return precio;
    }

    @Override
    public void mostrar(String indent){
        System.out.println(indent + "-" + nombre);
    }

    @Override
    public int contarItem(){
        return 1;
    }


}
