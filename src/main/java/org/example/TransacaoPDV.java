package org.example;

public class TransacaoPDV {

    IRetornoTEF retorno;
    RetornoTEFAdapter persistencia;

    public TransacaoPDV() {
        retorno = new RetornoTexto();
        persistencia = new RetornoTEFAdapter(retorno);
    }

    public void setRetorno(String status) {
        retorno.setRetorno(status);
        persistencia.salvarRetorno();
    }

    public String getRetorno() {
        return persistencia.recuperarRetorno();
    }

    // Método apenas para mostrar que está a converter o texto para código numérico através do adaptador
    public float getCodigoRetorno() {
        return persistencia.getCodigoRetorno();
    }

}