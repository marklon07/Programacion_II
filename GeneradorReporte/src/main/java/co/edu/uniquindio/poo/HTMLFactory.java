package co.edu.uniquindio.poo;

public class HTMLFactory extends ReporteFactory{
    public Reporte crearReporte(){
        return new ReporteHTML();
    }
}
