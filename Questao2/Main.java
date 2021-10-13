public class Main {
      public static void main(String[] args) {
       
   System.out.println("                              ");
    Endereco endereco = new Endereco("Rua Machado Neto", "267", "Condomínio Villa dos Palmares", "Pituba", "Salvador","BA", "47450-000"); 
        System.out.println("Rua:"+ endereco.rua); 
        System.out.println("Número:"+ endereco.numero); 
        System.out.println("Complemento:"+ endereco.complemento);
         System.out.println("Bairro:"+ endereco.bairro);
        System.out.println("Cidade:"+ endereco.cidade);
        System.out.println("UF:"+ endereco.uf);
        System.out.println("CEP:"+endereco.cep);

    System.out.println("                              "); 

 Medico medico = new Medico("046984321","Monalisa Nunes dos Santos Silva", "Feminino", "Dermatologista", endereco);
        System.out.println("Codigo do médico(a):"+medico.codigo);
        System.out.println("Nome do médico(a):"+medico.nome);
        System.out.println("Sexo do médico(a):"+medico.sexo);
        System.out.println("Especialidade do médico(a):"+medico.especialidade);
         System.out.println("Endereço do médico(a):"+medico.endereco.rua+","+medico.endereco.numero+","+medico.endereco.complemento+","+medico.endereco.bairro+","+medico.endereco.cidade+","+medico.endereco.uf+","+medico.endereco.cep);

    
    System.out.println("                              ");
    System.out.println("Modifições dados endereço:");
    

System.out.println("                              ");
endereco.rua = "Rua Clarival do Prado";
  endereco.numero = "862";
  endereco.complemento = "Edíficio Monte Trianon";
  endereco.bairro = "Caminho das Árvores";
  endereco.cidade = "Salvador";
  endereco.uf = "BA";
  endereco.cep = "41820-916";
        System.out.println("Rua:"+ endereco.rua); 
        System.out.println("Número:"+ endereco.numero); 
        System.out.println("Complemento:"+ endereco.complemento); System.out.println("Bairro:"+ endereco.bairro);
        System.out.println("Cidade:"+ endereco.cidade);
        System.out.println("UF:"+ endereco.uf);
        System.out.println("CEP:"+endereco.cep); 

  System.out.println("                              "); 
        System.out.println("Modidições dados médico");

         medico.codigo = "083682523";
         medico.nome = "Nicole Telles dos Santos";
         medico.sexo = "Feminino";
         medico.especialidade = "Ginecologista";
         medico.endereco = endereco; 
   
       System.out.println("Codigo do médico(a):"+medico.codigo);
        System.out.println("Nome do médico(a):"+medico.nome);
        System.out.println("Sexo do médico(a):"+medico.sexo);
        System.out.println("Especialidade do médico(a):"+medico.especialidade);
        System.out.println("Endereço do médico(a):"+medico.endereco.rua+","+medico.endereco.numero+","+medico.endereco.complemento+","+medico.endereco.bairro+","+medico.endereco.cidade+","+medico.endereco.uf+","+medico.endereco.cep);

    
        
    }
}
