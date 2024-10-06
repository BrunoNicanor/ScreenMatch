package br.com.thinksolutions.ScreemMatch.Modelo;

import br.com.thinksolutions.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String exibicao;

    public Filme(String nome, int anoLancamento) {
        super(nome, anoLancamento);
    }


    public String getExibicao() {
        return exibicao;
    }

    public void setExibicao(String exibicao) {
        this.exibicao = exibicao;
    }

    @Override
    public int getClassificacao() {
        return (int)pegaMedia() / 2;
    }

    @Override
    public String toString() {
        return "Filme: " + this.getNome() + "(" + this.getAnoLancamento() + ")";
    }
}
