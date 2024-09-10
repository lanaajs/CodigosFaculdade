package CadastroSimples;
public class Loja {
    public static void main(String[] args) throws Exception {
        
        Produto p1 = new Produto();
        Produto p2 = new Produto();

        p1.setNome("Celular Samsung");
        p1.setPreco(1870.78);
        p1.setQtd(400);

        p2.setNome("Tablet Samsung");
        p2.setPreco(2000.985);
        p2.setQtd(350);

        System.out.println("\n\n******LOJA - SAM UNG******");
        System.out.println("\nPRODUTO 1 - DESCRIÇÃO");
        System.out.println("NOME: " + p1.getNome());
        System.out.println("PREÇO: R$" + p1.getPreco());
        System.out.println("QUANTIDADE: " + p1.getQtd());

        System.out.println("\nPRODUTO 2 - DESCRIÇÃO");
        System.out.println("NOME: " + p2.getNome());
        System.out.println("PREÇO: R$" + p2.getPreco());
        System.out.println("QUANTIDADE: " + p2.getQtd());


    }
}
