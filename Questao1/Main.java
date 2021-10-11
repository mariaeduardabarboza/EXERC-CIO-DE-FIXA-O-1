public class Main {
      public static void main(String[] args) {
       
   System.out.println("                              ");

      Paciente paciente = new Paciente("038953815","Maria Eduarda Barboza Santos", "14/06/2004", "Planserv", "Feminino","Nenhuma", "O positivo");
        System.out.println("Codigo do paciente:"+paciente.codigo);
        System.out.println("Nome do paciente:"+paciente.nome);
        System.out.println("Data Nascimento do paciente:"+paciente.dataNascimento);
        System.out.println("Sexo do paciente:"+paciente.sexo);
        System.out.println("Alergia do paciente:"+paciente.alergia);
        System.out.println("Tipo Sanguíneo do paciente:"+paciente.tipoSanguineo);

   System.out.println("                              ");
   System.out.println("Modificações dados mãe:       ");
   
 paciente.codigo = "039875375";
 paciente.nome = "Karla Mônica Alcântara Barboza";
 paciente.dataNascimento = "11/12/1973";
 paciente.sexo ="Feminino";
 paciente.planoSaude = "Planserv";
 paciente.alergia = "Nenhuma";
 paciente.tipoSanguineo = "O negativo";
        System.out.println("Codigo do paciente:"+paciente.codigo);
        System.out.println("Nome do paciente:"+paciente.nome);
        System.out.println("Data Nascimento do paciente:"+paciente.dataNascimento);
        System.out.println("Sexo do paciente:"+paciente.sexo);
        System.out.println("Alergia do paciente:"+paciente.alergia);
        System.out.println("Tipo Sanguíneo do paciente:"+paciente.tipoSanguineo);
  
      }
}
