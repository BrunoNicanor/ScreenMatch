import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        //Scanner entrada = new Scanner(System.in);

        //Criando Objeto
        Filme filme1 = new Filme();

        //Atribuindo valores aos atributos
        filme1.nome = "Avatar";
        filme1.anoLancamento = 2009;
        filme1.duracaoEmMinutos = 180;
        filme1.incluidoNoPlano = true;

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
