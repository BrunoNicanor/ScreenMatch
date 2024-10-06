package Principal;

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
        Filme filme1 = new Filme("Avatar",2009);

        //Atribuindo valores aos atributos
        filme1.setDuracaoEmMinutos(180);
        filme1.setIncluidoNoPlano(true);

        //Imprime os valores dos atributos
        System.out.printf("""
                Filmes
                -------
                """);
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
        System.out.printf("""
                Avaliação: %.1f
                -----------------------------------
                """,filme1.pegaMedia());

        //Declarando variável com var
        var filme2 = new Filme("A Origem", 2010);

        filme2.setDuracaoEmMinutos(150);
        filme2.setIncluidoNoPlano(true);

        filme2.exibirFichaTecnica();

        filme2.avaliar(10);
        filme2.avaliar(8);
        filme2.avaliar(10);

        //Imprimindo com somente uma casa decimal após a vígula e pulando linha
        System.out.printf("""
                Avaliação: %.1f 
                -----------------------------------
                
                """,filme2.pegaMedia());

        //Criando série
        Series serie1 = new Series("Breaking Bad", 2008,50,13);
        serie1.setIncluidoNoPlano(true);
        serie1.setAtiva(false);

        serie1.setQtdTemporadas(5);
        /*serie1.setEpPorTemporada(13);
        serie1.setDuracaoEp(50);*/

        //Imprimindo valores de série
        System.out.printf("""
                Séries
                -------
                """);
        serie1.exibirFichaTecnica();
        //Exibindo mensagens dinamicas ao invés de true e false
        if (serie1.isAtiva()){
            System.out.println("Série está Ativa");
        }else{
            System.out.println("Série Não está ativa");
        }

        System.out.printf("""
                Duração para maratonar: %d minutos
                -----------------------------------
                
                """,serie1.getDuracaoEmMinutos());

        //Criando objeto de calculo de tempo de duração de filme
        CalculadoraDeTempo calculadora1 = new CalculadoraDeTempo();
        calculadora1.inclui(filme1);
        calculadora1.inclui(filme2);

        System.out.printf("""
                Calculadora Filmes
                ------------------
                Total filmes: %d minutos
                
                """,calculadora1.getTempoTotal());

        //Criando objeto de calculo de tempo de duração de série
        CalculadoraDeTempo calculadora2 = new CalculadoraDeTempo();
        calculadora2.inclui(serie1);

        System.out.printf("""
                Calculadora Séries
                ------------------
                Total Séries: %d minutos
                -----------------------------------
                
                """,calculadora2.getTempoTotal());

        //Filtrando as avaliações de filmes
        FiltroRecomendacao filtro = new FiltroRecomendacao();

        //Imprimindo mensagem de filtragem
        System.out.printf("""
                Filtragem
                ---------
                %s: %s
                
                """,filme1.getNome(),
                filtro.filtra(filme1));

        //Filtrando as avaliações de episódios de séries
        Episodio episodio = new Episodio();
        episodio.setNome("Piloto");
        episodio.setNumero(1);
        episodio.setSerie(serie1);
        episodio.setTotalVisualizacoes(50);

        //Imprindo mensagem de avaliação do episódio
        System.out.printf("""
                %s(%s): %s
                """,episodio.getSerie().getNome(),
                episodio.getNome(),
                filtro.filtra(episodio));

        //Criando lista de filmes
        ArrayList<Filme> listaFilmes = new ArrayList<>();

        listaFilmes.add(filme1);
        listaFilmes.add(filme2);

        System.out.printf("""
                        --------------------
                        Listas
                        --------
                        Tamanho da lista: %d
                        Primeiro filme: %s
                        Média de notas: %.1f
                        %s
                        %n""", listaFilmes.size(),
                listaFilmes.get(1).getNome(),
                filme2.pegaMedia(),
                listaFilmes.toString());
    }
}
