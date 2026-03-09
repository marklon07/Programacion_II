package co.edu.uniquindio.poo;

import java.util.ArrayList;

public class Logo implements Prototipo{
    private String nombre;
    private ArrayList<String> listColores = new ArrayList<>();
    private int ancho;
    private int alto;
    private String formato;
    private String eslogan;

    public Logo(String nombre, ArrayList<String> listcolores, int ancho, int alto, String formato, String eslogan){
        this.nombre = nombre;
        this.listColores = listcolores;
        this.ancho = ancho;
        this.alto = alto;
        this.formato = formato;
        this.eslogan = eslogan;
    }

    public Prototipo clonar(){
        return new Logo(this.nombre, new ArrayList<String>(this.listColores), this.ancho, this.alto, this.formato, this.eslogan);
    }

    public void setListColores(ArrayList<String> listColores) {
        this.listColores = listColores;
    }

    @Override
    public String toString() {
        return "Logo " +"[Nombre: " + nombre + ", lista de Colores: " + listColores + ", Ancho: " + ancho + ", Alto: " + alto
                + ", Formato: " + formato + ", Eslogan: " + eslogan + "]";
    }

    
    
}
