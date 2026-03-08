package co.edu.uniquindio.poo;

public class Main {
    public static void main(String[] args) {
        Pedido pedido1 = new Pedido.Builder().conPlatoPrincipal("Frijoles").conEntrada("Ceviche").conPostre("Arroz con leche").conBebida("Limonada").conObservaciones("Limonada sin Azucar").build();
        Pedido pedido2 = new Pedido.Builder().conPlatoPrincipal("Arroz con Pollo").conEntrada("Ajiaco").conPostre("Torta de Banano").conBebida("Jugo de Maracuya").build();
        //Pedido pedido3 = new Pedido.Builder().conPlatoPrincipal("").conEntrada("Ceviche").conPostre("Arroz con leche").conBebida("Limonada").build();

        System.out.println(pedido1);
        System.out.println(pedido2);
        //System.out.println(pedido3);
        
    }   
}