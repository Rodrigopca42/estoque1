package entidade;

public class Produto {
    
    public String nome;
    public double preco; 
    public int quantidade;

   
   
   
    public Produto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public double valorTotalEmEstoque(){
        return preco * quantidade;
    }

    public void adicionarProdutos(int quantidade){
        this.quantidade += quantidade;        
    }

    public void removerProduto(int quantidade){
        this.quantidade -= quantidade;
    }

    public String toString(){
        return nome + ", R$" + String.format("%.2f", preco) + ", " + quantidade + " unidades, total R$"+String.format("%.2f", valorTotalEmEstoque());
    }

}
