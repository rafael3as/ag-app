package com.sgp.modelos;

public class Pet {

    private String nome;
    private int idade;
    private double peso;
    private String especie;

    public Pet() {
        this.nome = "Rex";
        this.idade = 2;
        this.peso = 10.0;
        this.especie = "Cachorro";
    }

    public Pet(String nome, int idade, double peso, String especie) {
        setNome(nome);
        setIdade(idade);
        setPeso(peso);
        setEspecie(especie);
    }

    public int idadeEmMeses() {
        return idade * 12;
    }

    public String descricao() {
        return nome + " é um " + especie + " com " + idade + " anos e pesa " + peso + "kg.";
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getPeso() {
        return peso;
    }

    public String getEspecie() {
        return especie;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isEmpty()) return;
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if (idade < 0 || idade > 30) return;
        this.idade = idade;
    }

    public void setPeso(double peso) {
        if (peso <= 0) return;
        this.peso = peso;
    }

    public void setEspecie(String especie) {
        if (especie == null || especie.isEmpty()) return;
        this.especie = especie;
    }

    @Override
    public String toString() {
        return "Pet [nome=" + nome + ", idade=" + idade ", peso=" + peso + ", especie=" + especie + "]";
    }
}