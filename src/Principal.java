import br.com.thinksolutions.ScreemMatch.Modelo.Episodio;
import br.com.thinksolutions.ScreemMatch.Modelo.Filme;
import br.com.thinksolutions.ScreemMatch.Modelo.Series;
import br.com.thinksolutions.calculos.CalculadoraDeTempo;
import br.com.thinksolutions.calculos.FiltroRecomendacao;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        //Scanner entrada = new Scanner(System.in);

        //Criando Objeto
        Filme filme1 = new Filme();

        //Atribuindo valores aos atributos
        filme1.setNome("Avatar");
        filme1.setAnoLancamento(2009);
        filme1.setDuracaoEmMinutos(180);
        filme1.setIncluidoNoPlano(true);

        //Imprime os valores dos atributos
        System.out.println("Filmes");
        System.out.println("-------");
        filme1.exibirFichaTecnica();

        //Dando notas ao filme
        filme1.avaliar(9.1);
        filme1.avaliar(7.9);
        filme1.avaliar(8.0);
        filme1.avaliar(6.0);
        filme1.avaliar(6.5);
        filme1.avaliar(8.5);
        filme1.avaliar(10.0);

        //Imprimindo a média das avaliações
        System.out.println("Avaliação: " + filme1.pegaMedia());
        System.out.println("-----------------------------------");

        //Declarando variável com var
        var filme2 = new Filme();

        filme2.setNome("A Origem");
        filme2.setAnoLancamento(2010);
        filme2.setDuracaoEmMinutos(150);
        filme2.setIncluidoNoPlano(true);

        filme2.exibirFichaTecnica();

        filme2.avaliar(10);
        filme2.avaliar(8);
        filme2.avaliar(10);

        //Imprimindo com somente uma casa decimal após a vígula e pulando linha
        System.out.printf("Avaliação: %.1f \n", filme2.pegaMedia());
        System.out.println("-----------------------------------");
        System.out.println("");

        //Criando série
        Series serie1 = new Series();
        serie1.setNome("Breaking Bad");
        serie1.setAnoLancamento(2008);
        serie1.setIncluidoNoPlano(true);
        serie1.setAtiva(false);

        serie1.setQtdTemporadas(5);
        serie1.setEpPorTemporada(13);
        serie1.setDuracaoEp(50);

        //Imprimindo valores de série
        System.out.println("Séries");
        System.out.println("-------");
        serie1.exibirFichaTecnica();
        //Exibindo mensagens dinamicas ao invés de true e false
        if (serie1.isAtiva()){
            System.out.println("Série está Ativa");
        }else{
            System.out.println("Série Não está ativa");
        }

        System.out.println("Duração para maratonar: " + serie1.getDuracaoEmMinutos() + " min");
        System.out.println("-----------------------------------");
        System.out.println("");

        //Criando objeto de calculo de tempo de duração de filme
        CalculadoraDeTempo calculadora1 = new CalculadoraDeTempo();
        calculadora1.inclui(filme1);
        calculadora1.inclui(filme2);

        System.out.println("Calculadora Filmes");
        System.out.println("------------------");
        System.out.println("Total filmes: " + calculadora1.getTempoTotal());
        System.out.println("");

        //Criando objeto de calculo de tempo de duração de série
        CalculadoraDeTempo calculadora2 = new CalculadoraDeTempo();
        calculadora2.inclui(serie1);

        System.out.println("Calculadora Séries");
        System.out.println("------------------");
        System.out.println("Total Séries: " + calculadora2.getTempoTotal());
        System.out.println("-----------------------------------");
        System.out.println("");

        //Filtrando as avaliações de filmes
        FiltroRecomendacao filtro = new FiltroRecomendacao();
        System.out.println("Filtragem");
        System.out.println("---------");
        System.out.println(filme1.getNome() + ": ");
        //Imprimindo mensagem de filtragem
        filtro.filtra(filme1);
        System.out.println("");

        //Filtrando as avaliações de episódios de séries
        Episodio episodio = new Episodio();
        episodio.setNome("Piloto");
        episodio.setNumero(1);
        episodio.setSerie(serie1);
        episodio.setTotalVisualizacoes(50);

        System.out.println(episodio.getSerie().getNome() + "(" + episodio.getNome() + "): ");
        //Imprindo mensagem de avaliação do episódio
        filtro.filtra(episodio);

        //Criando lista de filmes
        /*ArrayList<Filme> listaFilmes = new ArrayList<>();

        listaFilmes.add(filme1);
        listaFilmes.add(filme2);

        System.out.println("Tamanho da lista: " + listaFilmes.size());
        System.out.println("Primeiro filme: " + listaFilmes.get(1).getNome());
        System.out.println("Média de notas: " + filme2.pegaMedia());
        System.out.println(listaFilmes.toString());*/
    }
}
