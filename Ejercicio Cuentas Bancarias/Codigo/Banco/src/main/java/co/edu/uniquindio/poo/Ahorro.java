package co.edu.uniquindio.poo;

public class Ahorro extends Cuenta{
    public Ahorro(String numeroCuenta, String titular, double saldo,String fechaApertura, Estado estado){
        super(numeroCuenta, titular, saldo,fechaApertura, estado);
    }

    //METODOS ABSTRACTOS
    @Override
    public boolean depositar(double deposito, String numeroCuenta, Banco banco){
        if (deposito <= 0) return false;
        for(Ahorro ahorro : banco.getListAhorros()){
            if(ahorro.getNumeroCuenta().equals(numeroCuenta)){
                ahorro.setSaldo(ahorro.getSaldo()+deposito);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean retirar(double retiro, String numeroCuenta, Banco banco){
        if(retiro <= 0)return false;
        for(Ahorro ahorro : banco.getListAhorros()){
            if(ahorro.getNumeroCuenta().equals(numeroCuenta)){
                if(ahorro.getSaldo() >= retiro){
                    ahorro.setSaldo(ahorro.getSaldo() - retiro);
                    return true;
                }
                else{
                    return false;
                }
            }
        }
        return false;
    }

    @Override
    public double consultarSaldo(String numeroCuenta, Banco banco){
        double i = 0;
        for(Ahorro ahorro : banco.getListAhorros()){
            if((ahorro.getNumeroCuenta().equals(numeroCuenta))){
                i = ahorro.getSaldo();
            }
        }
        return i;
    }

    @Override
    public boolean  bloquear(String numeroCuenta, Banco banco){
        for(Ahorro ahorro : banco.getListAhorros()){
            if(ahorro.getNumeroCuenta().equals(numeroCuenta)){
                if(ahorro.getEstado().equals(Estado.ACTIVA)){
                    ahorro.setEstado(Estado.BLOQUEADA);
                    return true;
                }
                else{
                    return false;
                }
            }
        }
        return false;
    }
    

    @Override
    public boolean desbloquear(String numeroCuenta, Banco banco){
        for(Ahorro ahorro : banco.getListAhorros()){
            if(ahorro.getNumeroCuenta().equals(numeroCuenta)){
                if(ahorro.getEstado().equals(Estado.BLOQUEADA)){
                    ahorro.setEstado(Estado.ACTIVA);
                    return true;
                }
                else{
                    return false;
                }
            }
        }
        return false;
    }

    @Override
    public String mostrarInfo(String numeroCuenta, Banco banco){
        String i = null;
        for(Ahorro ahorro : banco.getListAhorros()){
            if(ahorro.getNumeroCuenta().equals(numeroCuenta)){
                i = "Info";
            }
        }
        return i;
    }

    public void interesMensualAhorros(){
    }

    public void saldoMin(){
    }

    public void sobregiroAhorros(){
    }
    
}
