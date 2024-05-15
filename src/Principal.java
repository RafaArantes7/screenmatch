import br.com.rafael.screenmatch.calculos.CalculadoraDeTempo;
import br.com.rafael.screenmatch.calculos.Recomendacao;
import br.com.rafael.screenmatch.modelos.Episodio;
import br.com.rafael.screenmatch.modelos.Filme;
import br.com.rafael.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme primeiroFilme = new Filme();
        primeiroFilme.setNome("Senhor dos Aneís");
        primeiroFilme.setAnoDeLancamento(2000);
        primeiroFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme: " + primeiroFilme.getDuracaoEmMinutos());




        primeiroFilme.exibeFichaTecnica();
        primeiroFilme.avalia(8);
        primeiroFilme.avalia(7);
        primeiroFilme.avalia(10);

        System.out.println("Total de avaliações: " + primeiroFilme.getTotalDeAvaliacoes());

        System.out.println(primeiroFilme.pegaMediaNotas());

        Serie Vikings = new Serie();
        Vikings.setNome("Vikings");
        Vikings.setAnoDeLancamento(2000);
        Vikings.exibeFichaTecnica();
        Vikings.setTemporadas(6);
        Vikings.setEpisodiosPorTemporadas(8);
        Vikings.setMinutosPorEpisodios(50);
        System.out.println("Duração da série " + Vikings.getDuracaoEmMinutos() + " minutos");

        Filme segundoFilme = new Filme();
        segundoFilme.setNome("Dragon ball");
        segundoFilme.setAnoDeLancamento(2024);
        segundoFilme.setDuracaoEmMinutos(300);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(primeiroFilme);
        calculadora.inclui(segundoFilme);
        calculadora.inclui(Vikings);
        System.out.println(calculadora.getTempoTotal());

        Recomendacao filtro = new Recomendacao();
        filtro.filtra(primeiroFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(Vikings);
        episodio.setTotalVisualizacoes(300);

        filtro.filtra(episodio);
    }
}
