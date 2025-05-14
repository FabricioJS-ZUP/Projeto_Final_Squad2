package br.com.catalisa.Data.Masking.API.dto;

public class RespostaDadosMascarados {

    private String cpfMascarado;
    private String cartaoMascarado;

    public RespostaDadosMascarados() {}

    public RespostaDadosMascarados(String cpfMascarado, String cartaoMascarado) {
        this.cpfMascarado = cpfMascarado;
        this.cartaoMascarado = cartaoMascarado;
    }

    public String getCpfMascarado() { return cpfMascarado; }
    public void setCpfMascarado(String cpfMascarado) { this.cpfMascarado = cpfMascarado; }

    public String getCartaoMascarado() { return cartaoMascarado; }
    public void setCartaoMascarado(String cartaoMascarado) { this.cartaoMascarado = cartaoMascarado; }
}