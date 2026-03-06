package co.edu.uniquindio.poo;

public class ReportePDF implements Reporte{

    public boolean generar(){
        System.out.println("Reporte PDF generado");
        return true;
    }

    public String getTipo(){
        return "Reporte PDF";
    }
}
