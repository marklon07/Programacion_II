package co.edu.uniquindio.poo;

public class Nomina extends Cuenta{
    public Nomina(String numeroCuenta, String titular, double saldo, String fechaApertura, Estado estado){
        super(numeroCuenta, titular, saldo, fechaApertura, estado);
    }
    
    //METODOS ABSTRACTOS
    @Override
    public boolean depositar(double deposito, String numeroCuenta, Banco banco){
        if (deposito <= 0) return false;
        for(Nomina nomina : banco.getListNomina()){
            if(nomina.getNumeroCuenta().equals(numeroCuenta)){
                nomina.setSaldo(nomina.getSaldo()+deposito);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean retirar(double retiro, String numeroCuenta, Banco banco){
        if(retiro <= 0)return false;
        for(Nomina nomina : banco.getListNomina()){
            if(nomina.getNumeroCuenta().equals(numeroCuenta)){
                if(nomina.getSaldo() >= retiro){
                    nomina.setSaldo(nomina.getSaldo() - retiro);
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
        for(Nomina nomina : banco.getListNomina()){
            if((nomina.getNumeroCuenta().equals(numeroCuenta))){
                i = nomina.getSaldo();
            }
        }
        return i;
    }

    @Override
    public boolean  bloquear(String numeroCuenta, Banco banco){
        for(Nomina nomina : banco.getListNomina()){
            if(nomina.getNumeroCuenta().equals(numeroCuenta)){
                if(nomina.getEstado().equals(Estado.ACTIVA)){
                    nomina.setEstado(Estado.BLOQUEADA);
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
        for(Nomina nomina : banco.getListNomina()){
            if(nomina.getNumeroCuenta().equals(numeroCuenta)){
                if(nomina.getEstado().equals(Estado.BLOQUEADA)){
                    nomina.setEstado(Estado.ACTIVA);
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
        for(Nomina nomina : banco.getListNomina()){
            if(nomina.getNumeroCuenta().equals(numeroCuenta)){
                i = "Info";
            }
        }
        return i;
    }

    public void cobroComision(){
    }

    public void cambioCorriente(){
    }

}
