package Principal;

import br.com.thinksolutions.ScreemMatch.Modelo.Filme;
import br.com.thinksolutions.ScreemMatch.Modelo.Series;
import br.com.thinksolutions.ScreemMatch.Modelo.Titulo;

import java.util.ArrayList;
import java.util.Collections;

public class PrincipalComListas {
    public static void main(String[] args) {

        //Criando objetos
        var filme1 = new Filme("Star Wars", 1978);
        var filme2 = new Filme("Vingadores", 2012);
        var serie1 = new Series("Dark", 2018, 60, 8);

        //Avaliando os conteúdos
        filme1.avaliar(8);
        filme2.avaliar(9);
        serie1.avaliar(10);

        //Criando lista de filmes
        ArrayList<Titulo> lista = new ArrayList<>();

        lista.add(filme1);
        lista.add(filme2);
        lista.add(serie1);

        //Percorrendo a lista
        /*for(Titulo item: lista){
            System.out.println(item.getNome());

            //Atribuindo a referencia de item (variável que está sendo usada para
            percorrer a lista) em uma variável do tipo Filme, pois Titulo é genérica
            demais para usar o método getClassificacao() que existe em filme e série.
            Também é feito o casting, pois uma variável do tipo Filme não pode recer
            um Titulo (item).
            Filme filme = (Filme) item;
            System.out.println("Classsificação: " + filme.getClassificacao());
        }*/

        //Resumo do código acima
        for(Titulo item: lista){
            System.out.println(item.getNome());
            if(item instanceof Filme filme)
                System.out.println("Classsificação: " + filme.getClassificacao());
        }

        ArrayList<String> personagens = new ArrayList<>();
        personagens.add("Jon Snow");
        personagens.add("Sansa Stark");
        personagens.add("Tyrion Lanister");
        personagens.add("Hodor");
        //Imprimindo personagens da listas
        System.out.println("Antes da ordenação: ");
        System.out.println(personagens);

        //Ordenando a lista
        Collections.sort(personagens);
        System.out.println("Depois da ordenação: ");
        System.out.println(personagens);

        //Ordenando lista de objetos pelo nome
        Collections.sort(lista);
        System.out.println("Depois da ordenação: ");
        System.out.println(lista);
    }
}
