package br.com.catalisa.Data.Masking.API.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import java.math.BigDecimal;

public class RequisicaoDadosSensiveis {

    @NotBlank(message = "CPF é obrigatório")
    @Size(min = 11, max = 11, message = "CPF deve conter exatamente 11 dígitos")
    @Pattern(regexp = "\\d{11}", message = "CPF deve conter apenas números")
    private String cpf;

    @NotBlank(message = "RG é obrigatório")
    @Size(min = 5, max = 12, message = "RG deve conter entre 5 e 12 dígitos")
    @Pattern(regexp = "\\d{5,12}", message = "RG deve conter apenas números")
    private String rg;

    @NotBlank(message = "Nome é obrigatório")
    @Size(max = 100, message = "Nome deve conter no máximo 100 caracteres")
    private String nome;

    @NotNull(message = "Salário é obrigatório")
    private BigDecimal salario;

    @NotBlank(message = "Número da conta é obrigatório")
    @Size(min = 5, max = 20, message = "Número da conta deve conter entre 5 e 20 dígitos")
    @Pattern(regexp = "\\d{5,20}", message = "Número da conta deve conter apenas números")
    private String numeroConta;

    @NotBlank(message = "Cargo é obrigatório")
    @Size(max = 50, message = "Cargo deve conter no máximo 50 caracteres")
    private String cargo;

    // Getters e Setters

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}