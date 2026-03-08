package co.edu.uniquindio.poo;

import java.util.ArrayList;

public class PlantillaEmail implements Prototipo{
    private String asunto;
    private String cuerpoHTML;
    private ArrayList<String> listDestinatarios = new ArrayList<>();
    private ArrayList<String> listEtiquetas = new ArrayList<>();

    public PlantillaEmail(String asunto, String cuerpoHTML, ArrayList<String> listDestinatarios, ArrayList<String> listEtiquetas){
        this.asunto = asunto;
        this.cuerpoHTML = cuerpoHTML;
        this.listDestinatarios = listDestinatarios;
        this.listEtiquetas = listEtiquetas;
    }

    public Prototipo clonar(){
       return new PlantillaEmail(this.asunto, this.cuerpoHTML, new ArrayList<>(this.listDestinatarios), new ArrayList<>(this.listEtiquetas)); 
    }

    
}
