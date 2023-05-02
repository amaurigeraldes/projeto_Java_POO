package mod09_orientacao_a_objetos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import mod10_heranca_polimorfismo_interfaces.Secretario;

public class PrimeiraClasseJava {
    /* Main é um Método Auto Executável em Java */
    public static void main(String[] args) {

        // SIMPLES VALIDAÇÃO DE PERMISSÃO DE ACESSO
        String login = JOptionPane.showInputDialog("Login: ");
        String senha = JOptionPane.showInputDialog("Senha: ");

        // Instanciando a Classe secretario e fazendo a Autenticação, trabalhando diretamente com o Objeto;
        Secretario secretario = new Secretario();
        secretario.setLogin(login);
        secretario.setSenha(senha);

        // Condição para que o programa seja executado
        // if (login.equalsIgnoreCase("admin") && senha.equalsIgnoreCase("admin")) {
        // Se true Acessa, se false Não Acessa;
        if (secretario.autenticar()) {

            // INSTANCIANDO E CRIANDO UMA LISTA DE ALUNOS:
            List<Aluno> alunos = new ArrayList<Aluno>();

            // SEPARANDO LISTAS COM HASHMAP
            // É uma Lista que dentro dela temos uma chave que identifica uma sequência de
            // valores
            // Elimina a necessidade de criação das listas de alunosAprov, alunosRecup e
            // alunosRepro;
            HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

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

            // INICIALIZANDO OS VALORES DO HASHMAP:
            maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
            maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
            maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());

            // SEPARANDO AS LISTAS DE ALUNOS APROVADOS, REPROVADOS E EM RECUPERAÇÃO
            for (Aluno aluno : alunos) {

                if (aluno.getStatusAluno().equalsIgnoreCase(StatusAluno.APROVADO)) {
                    maps.get(StatusAluno.APROVADO).add(aluno);
                } else if (aluno.getStatusAluno().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
                    maps.get(StatusAluno.RECUPERACAO).add(aluno);
                } else if (aluno.getStatusAluno().equalsIgnoreCase(StatusAluno.REPROVADO)) {
                    maps.get(StatusAluno.REPROVADO).add(aluno);
                }
            }

            // CRIANDO LISTAS DE ALUNOS APROVADOS, REPROVADOS E EM RECUPERAÇÃO
            System.out.println("-------------------- Lista Aprovados -----------------------");
            for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
                System.out.println("Aluno: " + aluno.getNome() + "  Média: " + aluno.getMediaNota() + "  Resultado: "
                        + aluno.getStatusAluno());
            }
            System.out.println("------------------------------------------------------------");

            System.out.println("-------------------- Lista Recuperação ---------------------");
            for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
                System.out.println("Aluno: " + aluno.getNome() + "  Média: " + aluno.getMediaNota() + "  Resultado: "
                        + aluno.getStatusAluno());
            }
            System.out.println("------------------------------------------------------------");

            System.out.println("-------------------- Lista Reprovados ----------------------");
            for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
                System.out.println("Aluno: " + aluno.getNome() + "  Média: " + aluno.getMediaNota() + "  Resultado: "
                        + aluno.getStatusAluno());
            }
            System.out.println("------------------------------------------------------------");

        } else {
            JOptionPane.showMessageDialog(null, "Acesso não permitido!");

        }
    }
}
