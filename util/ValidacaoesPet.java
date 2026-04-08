package com.sgp.util;

public class ValidacoesPet {

    private ValidacoesPet() {
    }

    public static boolean nomeValido(String nome) {
        return nome != null && !nome.trim().isEmpty();
    }

    public static String mensagemErroNome(String nome) {
        return "Nome inválido! Não pode ser vazio.";
    }

    public static boolean idadeValida(int idade) {
        return idade >= 0 && idade <= 30;
    }

    public static String mensagemErroIdade(int idade) {
        return "Idade inválida! Deve estar entre 0 e 30 anos.";
    }

    public static boolean pesoValido(double peso) {
        return peso > 0;
    }

    public static String mensagemErroPeso(double peso) {
        return "Peso inválido! Deve ser maior que 0.";
    }

    public static boolean especieValida(String especie) {
        return especie != null && !especie.trim().isEmpty();
    }

    public static String mensagemErroEspecie(String especie) {
        return "Espécie inválida! Não pode ser vazia.";
    }
}