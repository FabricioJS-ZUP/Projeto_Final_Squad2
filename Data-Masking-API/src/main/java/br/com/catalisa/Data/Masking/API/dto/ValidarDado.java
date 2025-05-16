package br.com.catalisa.Data.Masking.API.dto;

import java.math.BigDecimal;

public class ValidarDado {
    public static boolean validarCpf(String cpf) {
        return cpf != null && cpf.matches("\\d{11}");
    }

    public static boolean validarRg(String rg) {
        return rg != null && rg.matches("\\d{9}");
    }

    public static boolean validarNome(String nome) {
        return nome != null && nome.matches("[A-Za-zÀ-ÿ ]{2,}");
    }

    public static boolean validarSalario(BigDecimal salario) {
        return salario != null && salario.compareTo(BigDecimal.ZERO) > 0;
    }

    public static boolean validarNumeroConta(String conta) {
        return conta != null && conta.matches("\\d{4,20}");
    }

    public static boolean validarCargo(String cargo) {
        return cargo != null && cargo.matches("[A-Za-zÀ-ÿ ]{2,}");
    }
}