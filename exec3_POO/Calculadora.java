package exec3_POO;
/*
+ : O método é público (public).
somar(...) : O nome do método.
a:float : O primeiro parâmetro se chama a e é do tipo float.
b:float : O segundo parâmetro se chama b e é do tipo float.
): float (os dois pontos no final) : O tipo de retorno do método. 
Significa que esse método devolve um valor do tipo float. */

public class Calculadora {
    float a;
    float b;

    public float somar(float a, float b){
        return a+b;
    }

    public float subtrait(float a, float b){
        return a-b;
    }

    public float multiplicar(float a, float b){
        return a*b;
    }

    public float dividir (float a, float b){
        if (b == 0) {
        System.out.println("Erro: Divisão por zero não é permitida.");
        return 0; // valor sentinela
    }
        return a/b;
    }
}
