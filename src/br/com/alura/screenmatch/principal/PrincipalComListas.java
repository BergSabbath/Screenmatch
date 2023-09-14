package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão",1970);
        meuFilme.avalia(9);
        Filme favorito = new Filme("The Matrix",1999);
        favorito.avalia(10);
        Filme outroFilme = new Filme("John Wick",2014);
        outroFilme.avalia(8);
        var filmeDopaulo = new Filme("Dogville",2003);
        filmeDopaulo.avalia(10);
        Serie lost = new Serie("Lost", 2000);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDopaulo);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);
        for (Titulo item: lista) {
            System.out.println(item.getNome());

            Filme filme = (Filme) item;
            System.out.println("Classificação: " + ((Filme) item).getClassificacao());
        }

//        lista.forEach(nome -> System.out.println(nome));
//        lista.forEach(System.out::println);
    }
}
