package Vendas;


import java.util.ArrayList;

public class Album {

    public String nome;
    public String artista;
    public  String genero;
    private int numeroCopias;

    public Album() {

    }

    public Album(String nome, String artista, String genero, int numeroCopias) {
        this.nome = nome;
        this.artista = artista;
        this.genero = genero;
        this.numeroCopias = numeroCopias;
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
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setArtista(String artista) {
        this.artista = artista;
    }
    public void setGenero(String genero) {
        this.genero = genero;
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
                "Álbum: %s | Artista: %s | Gênero: %s | Cópias: %d",
                nome, artista, genero, numeroCopias
        );
    }

    public void venderAlbum() {
        if (numeroCopias > 0) {
            numeroCopias--;
            System.out.println("Álbum vendido com sucesso!");
        } else {
            System.out.println("Não há cópias disponíveis para venda.");
        }
    }


}

