public class Main {
      public static void main(String[] args) {
       
   System.out.println("                              ");

  Aluno aluno = new Aluno("Maria Eduarda Barboza Santos", "03896585598");

  aluno.nota1 = 10.0;
  aluno.nota2 = 9.0;
  aluno.nota3 = 8.0;

  aluno.calcularMedia();
   double media = aluno.calcularMedia();
  System.out.println("Média:"+media);
  
  aluno.nota1 = 10.0;
  aluno.nota2 = 9.5;
  aluno.nota3 = 9.0;

  aluno.calcularMedia();
  System.out.println("Nova Média:"+aluno.calcularMedia());

    }
  }
