package co.edu.uniquindio.poo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Plato empanada = new Plato("Empanada", 5000);
        Plato patacon = new Plato("Patacon",3500);
        Plato bandeja = new Plato("Bandeja Paisa", 18000);
        Plato trucha = new Plato("Trucha", 15000);
        Plato limonada = new Plato("Limonada", 4000);
        Plato tinto = new Plato("Tinto", 2000);

        //SECCION DE ENTRADAS
        Seccion entradas = new Seccion("Entradas");
        entradas.agregar(empanada); entradas.agregar(patacon);

        //SECCION DE PLATOS FUERTES
        Seccion fuerte = new Seccion("Platos Fuertes");
        fuerte.agregar(bandeja); fuerte.agregar(trucha);

        //SUBSECCION DE BEBIDAS FRIAS
        Seccion bebidasFrias = new Seccion("Bebidas Frias");
        bebidasFrias.agregar(limonada);

        //SUBSECCION DE BEBIDAS CALIENTES
        Seccion bebidasCalientes = new Seccion("Bebidas Calientes");
        bebidasCalientes.agregar(tinto);

        //SECCION DE BEBIDAS
        Seccion bebidas = new Seccion("Bebidas");
        bebidas.agregar(bebidasFrias); bebidas.agregar(bebidasCalientes);

        Seccion menu = new Seccion("MENU DEL DIA");
        menu.agregar(entradas); menu.agregar(fuerte); menu.agregar(bebidas);
        menu.mostrar(" ");
        System.out.println("\nTotal Productos: " + menu.contarItem());
        System.out.println("Total Precio: " + menu.getPrecio() +"\n");
    }
}