package Vendas;


import java.util.ArrayList;
import java.util.List;

public class Album {

    public String nome;
    public String artista;
    public  String genero;
    private int numeroCopias;
    public List<Musica> listaMusicas;

   public Album() {

   }

    public Album(String nome, String artista, String genero, int numeroCopias) {
        this.nome = nome;
        this.artista = artista;
        this.genero = genero;
        this.numeroCopias = numeroCopias;
        this.listaMusicas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getArtista() {
        return artista;
    }
    public String getGenero() {
        return genero;
    }
    public int getNumeroCopias() {
        return numeroCopias;
    }
    public List<Musica> getMusicas() {
        return listaMusicas;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setArtista(String artista) {
        this.artista = artista;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public void setMusicas(List<Musica> musicas) {
        this.listaMusicas = musicas;
    }


    public void setNumeroCopias(int numeroCopias) {
        if (numeroCopias >=0) {
            this.numeroCopias = numeroCopias;
        } else {
            System.out.println("Número de cópias não pode ser negativo.");
        }
    }

    public String toString() {
        return String.format(
                "Álbum: %s | Artista: %s | Gênero: %s | Cópias: %d | Músicas: %s",
                nome, artista, genero, numeroCopias, listaMusicas.toString()
        );
    }

    public void venderAlbum(int copias) {
        if (numeroCopias > 0) {
            numeroCopias = (numeroCopias - copias);
            System.out.println("Álbum(s) vendido(s) com sucesso!");
        } else {
            System.out.println("Não há cópias disponíveis para venda.");
        }
    }

    public void adicionarMusica(Musica musica) {
        listaMusicas.add(musica);
    }


}

