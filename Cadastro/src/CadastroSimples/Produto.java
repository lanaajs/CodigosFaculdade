package CadastroSimples;
public class Produto {
    
    private String nome;
    private double preco;
    private int qtd;

    //GET >>> sempre tem return; quando formos acessar, “pegar” alguns atributos da classe
    public String getNome() {
        return nome;
    }

    //SET >>> pois o atributo será somente modificado, porém ele deve receber algum 
    //argumento para que possa ocorrer a devida alteração
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if(preco>0){
            this.preco = preco;
        }else{
            System.out.println("Preço inválido!");
        }
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        if(qtd>0){
            this.qtd = qtd;
        }else{
            System.out.println("Quantidade inválida!");
        }  
    }
}
