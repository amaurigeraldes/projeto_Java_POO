package mod10_heranca_polimorfismo_interfaces;

import mod09_orientacao_a_objetos.Aluno;

public class TestandoClassesFilhas {

    public static void main(String[] args) {
        
        // Intanciando a Classe Aluno:
        Aluno aluno = new Aluno();
        aluno.setNome("Amaurí");
        aluno.setNomeEscola("JDEV Treinamento");
        aluno.setDataMatric("10/04/2023");
        aluno.setSerie("1º Ano");
        
        

        // Intanciando a Classe Diretor:
        Diretor diretor = new Diretor();
        diretor.setNome("Geraldes");
        diretor.setRg("15.404.473-8");
        diretor.setRegistroEducacao("99999-9");
        diretor.setTempoDirecao(5);
        diretor.setTitulacao("Mestrado");



        // Intanciando a Classe Secretário:
        Secretario secretario = new Secretario();
        secretario.setNome("Geraldes");
        secretario.setCpf("027.456.288-01");
        secretario.setRegistro("888888-8");
        secretario.setNivelCargo("Médio");
        secretario.setExperiencia("Administração");
        


        System.out.println(aluno);
        System.out.println(diretor);
        System.out.println(secretario);




    }
}
