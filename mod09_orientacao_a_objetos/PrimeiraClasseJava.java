package mod09_orientacao_a_objetos;

import javax.swing.JOptionPane;

public class PrimeiraClasseJava {
    /* Main é um Método Auto Executável em Java */
    public static void main(String[] args) {
        // INSTANCIANDO (CRIANDO) OBJETOS PARA O JAVA: new Aluno()

        // Objeto ainda não existe na Memória:
        // Aluno aluno1;

        // Agora temos Objetos Reais na Memória;
        
        // new Aluno() é uma INSTÂNCIA (criação de Objeto);
        // As variáveis aluno1, aluno2, aluno3, ..., alunoX, são referências para o objeto Aluno;
        
         

        // CRIANDO AS ENTRADAS OU INPUT DOS DADOS PELO USUÁRIO:
        String nome = JOptionPane.showInputDialog("Informar o nome do aluno:"); 
        String idade = JOptionPane.showInputDialog("Idade:"); 
        String dtNasc = JOptionPane.showInputDialog("Data de nascimento:"); 
        String num_rg = JOptionPane.showInputDialog("RG:"); 
        String num_cpf = JOptionPane.showInputDialog("CPF:"); 
        String mae = JOptionPane.showInputDialog("Nome da mãe:"); 
        String pai = JOptionPane.showInputDialog("Nome do pai:"); 
        String dtMatr = JOptionPane.showInputDialog("Data da matrícula:"); 
        String escola = JOptionPane.showInputDialog("Nome da escola:"); 
        String serie_esc = JOptionPane.showInputDialog("Série escolar:"); 

        String disciplina1 = JOptionPane.showInputDialog("Disciplina1:"); 
        String n1 = JOptionPane.showInputDialog("Nota 1:"); 
        
        String disciplina2 = JOptionPane.showInputDialog("Disciplina2:"); 
        String n2 = JOptionPane.showInputDialog("Nota 2:"); 
        
        String disciplina3 = JOptionPane.showInputDialog("Disciplina3:"); 
        String n3 = JOptionPane.showInputDialog("Nota 3:"); 
        
        String disciplina4 = JOptionPane.showInputDialog("Disciplina4:"); 
        String n4 = JOptionPane.showInputDialog("Nota 4:"); 
        
        // Contrutores Padrões (sem parâmetro): 
        Aluno aluno1 = new Aluno(); 
        // Aluno aluno1 = null;
        aluno1.setNome(nome);  // String informada através de Input;
       
        // Solucionando NullPointerException. TEM QUE TER O OBJETO INSTANCIADO: Aluno aluno1 = new Aluno(); 
        // Exception in thread "main" java.lang.NullPointerException
        // at mod09_orientacao_a_objetos.PrimeiraClasseJava.main(PrimeiraClasseJava.java:47) 
        
        aluno1.setIdade(Integer.valueOf(idade));  // String informada através de Input e convertida para int;
        aluno1.setDataNasc(dtNasc);  // String informada através de Input;
        aluno1.setRg(num_rg);   // String informada através de Input;
        aluno1.setCpf(num_cpf);   // String informada através de Input;
        aluno1.setNomeMae(mae);   // String informada através de Input;
        aluno1.setNomePai(pai);   // String informada através de Input;
        // aluno1 = null;
        aluno1.setDataMatric(dtMatr);  // String informada através de Input;
                
        // Solucionando NullPointerException. O OBJETO SE TORNOU NULO NA LINHA 33: aluno1 = null; 
        // Exception in thread "main" java.lang.NullPointerException
        // at mod09_orientacao_a_objetos.PrimeiraClasseJava.main(PrimeiraClasseJava.java:60) 
                
        aluno1.setNomeEscola(escola);   // String informada através de Input;
        aluno1.setSerie(serie_esc);   // String informada através de Input;

        aluno1.getDisciplina().setNota1(Double.parseDouble(n1));  // String informada através de Input e convertida para double;
        aluno1.getDisciplina().setNota2(Double.parseDouble(n2));  // String informada através de Input e convertida para double;
        aluno1.getDisciplina().setNota3(Double.parseDouble(n3));  // String informada através de Input e convertida para double;
        aluno1.getDisciplina().setNota4(Double.parseDouble(n4));  // String informada através de Input e convertida para double;
        
        aluno1.getDisciplina().setDisciplina1(disciplina1);  // String informada através de Input;
        aluno1.getDisciplina().setDisciplina2(disciplina2);  // String informada através de Input;
        aluno1.getDisciplina().setDisciplina3(disciplina3);  // String informada através de Input;
        aluno1.getDisciplina().setDisciplina4(disciplina4);  // String informada através de Input;

        // Utilizando o Método toString(); para faciliar, eliminando todos os códigos abaixo
        // Chamando Métodos que retornam somente Atributos do Aluno:
        // System.out.println("O nome do aluno é " + aluno1.getNome());
        // System.out.println("A idade do aluno é " + aluno1.getIdade() + " anos");
        // System.out.println("Data de nascimento " + aluno1.getDataNasc());
        // System.out.println("Número do RG " + aluno1.getRg());
        // System.out.println("Número do CPF " + aluno1.getCpf());
        // System.out.println("Filho de " + aluno1.getNomeMae());
        // System.out.println("e de " + aluno1.getNomePai());
        // System.out.println("Escola " + aluno1.getNomeEscola());
        // System.out.println("Série " + aluno1.getSerie());
        // System.out.println("Data da Matrícula " + aluno1.getDataMatric());
        // System.out.println("Nota 1 " + aluno1.getNota1());
        // System.out.println("Nota 2 " + aluno1.getNota2());
        // System.out.println("Nota 3 " + aluno1.getNota3());
        // System.out.println("Nota 4 " + aluno1.getNota4());
        
        
        // Descrição do Objeto na Memória
        // É criada uma descrição diferente para cada new Aluno();
        // Poderá ser utilizado o toString() ou não;
        // Aluno aluno1 = new Aluno();
        // System.out.println(aluno1.toString());
        // System.out.println(aluno1);
        // System.out.println("-----------------------------------------");
        // aluno1 = new Aluno();
        // System.out.println(aluno1.toString());
        // System.out.println(aluno1);
        

        // Chamando o Método toString(); gerado automaticamente:
        // System.out.println(aluno1.toString());  // Ou, suprimindo o toString()
        System.out.println(aluno1);
        
        // Chamando um Método que retorna a Média do Aluno:
        System.out.println("A média do aluno é " + aluno1.getMediaNota());

        // Chamando um Método que retorna o Status do Aluno, utilizando o Operador Ternário:
        System.out.println("Resultado1: " + (aluno1.getStatusAluno() ? "O Aluno está Aprovado!!!" : "O Aluno está Reprovado!")); // Ou:
        // Chamando um Método que retorna o Status do Aluno, utilizando Strings como resposta:
        System.out.println("Resultado2: " + aluno1.getStatusAluno2());
        
        

        /* 
        // Equals e Hashcode (Diferenciar e Comparar Objetos)
        // Resultado antes de criar os Métodos hashCode() e equals() = Os alunos não são iguais;
        // Resultado após criar os Métodos hashCode() e equals() = Os alunos são iguais;
        // Podemos utilizar mais um Objeto que não se repete para a Diferenciação, no caso abaixo o Cpf;

        Aluno aluno1 = new Aluno();
        aluno1.setNome("Amaurí");
        aluno1.setCpf("123");

        Aluno aluno2 = new Aluno();
        aluno2.setNome("Amaurí");
        aluno2.setCpf("456");

        if (aluno1.equals(aluno2)) {
            System.out.println("Os alunos são iguais");
        } else {
            System.out.println("Os alunos não são iguais");
        }
        */

        
    }
}
