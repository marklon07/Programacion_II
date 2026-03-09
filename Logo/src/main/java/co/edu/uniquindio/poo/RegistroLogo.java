package co.edu.uniquindio.poo;
import java.util.HashMap;
import java.util.Map;


public class RegistroLogo {
    private Map<String, Logo> mapaLogos = new HashMap<>();

    public void registrar(String llave, Logo logo){
        mapaLogos.put(llave, logo);
    }

    public Prototipo obtener(String llave){
        Prototipo logo = mapaLogos.get(llave);
        if(llave == null) throw new RuntimeException("No existe: " + llave);
        return logo.clonar();
    }
}
