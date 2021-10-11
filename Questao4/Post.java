public class Post {
	
	    String texto;
	    String link;
	    int numeroCurtidas;
      int numeroCompartilhamentos;
      
      public Post(String texto, String link) {

    this.texto = texto;
    this.link = link;
    this.numeroCurtidas =0;
    this.numeroCompartilhamentos = 0;
}
 public void curtir() {
this.numeroCurtidas +=1;
 }
public void compartilhar() {
this.numeroCompartilhamentos +=1;
 }
}
 
  
