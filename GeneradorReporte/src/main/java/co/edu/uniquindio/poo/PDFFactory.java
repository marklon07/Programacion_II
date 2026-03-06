package co.edu.uniquindio.poo;

public class PDFFactory extends ReporteFactory{
    public Reporte crearReporte(){
        return new ReportePDF();
    }

}
