package co.edu.uniquindio.poo;

public abstract class Cuenta {
    private final String numeroCuenta;
    private String titular;
    protected double saldo;
    private String fechaApertura;
    private Estado estado;

    public Cuenta(String numeroCuenta, String titular, double saldo, String fechaApertura, Estado estado){
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldo;
        this.fechaApertura = fechaApertura;
        this.estado = estado;
    }
    //METODOS ABSTRACTOS
    public abstract boolean depositar(double deposito, String numeroCuenta, Banco banco);

    public abstract boolean retirar(double retiro, String numeroCuenta, Banco banco);

    public abstract double consultarSaldo(String numeroCuenta, Banco banco);

    public abstract boolean bloquear(String numeroCuenta, Banco banco);

    public abstract boolean desbloquear(String numeroCuenta, Banco banco);

    public abstract String mostrarInfo(String numeroCuenta, Banco banco);


    //METODOS GET Y SET
    public String getNumeroCuenta(){
        return numeroCuenta;
    }

    public String getTitular(){
        return titular;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public String getFechaApertura(){
        return fechaApertura;
    }

    public void setFechaApertura(String fechaApertura){
        this.fechaApertura = fechaApertura;
    }

    public Estado getEstado(){
        return estado;
    }

    public void setEstado(Estado estado){
        this.estado = estado;
    }

}
