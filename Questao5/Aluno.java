 public Aluno
 public class Aluno {
	
	    String nome;
	    String cpf ;
	    double nota1;
	    double nota2;
	    double nota3;
      public Aluno(String nome, String cpf) {

    this.nome = nome;
    this.cpf = cpf;
    this.nota1 = 0;
    this.nota2 = 0;
    this.nota2 = 0;
}
public double calcularMedia() {
return (nota1+nota2+nota3) / 3;
 }
}
