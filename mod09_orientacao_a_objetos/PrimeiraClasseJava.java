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



        // Contrutores Padrões (sem parâmetro): 
        Aluno aluno1 = new Aluno(); 

        // Setando os Dados do Aluno:
        aluno1.setNome(nome);  // String informada através de Input;
        aluno1.setIdade(Integer.valueOf(idade));  // String informada via Input e convertida para int;
        aluno1.setDataNasc(dtNasc);  // String informada através de Input;
        aluno1.setRg(num_rg);   // String informada através de Input;
        aluno1.setCpf(num_cpf);   // String informada através de Input;
        aluno1.setNomeMae(mae);   // String informada através de Input;
        aluno1.setNomePai(pai);   // String informada através de Input;
        aluno1.setDataMatric(dtMatr);  // String informada através de Input;
        aluno1.setNomeEscola(escola);   // String informada através de Input;
        aluno1.setSerie(serie_esc);   // String informada através de Input;
        
        
        // Instânciando e Setando as Disciplinas
        for (int pos = 1; pos <= 4; pos++) {
            String nomeDisc = JOptionPane.showInputDialog("Nome da disciplina " + pos + ":");
            String notaDisc = JOptionPane.showInputDialog("Nota da disciplina " + pos + ":");
            
            Disciplina disciplina = new Disciplina();
            disciplina.setDisciplina(nomeDisc);
            disciplina.setNota(Double.valueOf(notaDisc));

            // Recebendo os Dados das Disciplinas
            aluno1.getDisciplinas().add(disciplina);
        }


        // Chamando o Método toString(); gerado automaticamente:
        // System.out.println(aluno1.toString());  // Ou, suprimindo o toString()
        System.out.println(aluno1);
        
        // Chamando um Método que retorna a Média do Aluno:
        System.out.println("A média do aluno é " + aluno1.getMediaNota());

        // Chamando um Método que retorna o Status do Aluno, utilizando o Operador Ternário:
        System.out.println("Resultado1: " + (aluno1.getStatusAluno() ? "O Aluno está Aprovado!!!" : "O Aluno está Reprovado!")); // Ou:
        
        // Chamando um Método que retorna o Status do Aluno, utilizando Strings como resposta:
        System.out.println("Resultado2: " + aluno1.getStatusAluno2());
        
        

        

        
    }
}
