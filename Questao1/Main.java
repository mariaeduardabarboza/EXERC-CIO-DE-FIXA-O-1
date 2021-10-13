public class Main {
      public static void main(String[] args) {
       
      Paciente paciente = new Paciente("038953815","Maria Eduarda Barboza Santos", "14/06/2004", "Planserv", "Feminino","Nenhuma", "O positivo");
        System.out.println("Codigo:"+paciente.codigo);
        System.out.println("Nome:"+paciente.nome);
        System.out.println("Data Nascimento:"+paciente.dataNascimento);
        System.out.println("Sexo:"+paciente.sexo);
        System.out.println("Alergia:"+paciente.alergia);
        System.out.println("Tipo Sanguíneo:"+paciente.tipoSanguineo);

   System.out.println("                              ");
   System.out.println("Dados mãe do paciente:       ");
   
 paciente.codigo = "039875375";
 paciente.nome = "Karla Mônica Alcântara Barboza";
 paciente.dataNascimento = "11/12/1973";
 paciente.sexo ="Feminino";
 paciente.planoSaude = "Planserv";
 paciente.alergia = "Nenhuma";
 paciente.tipoSanguineo = "O negativo";
        System.out.println("Codigo:"+paciente.codigo);
        System.out.println("Nome:"+paciente.nome);
        System.out.println("Data Nascimento:"+paciente.dataNascimento);
        System.out.println("Sexo:"+paciente.sexo);
        System.out.println("Alergia:"+paciente.alergia);
        System.out.println("Tipo Sanguíneo:"+paciente.tipoSanguineo);
  
      }
}
