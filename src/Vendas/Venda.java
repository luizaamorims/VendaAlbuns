package Vendas;

import java.util.ArrayList;
import java.util.Scanner;


public class Venda {
    static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao = 0;

        do {

            System.out.println("-----------ESTOQUE-----------");
            System.out.println();
            System.out.println("O que deseja fazer?");
            System.out.println("1 - Cadastrar um novo álbum");
            System.out.println("2 - Listar álbuns cadastrados");
            System.out.println("3 - Vender um álbum");
            System.out.println("4 - Sair");
            System.out.println();
            System.out.print("Digite a opção desejada: ");
            opcao = sc.nextInt();
            sc.nextLine();



            switch (opcao) {
                case 1: CadastrarAlbum();
                    break;
                case 2: ListarAlbum();
                    break;
                case 3: VenderAlbum();
                    break;
                case 4: System.out.println("Saindo...");
                    break;
            }

        } while (opcao != 4);

    }

    public static void CadastrarAlbum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do álbum: ");
        String nome = sc.nextLine();
        System.out.println("Digite o nome do artista: ");
        String artista = sc.nextLine();
        System.out.println("Digite o gênero do álbum: ");
        String genero = sc.nextLine();
        System.out.println("Digite o número de cópias: ");
        int numeroCopias = sc.nextInt();
        sc.nextLine();

        while (numeroCopias <= 0) {
            System.out.println("Número de cópias deve ser maior que 0. Digite novamente: ");
            numeroCopias = sc.nextInt();
            sc.nextLine();
        }

        Album album = new Album(nome, artista, genero, numeroCopias);
        albums.add(album);
        System.out.println("Álbum cadastrado com sucesso!");

    }
    public static void ListarAlbum() {
        if (albums.isEmpty()) {
            System.out.println("Nenhum álbum cadastrado.");
        } else {
            System.out.println("Álbuns cadastrados:");
            for (Album album : albums) {
                System.out.println(album); // Chama o toString() da classe Album
            }
        }
    }

    public static void VenderAlbum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do álbum que deseja vender: ");
        String nome = sc.nextLine();
        for (Album album : albums) {
            if (album.getNome().equals(nome)) {
                album.venderAlbum();
                return;
            }
        }
        System.out.println("Álbum não encontrado.");
    }
}
