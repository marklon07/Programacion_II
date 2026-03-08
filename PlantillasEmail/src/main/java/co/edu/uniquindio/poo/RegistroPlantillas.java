package co.edu.uniquindio.poo;

import java.util.HashMap;
import java.util.Map;


public class RegistroPlantillas {
    private Map<String, Prototipo> mapaPlantillas = new HashMap<>();

    public void registar( String llave, Prototipo prototipo){
        mapaPlantillas.put(llave, prototipo);
    }

    public Prototipo obtener(String llave){
        Prototipo prototipo = mapaPlantillas.get(llave);
        if (prototipo == null) throw new RuntimeException("No Existe: "+ llave);
        return prototipo.clonar();  
    }

}
 