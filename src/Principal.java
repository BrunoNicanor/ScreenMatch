import br.com.thinksolutions.ScreemMatch.Modelo.Episodio;
import br.com.thinksolutions.ScreemMatch.Modelo.Filme;
import br.com.thinksolutions.ScreemMatch.Modelo.Series;
import br.com.thinksolutions.calculos.CalculadoraDeTempo;
import br.com.thinksolutions.calculos.FiltroRecomendacao;

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
        filme1.exibirFichaTecnica();

        //Dando notas ao filme
        filme1.avaliar(9.1);
        filme1.avaliar(7.9);
        filme1.avaliar(8.0);

        //Imprimindo média das avaliações
        System.out.println("Média das avaliações do filme: " + filme1.pegaMedia());

        //Criando série
        Series serie1 = new Series();
        serie1.setNome("Breaking Bad");
        serie1.setAnoLancamento(2008);
        serie1.setIncluidoNoPlano(true);
        serie1.setAtiva(false);

        serie1.setQtdTemporadas(5);
        serie1.setEpPorTemporada(13);
        serie1.setDuracaoEp(50);

        serie1.exibirFichaTecnica();

        serie1.setAtiva(false);

        System.out.println("Duração para maratonar: " + serie1.getDuracaoEmMinutos());

        CalculadoraDeTempo calculadora1 = new CalculadoraDeTempo();
        calculadora1.inclui(filme1);
        System.out.println(calculadora1.getTempoTotal());

        CalculadoraDeTempo calculadora2 = new CalculadoraDeTempo();
        calculadora2.inclui(serie1);
        System.out.println(calculadora2.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(filme1);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(serie1);
        episodio.setTotalVisualizacoes(50);
        filtro.filtra(episodio);
    }
}
