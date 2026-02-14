package co.edu.uniquindio.poo;

public class Corriente extends Cuenta {
    public Corriente(String numeroCuenta, String titular, double saldo, String fechaApertura, Estado estado){
        super(numeroCuenta, titular, saldo, fechaApertura, estado);
    }

    //METODOS ABSTRACTOS
    @Override
    public boolean depositar(double deposito, String numeroCuenta, Banco banco){
        if (deposito <= 0) return false;
        for(Corriente corriente : banco.getListCorriente()){
            if(corriente.getNumeroCuenta().equals(numeroCuenta)){
                corriente.setSaldo(corriente.getSaldo()+deposito);
                return true;
            }
        }
        return false;
    }
    
    @Override
    public boolean retirar(double retiro, String numeroCuenta, Banco banco){
        if(retiro <= 0) return false;
        for(Corriente corriente : banco.getListCorriente()){
            if(corriente.getNumeroCuenta().equals(numeroCuenta)){
                if(corriente.getSaldo() >= retiro){
                    corriente.setSaldo(corriente.getSaldo() - retiro);
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
        for(Corriente corriente : banco.getListCorriente()){
            if(corriente.getNumeroCuenta().equals(numeroCuenta)){
                i = corriente.getSaldo();
            }
        }
        return i;
    }

    @Override
    public boolean bloquear(String numeroCuenta, Banco banco){
        for(Corriente corriente : banco.getListCorriente()){
            if(corriente.getNumeroCuenta().equals(numeroCuenta)){
                if(corriente.getEstado().equals(Estado.ACTIVA)){
                    corriente.setEstado(Estado.BLOQUEADA);
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
        for(Corriente corriente : banco.getListCorriente()){
            if(corriente.getNumeroCuenta().equals(numeroCuenta)){
                if(corriente.getEstado().equals(Estado.BLOQUEADA)){
                    corriente.setEstado(Estado.ACTIVA);
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
        for(Corriente corriente : banco.getListCorriente()){
            if(corriente.getNumeroCuenta().equals(numeroCuenta)){
                i = "Info";
            }
        }
        return i;
    }

    public void sobregiroCorriente(){
    }

    public void comisionMensual(){
    }

    public void interesMensualCorriente(){
    }

    
}
