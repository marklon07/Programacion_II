package co.edu.uniquindio.poo;

public class ReporteExcel implements Reporte{
    public boolean generar(){
        System.out.println("Reporte Excel generado");
        return true;
    }

    public String getTipo(){
        return "Reporte Excel";
    }

}
