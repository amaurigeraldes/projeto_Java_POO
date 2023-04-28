package mod09_orientacao_a_objetos;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class PrimeiraClasseJava {
    /* Main é um Método Auto Executável em Java */
    public static void main(String[] args) {

        // INSTANCIANDO E CRIANDO UMA LISTA DE ALUNOS:
        List<Aluno> alunos = new ArrayList<Aluno>();

        // QUANTIDADE DE ALUNOS A SER CRIADA:
        String totAlunos = JOptionPane.showInputDialog("Total de alunos?");
        int qtAlu = Integer.valueOf(totAlunos);

        // Looping para gerar a Lista de Alunos:
        for (int qtde = 1; qtde <= qtAlu; qtde++) {

            // CRIANDO AS ENTRADAS OU INPUT DOS DADOS PELO USUÁRIO:
            String nome = JOptionPane.showInputDialog("Informar o nome do aluno " + qtde + ":");
            // String idade = JOptionPane.showInputDialog("Idade:");
            // String dtNasc = JOptionPane.showInputDialog("Data de nascimento:");
            // String num_rg = JOptionPane.showInputDialog("RG:");
            // String num_cpf = JOptionPane.showInputDialog("CPF:");
            // String mae = JOptionPane.showInputDialog("Nome da mãe:");
            // String pai = JOptionPane.showInputDialog("Nome do pai:");
            // String dtMatr = JOptionPane.showInputDialog("Data da matrícula:");
            // String escola = JOptionPane.showInputDialog("Nome da escola:");
            // String serie_esc = JOptionPane.showInputDialog("Série escolar:");
            String totDisc = JOptionPane.showInputDialog("Total de disciplinas?");

            // Contrutores Padrões (sem parâmetro):
            Aluno aluno1 = new Aluno();

            // Setando os Dados do Aluno:
            aluno1.setNome(nome);
            // aluno1.setIdade(Integer.valueOf(idade));
            // aluno1.setDataNasc(dtNasc);
            // aluno1.setRg(num_rg);
            // aluno1.setCpf(num_cpf);
            // aluno1.setNomeMae(mae);
            // aluno1.setNomePai(pai);
            // aluno1.setDataMatric(dtMatr);
            // aluno1.setNomeEscola(escola);
            // aluno1.setSerie(serie_esc);
            int qtDisc = Integer.valueOf(totDisc);

            // Instânciando e Setando as Disciplinas
            for (int pos = 1; pos <= qtDisc; pos++) {
                String nomeDisc = JOptionPane.showInputDialog("Nome da disciplina " + pos + ":");
                String notaDisc = JOptionPane.showInputDialog("Nota da disciplina " + pos + ":");

                Disciplina disciplina = new Disciplina();
                disciplina.setDisciplina(nomeDisc);
                disciplina.setNota(Double.valueOf(notaDisc));

                // Recebendo os Dados das Disciplinas
                aluno1.getDisciplinas().add(disciplina);
            }

            // Removendo Disciplina da Lista: Yes = 0, No = 1, Cancel = 2
            int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina? ");
            if (escolha == 0) {
                int continuarRemover = 0;
                int indice = 1;
                // Removendo Disciplina enquanto houver Disciplina:
                while (continuarRemover == 0) {
                    String disciplinaRemover = JOptionPane.showInputDialog("Informe a opção 1, 2, 3 ou 4:");
                    aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - indice);
                    indice++; // Incrementando o indice para manter a Posição do Elemento na Lista
                    continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a Remover?");
                }
            }

            // Adicionando Aluno:
            alunos.add(aluno1);
        }

        // Outra forma de Percorrer a Lista de Alunos para fazer alguma substituição, se necessário;
        // Utilizando o Índice para percorrer as Posições
        for (int pos = 0; pos < alunos.size(); pos++) {
            System.out.println("=====================================================");
            Aluno aluno = alunos.get(pos);

            // Substituindo um Aluno na Lista:
            if (aluno.getNome().equalsIgnoreCase("Alex")) {
                Aluno trocar = new Aluno();
                trocar.setNome("Juca");

                Disciplina disciplina = new Disciplina();
                disciplina.setDisciplina("Matemática");
                disciplina.setNota(9.6);

                trocar.getDisciplinas().add(disciplina);

                alunos.set(pos, trocar);
                aluno = alunos.get(pos);
            }


            System.out.println("Aluno: " + aluno.getNome());
            System.out.println("Média: " + aluno.getMediaNota());
            System.out.println("Resultado: " + aluno.getStatusAluno());
            
            for (int posX = 0; posX < aluno.getDisciplinas().size(); posX++) {
                Disciplina disc = aluno.getDisciplinas().get(posX);
                System.out.println("Matéria: " + disc.getDisciplina() + " Nota: " + disc.getNota());
            }
            System.out.println("=====================================================");
        }


        // Percorrer a Lista de Alunos:
        for (Aluno aluno : alunos) {
        System.out.println("__________________________________________________");
            // Procurando um Aluno na Lista
            if (aluno.getNome().equalsIgnoreCase("Zé")) {
                // Removendo um Aluno da Lista
                alunos.remove(aluno);
                break;
            } else {
                // Chamando o Método toString(); gerado automaticamente:
                // System.out.println(aluno1.toString()); // Ou, suprimindo o toString()
                System.out.println(aluno);
                // Chamando um Método que retorna a Média do Aluno:
                System.out.println("A média do aluno é " + aluno.getMediaNota());
                // Chamando um Método que retorna o Status do Aluno, utilizando Strings como
                // resposta:
                System.out.println("Resultado: " + aluno.getStatusAluno());
            }
        System.out.println("__________________________________________________");
        }
    }
}
