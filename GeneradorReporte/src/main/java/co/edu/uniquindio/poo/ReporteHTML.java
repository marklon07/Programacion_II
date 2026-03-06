package co.edu.uniquindio.poo;

public class ReporteHTML implements Reporte{
    public boolean generar(){
        System.out.println("Reporte HTML generado");
        return true;
    }

    public String getTipo(){
        return "Reporte HTML";
    }
}
