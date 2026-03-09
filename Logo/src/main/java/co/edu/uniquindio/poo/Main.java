package co.edu.uniquindio.poo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String color1 = "Rojo"; String color2 = "Azul"; ArrayList<String> colores = new ArrayList<>();
        colores.add(color1); colores.add(color2); 

        String color3 = "Verde"; String color4 = "Gris"; ArrayList<String> varianteColores = new ArrayList<>();
        varianteColores.add(color3); varianteColores.add(color4);

        
        Logo logo1 = new Logo("Java", colores, 5, 7, "PNG", "...");
        Logo logo2 = new Logo("C++", colores, 4, 6, "PDF", "...");

        RegistroLogo registro = new RegistroLogo();
        registro.registrar("Logo Corporativo", logo1);
        registro.registrar("Logo Vintage", logo2);

        Prototipo clon = logo1.clonar();
        Logo clonLogo = (Logo)clon;
        clonLogo.setListColores(varianteColores);

        System.out.println(logo1);
        System.out.println(clonLogo);
        System.out.println(registro.obtener("Logo Vintage"));

    }
}