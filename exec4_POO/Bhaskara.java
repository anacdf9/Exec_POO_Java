package exec4_POO;
/*
Crie uma classe para calcular as raízes de uma equação de 2o grau: ax2 + bx + c=0
Nessa classe pode existir três propriedades para os valores “a”, “b” e “c” e um método sem parâmetro chamado
“calcular”, esse método retorna uma string com os valores das raízes.
*/

public class Bhaskara {
    
    public double a;
    public double b;
    public double c;

    public Bhaskara(double a, double  b, double c){
        this.a = a;
        this.b = b;
        this.c = c;

    }

    public String calcular() {
        if (a == 0) {
            return "O coeficiente 'a' não pode ser zero (não é uma equação do 2º grau).";
        }

        // Delta = b² - 4ac
        double delta = (b * b) - (4 * a * c);

        if (delta < 0) {
            return "Delta = " + delta + ". A equação não possui raízes reais.";
        } else if (delta == 0) {
            double x = -b / (2 * a);
            return "Delta = 0. A equação possui uma raiz real: x = " + x;
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            return "Delta = " + delta + ". Raízes: x1 = " + x1 + " e x2 = " + x2;
        }

    }
}
