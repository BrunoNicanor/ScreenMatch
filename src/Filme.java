public class Filme {
     String nome;
     int anoLancamento;
     int duracaoEmMinutos;
     boolean incluidoNoPlano;
     double somaDasAvaliacoes;
     double totalDeAvaliacoes;

    public void exibirFichaTecnica(){
        System.out.println("Nome: " + nome);
        System.out.println("Ano de lançamento: " + anoLancamento);
        System.out.println("Duração em Min: " + duracaoEmMinutos);
        System.out.println("Incluído no plano: " + incluidoNoPlano);
    }

    public void avaliar(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}
