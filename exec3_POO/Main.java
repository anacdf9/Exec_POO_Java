package exec3_POO;

/*Implemente o diagrama abaixo, logo em seguida instancie 
um objeto do tipo Calculadora e crie um menu para
usar todos os métodos. 
*/
public class Main {
    public static void main(String[] args){
        Calculadora calc = new Calculadora();
        System.out.println("Soma: " + calc.somar(10, 5));
        System.out.println("Subtração: " + calc.subtrait(10, 5));
        System.out.println("Multiplicação: " + calc.multiplicar(10, 5));
        System.out.println("Divisão: " + calc.dividir(10, 5));
        System.out.println("Divisão por zero: " + calc.dividir(10, 0));

    }
}
