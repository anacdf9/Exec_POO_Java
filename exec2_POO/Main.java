
/*Escreva uma classe cujos objetos representam alunos matriculados em uma disciplina. 
Cada objeto dessa classe deve guardar os seguintes dados do aluno:
 matrícula, nome, 2 notas de prova e 1 nota de trabalho. 
 Escreva os seguintes métodos para esta classe:
float calculaMedia() -> calcula a média final do aluno 
(cada prova tem peso 2,5 e o trabalho tem peso 2)
float notaFinal() -> calcula quanto o aluno precisa para a prova final 
(retorna zero se ele não for para a final)
O valor total da nota no semestre é 100, 
a nota mínima para ser aprovado é 60 e a prova final vale 30 pontos. */

package exec2_POO;

public class Main {
    public static void main(String[] args){
        Aluno aluno1 = new Aluno();
        aluno1.matricula = 123;
        aluno1.nome = "João";
        aluno1.nota1 = 70;
        aluno1.nota2 = 50;
        aluno1.notaTrabalho = 80;

        System.out.println("Média final: " + aluno1.calculaMedia());
        System.out.println("Nota final: " + aluno1.notaFinal());
    }
}
