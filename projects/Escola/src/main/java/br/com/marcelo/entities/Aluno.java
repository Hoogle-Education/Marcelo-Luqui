package br.com.marcelo.entities;

import java.util.Comparator;

public class Aluno extends Pessoa {

    private String RA;
    private double notaFinal;

    public Aluno(String RA, String nome, int idade, double altura) {
        super(nome, idade, altura);
        this.RA = RA;
    }
    public Aluno(String nome, int idade, double altura, String RA) {
        super(nome, idade, altura);
        this.RA = RA;
    }

    // getters and setters

    public String getRA() {
        return RA;
    }

    public void setRA(String RA) {
        this.RA = RA;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }

    // métodos
    @Override
    public String whoAmI(){
        return "Eu sou uma Pessoa e um Aluno";
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", apelido='" + apelido + '\'' +
                ", idade=" + idade +
                ", altura=" + altura +
                ", RA='" + RA + '\'' +
                ", notaFinal=" + notaFinal +
                "} ";
    }


}
