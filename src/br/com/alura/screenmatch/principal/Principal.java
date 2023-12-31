package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        // filmes
        Filme meuFilme = new Filme("O poderoso chefão",1970);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme " + meuFilme.getDuracaoEmMinutos());

        Filme favorito = new Filme("The Matrix",1999);
        favorito.setDuracaoEmMinutos(135);
        favorito.setIncluidoNoPlano(true);

        Filme outroFilme = new Filme("John Wick",2014);
        outroFilme.setDuracaoEmMinutos(101);
        outroFilme.setIncluidoNoPlano(true);

        var filmeDopaulo = new Filme("Dogville",2003);
        filmeDopaulo.setDuracaoEmMinutos(200);
        filmeDopaulo.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDopaulo);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        System.out.println("Tamanho da lista "+ listaDeFilmes.size());
        System.out.println("Primeiro filme "+ listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);
        System.out.println(("toString do filme " + listaDeFilmes.get(0).toString()));
        System.out.println("___________________________________________________");


        // series
        Serie serie = new Serie("La casa de Papel", 2017);
        serie.setIncluidoNoPlano(true);
        serie.setAtiva(true);
        serie.setTemporadas(5);
        serie.setEpisodiosPorTemporadas(10);
        serie.setMinutosPorEpisodio(45);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(favorito);
        calculadora.inclui(outroFilme);
        calculadora.inclui(serie);
        System.out.println("Tempo total:" + calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        //serie
        Serie lost = new Serie("Lost", 2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporadas(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar Lost " + lost.getDuracaoEmMinutos());

        //episodio
        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalDeVisualizacoes(300);
        filtro.filtra(episodio);


        Filme filme1 = new Filme("Manoel", 2009);
        Filme filme2 = new Filme("Pedro", 1999);
        Filme filme3 = filme1;

        System.out.println(filme3);
    }
}