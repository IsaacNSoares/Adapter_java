package org.example;

public class RetornoTexto implements IRetornoTEF {

    private String retorno;

    @Override
    public String getRetorno() {
        return this.retorno;
    }

    @Override
    public void setRetorno(String retorno) {
        this.retorno = retorno;
    }
}