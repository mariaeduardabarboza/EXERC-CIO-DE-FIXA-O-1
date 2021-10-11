public class Main {
      public static void main(String[] args) {
       
   System.out.println("                              ");

  Aluno aluno = new Aluno("Maria Eduarda Barboza Santos", "03896585598");

  aluno.setNota1(10.0);
  aluno.setNota2(9.0);
  aluno.setNota3(8.0);

  aluno.calcularMedia();
  System.out.println("Média:"+aluno.calcularMedia());
  
  aluno.setNota1(10.0);
  aluno.setNota2(9.5);
  aluno.setNota3(9.0);

  double media = aluno.calcularMedia();
  System.out.println("Nova Média:"+media);

    }
  }
  
