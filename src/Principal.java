import br.com.thinksolutions.ScreemMatch.Modelo.Filme;

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

    }
}
