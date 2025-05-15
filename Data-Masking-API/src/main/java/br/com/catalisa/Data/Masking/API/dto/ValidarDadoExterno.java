package br.com.catalisa.Data.Masking.API.dto;

public class ValidarDadoExterno {
    private String informacao;

    public ValidarDadoExterno() {}

    public ValidarDadoExterno(String informacao) {
        this.informacao = informacao;
    }

    public String getInformacao() { return informacao; }
    public void setInformacao(String informacao) { this.informacao = informacao; }
}