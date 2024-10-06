package br.com.thinksolutions.ScreemMatch.Modelo;

public class Series extends Titulo{
    private int qtdTemporadas;
    private int epPorTemporada;
    private int duracaoEp;
    private boolean ativa;

    public Series(String nome, int anoLancamento, int duracaoEp, int epPorTemporada) {
        super(nome, anoLancamento);
        this.duracaoEp = duracaoEp;
        this.epPorTemporada = epPorTemporada;
    }

    public int getQtdTemporadas() {
        return qtdTemporadas;
    }

    public void setQtdTemporadas(int qtdTemporadas) {
        this.qtdTemporadas = qtdTemporadas;
    }

    public int getEpPorTemporada() {
        return epPorTemporada;
    }

    public void setEpPorTemporada(int epPorTemporada) {
        this.epPorTemporada = epPorTemporada;
    }

    public double getDuracaoEp() {
        return duracaoEp;
    }

    public void setDuracaoEp(int duracaoEp) {
        this.duracaoEp = duracaoEp;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return qtdTemporadas * epPorTemporada * duracaoEp;
    }

}
