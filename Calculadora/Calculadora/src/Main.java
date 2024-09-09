public class Main {
    public static void main(String[] args) throws Exception {

        Calculadora cal = new Calculadora();
        cal.somar(3, 4);
        cal.subtracao(89, 90);
        cal.multiplicacao(5, 8);
        cal.divisao(10, 2);
        
        int result = cal.potencia(2, 3);
        System.out.println(result);
        
    }
}