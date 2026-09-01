package exec2_POO;

public class Aluno {
    int matricula;
    String nome;
    float nota1;
    float nota2;
    float notaTrabalho;

    public float calculaMedia(){
        return (nota1 * 2.5f + nota2 * 2.5f + notaTrabalho * 2) / 7;
    }

    public float notaFinal(){
        if (calculaMedia() >=60){
            return 0;
        }
        else{
            return 60 - calculaMedia();
        }
    }
}
