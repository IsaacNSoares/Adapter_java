package org.example;

public class RetornoTEFAdapter extends RetornoERPLegado {

    private IRetornoTEF retornoTexto;

    public RetornoTEFAdapter(IRetornoTEF retornoTexto) {
        this.retornoTexto = retornoTexto;
    }

    public String recuperarRetorno() {
        if (this.getCodigoRetorno() >= 1.0f && this.getCodigoRetorno() < 2.0f)
            retornoTexto.setRetorno("AUTORIZADO");
        else
        if (this.getCodigoRetorno() >= 2.0f && this.getCodigoRetorno() < 3.0f)
            retornoTexto.setRetorno("NEGADO");
        else
        if (this.getCodigoRetorno() >= 3.0f && this.getCodigoRetorno() < 4.0f)
            retornoTexto.setRetorno("TIMEOUT");
        else
            retornoTexto.setRetorno("ERRO_COMUNICACAO");
        return retornoTexto.getRetorno();
    }

    public void salvarRetorno() {
        if (retornoTexto.getRetorno().equals("AUTORIZADO"))
            this.setCodigoRetorno(1.0f);
        else
        if (retornoTexto.getRetorno().equals("NEGADO"))
            this.setCodigoRetorno(2.0f);
        else
        if (retornoTexto.getRetorno().equals("TIMEOUT"))
            this.setCodigoRetorno(3.0f);
        else
            this.setCodigoRetorno(0.0f);
    }
}