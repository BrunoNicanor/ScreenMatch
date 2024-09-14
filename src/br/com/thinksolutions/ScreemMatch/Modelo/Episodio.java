package br.com.thinksolutions.ScreemMatch.Modelo;

import br.com.thinksolutions.calculos.Classificavel;

public class Episodio implements Classificavel {
    private String nome;
    private int numero;
    private Series serie;
    private int totalVisualizacoes;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Series getSerie() {
        return serie;
    }

    public void setSerie(Series serie) {
        this.serie = serie;
    }

    public int getTotalVisualizacoes() {
        return totalVisualizacoes;
    }

    public void setTotalVisualizacoes(int totalVisualizacoes) {
        this.totalVisualizacoes = totalVisualizacoes;
    }

    @Override
    public int getClassificacao() {
        if(totalVisualizacoes > 100)
            return 4;
        else
            return 2;
    }
}
