
package exercicio_3;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leitor=new Scanner(System.in);
        Carrinho carrinho = new Carrinho("123456", "senha123");
        System.out.println("informe o usuário:");
            
        // Adicionando alguns produtos
        carrinho.adicionar("Maçã");
        carrinho.adicionar("Banana");
        carrinho.adicionar("Laranja");

        // Listando os produtos no carrinho
        carrinho.listar();

        // Removendo um produto
        carrinho.remover("Banana");

        // Listando os produtos atualizados no carrinho
        carrinho.listar();
    }
}
