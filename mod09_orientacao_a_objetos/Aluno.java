package mod09_orientacao_a_objetos;

import java.util.ArrayList;
import java.util.List;

import mod10_heranca_polimorfismo_interfaces.Pessoa;

/* Esta é a classe/objeto que representa o Aluno: */
public class Aluno extends Pessoa { // <- Usando a Herança: extends Pessoa
    // Atributos do Aluno:
    /*
     * Declaração dos tipos public e private (por Padrão no Java são private)
     * private para manter o controle de acesso às variáveis, com maior segurança,
     * evita que um programador chame uma variável de forma incorreta e altere o
     * seu valor, podendo causar erros no sistema;
     */

    // Atributos foram transferidos para a Classe Pessoa que serão utilizados como
    // Herança:
    // private String nome;
    // private int idade;
    // private String dataNasc;
    // private String rg;
    // private String cpf;
    // private String nomeMae;
    // private String nomePai;

    // Atributos específicos do Aluno:
    private String dataMatric;
    private String nomeEscola;
    private String serie;

    // Instanciando uma Lista de Disciplinas
    private List<Disciplina> disciplinas = new ArrayList<Disciplina>();

    // 1) MÉTODO CONSTRUTOR:
    // 1.1) Método Construtor - Cria os Dados na Memória, sendo Padrão do Java
    public Aluno() {
    }

    // 1.2) Definindo um Nome Padrão:
    public Aluno(String nomePadrao) {
        nome = nomePadrao;
    }

    // 1.3) Definindo um Nome Padrão e uma Idade Padrão:
    public Aluno(String nomePadrao, int idadePadrao) {
        nome = nomePadrao;
        idade = idadePadrao;
    }

    // 2) MÉTODOS SETTERS E GETTERS:
    // SETTER: adiciona dados aos Atributos;
    // GETTER: obtém os dados dos Atribuitos;

    public String getDataMatric() {
        return dataMatric;
    }

    public void setDataMatric(String dataMatric) {
        this.dataMatric = dataMatric;
    }

    public String getNomeEscola() {
        return nomeEscola;
    }

    public void setNomeEscola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    // 3) MÉTODO PARA O CÁLCULO DA MÉDIA DO ALUNO:
    public double getMediaNota() {

        double somaNotas = 0.0;
        for (Disciplina disciplina : disciplinas) {
            somaNotas += disciplina.getNota();
        }
        // Qtde de Disciplinas: disciplinas.size() obtidas dinâmicamente
        return somaNotas / disciplinas.size();
    }

    // 4) MÉTODO PARA MOSTRAR O STATUS DO ALUNO
    // String: Aprovado ou Reprovado:
    public String getStatusAluno() { // <- Utilizando o Método que Calcula a Média
        double media = this.getMediaNota();
        if (media >= 7) {
            return StatusAluno.APROVADO;
        } else if (media >= 5 && media < 7) {
            return StatusAluno.RECUPERACAO;
        } else {
            return StatusAluno.REPROVADO;
        }
    }

    // 5) GERANDO O MÉTODO toString() AUTOMATICAMENTE PARA TODOS OS OBJETOS
    // toString: É necessária a incluisão dos Objetos/Elementos da Classe Pessoa:
    @Override
    public String toString() {
        return "Aluno [nome=" + nome + ", idade=" + idade + ", dataNasc=" + dataNasc + ", rg=" + rg + ", cpf=" + cpf
                + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai + ", dataMatric=" + dataMatric + ", nomeEscola="
                + nomeEscola + ", serie=" + serie + ", disciplinas=" + disciplinas + "]";
    }

    

    // 6) GERANDO OS MÉTODOS hashCode() E equals() AUTOMATICAMENTE PARA UM OU PARA
    // TODOS OS OBJETOS
    // CLICAR COM O BOTÃO DIREITO E SELECIONAR AÇÃO DE ORIGEM (SOURCE ACTION)
    // Diferenciação por Nome e Número do CPF:
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((dataMatric == null) ? 0 : dataMatric.hashCode());
        result = prime * result + ((nomeEscola == null) ? 0 : nomeEscola.hashCode());
        result = prime * result + ((serie == null) ? 0 : serie.hashCode());
        result = prime * result + ((disciplinas == null) ? 0 : disciplinas.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Aluno other = (Aluno) obj;
        if (dataMatric == null) {
            if (other.dataMatric != null)
                return false;
        } else if (!dataMatric.equals(other.dataMatric))
            return false;
        if (nomeEscola == null) {
            if (other.nomeEscola != null)
                return false;
        } else if (!nomeEscola.equals(other.nomeEscola))
            return false;
        if (serie == null) {
            if (other.serie != null)
                return false;
        } else if (!serie.equals(other.serie))
            return false;
        if (disciplinas == null) {
            if (other.disciplinas != null)
                return false;
        } else if (!disciplinas.equals(other.disciplinas))
            return false;
        return true;
    }

    





    




}
