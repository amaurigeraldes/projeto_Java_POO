package mod09_orientacao_a_objetos;

import java.util.ArrayList;
import java.util.List;

/* Esta é a classe/objeto que representa o Aluno: */
public class Aluno {
    // Atributos do Aluno: 
    /* Declaração dos tipos public e private (por Padrão no Java são private)
    private para manter o controle de acesso às variáveis, com maior segurança, 
    evita que um programador chame uma variável de forma incorreta e altere o
    seu valor, podendo causar erros no sistema;
    */
    private String nome;
    private int idade;
    private String dataNasc;
    private String rg;
    private String cpf;
    private String nomeMae;
    private String nomePai;
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

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getDataNasc() {
        return this.dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getRg() {
        return this.rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNomeMae() {
        return this.nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getNomePai() {
        return this.nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getDataMatric() {
        return this.dataMatric;
    }

    public void setDataMatric(String dataMatric) {
        this.dataMatric = dataMatric;
    }

    public String getNomeEscola() {
        return this.nomeEscola;
    }

    public void setNomeEscola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
    }

    public String getSerie() {
        return this.serie;
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
    public String getStatusAluno() {           // <- Utilizando o Método que Calcula a Média
        double media = this.getMediaNota();
        if (media >= 70) {
            return ("O Aluno " + this.getNome() + " está Aprovado!!!");
        } else if (media >= 50 && media < 70) {
            return "O Aluno " + this.getNome() + " está em Recuperação!!";
        } else {
            return "O Aluno " + this.getNome() + " está Reprovado!";
        }
    }



    // 5) GERANDO O MÉTODO toString() AUTOMATICAMENTE PARA TODOS OS OBJETOS
    @Override
    public String toString() {
        return "Aluno [nome=" + nome + ", idade=" + idade + ", dataNasc=" + dataNasc + ", rg=" + rg + ", cpf=" + cpf
                + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai + ", dataMatric=" + dataMatric + ", nomeEscola="
                + nomeEscola + ", serie=" + serie + "]";
    }


    // 6) GERANDO OS MÉTODOS hashCode() E equals() AUTOMATICAMENTE PARA UM OU PARA TODOS OS OBJETOS
    // CLICAR COM O BOTÃO DIREITO E SELECIONAR AÇÃO DE ORIGEM (SOURCE ACTION)
    // Diferenciação por Nome e Número do CPF:
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
        return result;
    }
        
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Aluno other = (Aluno) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (cpf == null) {
            if (other.cpf != null)
                return false;
        } else if (!cpf.equals(other.cpf))
            return false;
        return true;
    }
    public int setDis(Integer valueOf) {
        return 0;
    }
    



}
