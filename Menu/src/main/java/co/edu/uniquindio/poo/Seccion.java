package co.edu.uniquindio.poo;

import java.util.ArrayList;

public class Seccion implements ItemMenu{
    private String nombre;
    private ArrayList<ItemMenu> listSeccion = new ArrayList<>();

    public Seccion(String nombre){
        this.nombre = nombre;
        this.listSeccion = listSeccion;
    }

    @Override
    public double getPrecio(){
        double total = 0;
        for(ItemMenu item : listSeccion){
            total += item.getPrecio();
        }
        return total;
    }

    @Override
    public void mostrar(String indent){
        System.out.println(indent + nombre + ":");
        for (ItemMenu item : listSeccion){
            item.mostrar(indent + " ");
        }
    }

    public void agregar(ItemMenu item){
        listSeccion.add(item);
    }

    @Override
    public int contarItem(){
        int items = 0;
        for(ItemMenu item : listSeccion){
            items += item.contarItem();
        }
        return items;
    }

}
