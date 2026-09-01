package exec4_POO;
/*
Crie uma classe para calcular as raízes de uma equação de 2o grau: ax2 + bx + c=0
Nessa classe pode existir três propriedades para os valores “a”, “b” e “c” e um método sem parâmetro chamado
“calcular”, esse método retorna uma string com os valores das raízes.
 */

public class Main {
    public static void main(String[] args) {
        // Exemplo 1: x² - 5x + 6 = 0  -> Raízes: 3 e 2
        Bhaskara eq1 = new Bhaskara(1, -5, 6);
        System.out.println("Equação 1: " + eq1.calcular());

        // Exemplo 2: x² - 4x + 4 = 0  -> Raiz única: 2
        Bhaskara eq2 = new Bhaskara(1, -4, 4);
        System.out.println("Equação 2: " + eq2.calcular());

        // Exemplo 3: x² + 2x + 5 = 0  -> Sem raízes reais
        Bhaskara eq3 = new Bhaskara(1, 2, 5);
        System.out.println("Equação 3: " + eq3.calcular());
    }
}