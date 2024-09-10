package CadastroMetodo;

public class Loja {
    public static void main(String[] args) throws Exception {
        
        Produto p1 = new Produto();
        Produto p2 = new Produto();

        p1.cadastrarProduto("Celular", 589.99, 325);
        p2.cadastrarProduto("Tablet", 800.76, 200);
        
        p1.exibirProduto();
        p2.exibirProduto();
    }
}
