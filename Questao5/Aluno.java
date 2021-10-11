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

 public void setNota1(double nota1) {
 this.nota1 = nota1;
 }
  public void setNota2(double nota2) {
 this.nota2 = nota2;
 }
  public void setNota3(double nota3) {
 this.nota3 = nota3;
 }
 public double calcularMedia() {
return (nota1+nota2+nota3) / 3;
 }
}
