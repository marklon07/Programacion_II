package co.edu.uniquindio.poo;

public class Main {
    public static void main(String[] args) {
        ReporteFactory reporte1 = new PDFFactory();
        reporte1.crearReporte().generar();

        ReporteFactory reporte2 = new HTMLFactory();
        reporte2.crearReporte().generar();
    }

}