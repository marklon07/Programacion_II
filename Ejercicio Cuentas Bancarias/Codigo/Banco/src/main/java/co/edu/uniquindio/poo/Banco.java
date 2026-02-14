package co.edu.uniquindio.poo;
import java.util.ArrayList;

public class Banco {
    private String nombre;
    private ArrayList<Cuenta> listCuentas;
    private ArrayList<Corriente> listCorriente;
    private ArrayList<Ahorro> listAhorros;
    private ArrayList<Nomina> listNomina;

    public Banco(String nombre){
        this.nombre = nombre;
    }

    //METODO GET Y SET
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public ArrayList<Cuenta> getListCuentas(){
        return listCuentas;
    }

    public void setListCuentas(ArrayList<Cuenta> listCuentas){
        this.listCuentas = listCuentas;
    } 

    public ArrayList<Corriente> getListCorriente(){
        return listCorriente;
    }

    public void setListCorriente(ArrayList<Corriente> listCorriente){
        this.listCorriente = listCorriente;
    }

    public ArrayList<Ahorro> getListAhorros(){
        return listAhorros;
    }

    public void setListAhorros(ArrayList<Ahorro> listAhorros){
        this.listAhorros = listAhorros;
    }

    public ArrayList<Nomina> getListNomina(){
        return listNomina;
    }

    public void setListNomina(ArrayList<Nomina> listNomina){
        this.listNomina = listNomina;
    }
}
