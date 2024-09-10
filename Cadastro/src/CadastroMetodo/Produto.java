package CadastroMetodo;

public class Produto {
    
    private String nome;
    private double preco;
    private int qtd;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public int getQtd() {
        return qtd;
    }
    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public void cadastrarProduto(String nome, double preco, int qtd){
        setNome(nome);
        setPreco(preco);
        setQtd(qtd);
    }
    
    public void exibirProduto(){
        System.out.println("\nNOME: " + getNome());
        System.out.println("PRECO: " + getPreco());
        System.out.println("QUANTIDADE: " + getQtd());
    }

    public void menu(){
        System.out.println("******MENU******");
        System.out.print("|-----------------------------|\n");
        System.out.print("| Opção 1 - Novo Cadastro     |\n");
        System.out.print("| Opção 2 - Clientes          |\n");
        System.out.print("| Opção 3 - Produtos          |\n");
        System.out.print("| Opção 4 - Sair              |\n");
        System.out.print("|-----------------------------|\n");
        System.out.print("Digite uma opção: ");
        
        int escolha=0;

        switch (escolha) {
            case 1:
                
            break;
        
            default:
                break;
        }
    }
}
