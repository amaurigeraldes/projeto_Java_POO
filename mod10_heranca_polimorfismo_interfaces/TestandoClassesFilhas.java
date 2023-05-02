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
        aluno.setIdade(21);
        
        

        // Intanciando a Classe Diretor:
        Diretor diretor = new Diretor();
        diretor.setNome("Geraldes");
        diretor.setRg("15.404.473-8");
        diretor.setRegistroEducacao("99999-9");
        diretor.setTempoDirecao(5);
        diretor.setTitulacao("Mestrado");
        diretor.setIdade(50);


        // Intanciando a Classe Secretário:
        Secretario secretario = new Secretario();
        secretario.setNome("Moreira");
        secretario.setCpf("027.456.288-01");
        secretario.setRegistro("888888-8");
        secretario.setNivelCargo("Médio");
        secretario.setExperiencia("Administração");
        secretario.setIdade(18);
        


        System.out.println(aluno);
        System.out.println(diretor);
        System.out.println(secretario);

        System.out.println(aluno.pessoaMaiorIdade() + " - " + aluno.msgMaiorIdade());
        System.out.println(diretor.pessoaMaiorIdade());
        System.out.println(secretario.pessoaMaiorIdade());
        
        
        // Não é permitido instanciar a Classe Pessoa pois foi definida como PADRÃO: public abstract class Pessoa {}
        // A própria IDE já mostra o erro, impedindo que algo seja feito errado dentro do código, mantendo a regra;
        // Pessoa pessoa = new Pessoa();  
    
        // O exemplo abaixo não é Instanciar um objeto, mas sim a criação de uma Classe dentro da Classe
        // Observação: NÃO FAZER ISSO!
        // Pessoa pessoa = new Pessoa() {
        //     private String xxx;
        // };

        // É possível instanciar um novo aluno, mas não uma Classe Abstrata;
        // Aluno aluno2 = new Aluno();
        

        // Métodos Abstratos:
        System.out.println("O Salário do aluno é R$" + aluno.salario());
        System.out.println("O Salário do diretor é R$" + diretor.salario());
        System.out.println("O Salário do secretário é R$" + secretario.salario());
        
        // Exemplo de Polimorfismo:
        // Pessoa pessoa = new Aluno();
        // pessoa = secretario;

        teste(aluno);
        teste(diretor);
        teste(secretario);

    }
    public static void teste(Pessoa pessoa) {
        System.out.println("Essa pessoa é demais "+pessoa.getNome()+" e o salário dela é de R$"+pessoa.salario());
    }



}
