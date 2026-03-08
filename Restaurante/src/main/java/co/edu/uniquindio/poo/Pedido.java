package co.edu.uniquindio.poo;

public class Pedido {
    private String platoPrincipal;
    private String entrada;
    private String postre;
    private String bebida;
    private String observaciones;

    private Pedido(Builder builder){
        this.platoPrincipal = builder.platoPrincipal;
        this.entrada = builder.entrada;
        this.postre = builder.postre;
        this.bebida = builder.bebida;
        this.observaciones = builder.observaciones;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PEDIDO ");
        sb.append("Plato Principal: ").append(platoPrincipal);
        sb.append(", Entrada: ").append(entrada);
        sb.append(", Postre: ").append(postre);
        sb.append(", Bebida: ").append(bebida);
        sb.append(", Observaciones: ").append(observaciones);
        return sb.toString();
    }

    public static class Builder{
        private String platoPrincipal;
        private String entrada;
        private String postre;
        private String bebida;
        private String observaciones;

        public Builder conPlatoPrincipal(String i){
            platoPrincipal = i;
            return this;
        }

        public Builder conEntrada(String i){
            entrada = i;
            return this;
        }

        public Builder conPostre(String i){
            postre = i;
            return this;
        }

        public Builder conBebida(String i){
            bebida = i;
            return this;
        }

        public Builder conObservaciones(String i){
            observaciones = i;
            return this;
        }

        public Pedido build(){
            if( platoPrincipal == null || platoPrincipal.isBlank()) throw new IllegalStateException("Plato Principal requerido.");
            return new Pedido(this);
        }
    }

    

}
