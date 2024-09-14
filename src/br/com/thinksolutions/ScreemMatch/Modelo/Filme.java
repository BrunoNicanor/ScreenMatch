package br.com.thinksolutions.ScreemMatch.Modelo;

import br.com.thinksolutions.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String exibicao;

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
}
