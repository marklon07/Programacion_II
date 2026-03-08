package co.edu.uniquindio.poo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> destinatarios = new ArrayList<>(); ArrayList<String> etiquetas = new ArrayList<>();
        String i = "Diego"; String j = "X";
        destinatarios.add(i); etiquetas.add(j);
        
        PlantillaEmail plantilla1 = new PlantillaEmail("Universidad", "Cordial Saludo:", destinatarios, etiquetas);
        PlantillaEmail plantilla2 = new PlantillaEmail("Trabajo", "Cordial Saludo:", destinatarios, etiquetas);
        Prototipo k = plantilla1.clonar();
        Prototipo s = k.clonar();
        

        RegistroPlantillas registro = new RegistroPlantillas();
        registro.registar("Universidad", plantilla1);
        registro.registar("Trabajo", plantilla2);

        System.out.println(k);
        System.out.println(s);
        System.out.println(plantilla1);
        System.out.println(plantilla2);
        System.out.println(registro.obtener("Universidad"));
        System.out.println(registro.obtener("Casa"));

    }
}