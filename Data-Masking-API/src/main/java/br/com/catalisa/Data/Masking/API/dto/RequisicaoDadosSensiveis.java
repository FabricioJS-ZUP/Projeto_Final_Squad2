package br.com.catalisa.Data.Masking.API.dto;

import jakarta.validation.constraints.NotBlank;

public class RequisicaoDadosSensiveis {

    @NotBlank(message = "CPF é obrigatório")
    private String cpf;

    @NotBlank(message = "Número do cartão é obrigatório")
    private String cartao;

    public RequisicaoDadosSensiveis() {}

    public RequisicaoDadosSensiveis(String cpf, String cartao) {
        this.cpf = cpf;
        this.cartao = cartao;
    }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public String getCartao() { return cartao; }
    public void setCartao(String cartao) { this.cartao = cartao; }
}