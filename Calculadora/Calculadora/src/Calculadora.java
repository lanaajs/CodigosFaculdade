public class Calculadora {
    
    public void somar(int a, int b){
        int soma = a + b;
        System.out.println("\n\nSoma de " + a + " + " + b + " = " + soma);
    }

    public void subtracao(int a, int b){
        int sub = a - b;
        System.out.println("Subtracao de " + a + " + " + b + " = " + sub);
    }

    public void multiplicacao(int a, int b){
        int mult = a * b;
        System.out.println("Multiplicacao de " + a + " + " + b + " = " + mult);
    }

    public void divisao(double a, double b){
        double div = a/ b;
        System.out.println("Divisao de " + a + " + " + b + " = " + div);
    }

    public int potencia(int base, int exp){
        if(exp == 0){
            return 1;
        }else{
            return base * potencia(base, exp);
        }
    }
}