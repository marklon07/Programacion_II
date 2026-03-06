package co.edu.uniquindio.poo;

public class ExcelFactory extends ReporteFactory{
    public Reporte crearReporte(){
        return new ReporteExcel();
    }
}
