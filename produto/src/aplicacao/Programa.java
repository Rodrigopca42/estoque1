package aplicacao;

import java.util.Scanner;

import entidade.Produto;

public class Programa {
    public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);

        Produto produto = new Produto();
        
        System.out.print("Entre com o Produto:");
        produto.nome = tec.nextLine();

        System.out.print("Preço: ");
        produto.preco = tec.nextDouble();

        System.out.print("Quantidade em estoque: ");
        produto.quantidade = tec.nextInt();

        
        System.out.println(" ");
        System.out.println("Produtos em estoque: "+ produto);
        System.out.println(" ");

        System.out.print("Entre com a quantidade que será adicionado ao estoque: ");
        int quantidade = tec.nextInt();
        produto.adicionarProdutos(quantidade);

        System.out.println(" ");
        System.out.println("Dados Atualizados de Produtos em estoque: "+ produto);
        System.out.println(" ");

        System.out.println("Entre com a quantidade que será retirada do estoque: ");
        quantidade = tec.nextInt();
        produto.removerProduto(quantidade);

        System.out.println(" ");
        System.out.println("Dados Atualizados de Produtos em estoque: "+ produto);
        System.out.println(" ");
        
        tec.close();
    }
}
