package exec1_POO;

public class Main {
    public static void main(String[] args){

    Matematica mat = new Matematica();
     //meus valores
        float valor1 = 15.5f;
        float valor2 = -3;
        float valor3 = 0;
    

    System.out.println("----resultados----");
    System.out.println(valor1 + " é positivo?" + mat.isPositive(valor1));
    System.out.println(valor2 + " é positivo?" + mat.isPositive(valor2));
    System.out.println(valor3 + " é positivo?" + mat.isPositive(valor3));


    System.out.println("\n--- Teste de isZero ---");
    System.out.println(valor1 + " é zero? " + mat.isZero(valor1));        
    System.out.println(valor3 + " é zero? " + mat.isZero(valor3));
    }
}