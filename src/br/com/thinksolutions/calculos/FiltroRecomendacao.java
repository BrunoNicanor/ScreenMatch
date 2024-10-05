package br.com.thinksolutions.calculos;

import br.com.thinksolutions.ScreemMatch.Modelo.Titulo;

public class FiltroRecomendacao {

    public String filtra(Classificavel classificavel){
        if(classificavel.getClassificacao() >= 4){
            return "Está entre os preferidos do momento";
        } else if (classificavel.getClassificacao() >= 2) {
            return  "Muito bem avaliado no momento!";
        }else {
            return "Coloque na sua lista para assistir depois.";
        }
    }
}
