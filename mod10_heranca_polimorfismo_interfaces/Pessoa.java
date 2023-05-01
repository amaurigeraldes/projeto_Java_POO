package mod10_heranca_polimorfismo_interfaces;


// Herança: Classe Pai, ou classe Master, ou Superclasse;
// Possui Atributos comuns a todos os Objetos Filhos;
public class Pessoa {
    // Para funcionar na Superclasse, alterar a Visibilidade dos Atributos de private para protected
    protected String nome;
    protected int idade;
    protected String dataNasc;
    protected String rg;
    protected String cpf;
    protected String nomeMae;
    protected String nomePai;

    // Retorna true caso >= 18, senão false:
    public boolean pessoaMaiorIdade() {
        return idade >= 18;
    }


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getDataNasc() {
        return dataNasc;
    }
    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }
    public String getRg() {
        return rg;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getNomeMae() {
        return nomeMae;
    }
    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }
    public String getNomePai() {
        return nomePai;
    }
    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }


    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", idade=" + idade + ", dataNasc=" + dataNasc + ", rg=" + rg + ", cpf=" + cpf
                + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai + "]";
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + idade;
        result = prime * result + ((dataNasc == null) ? 0 : dataNasc.hashCode());
        result = prime * result + ((rg == null) ? 0 : rg.hashCode());
        result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
        result = prime * result + ((nomeMae == null) ? 0 : nomeMae.hashCode());
        result = prime * result + ((nomePai == null) ? 0 : nomePai.hashCode());
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
        Pessoa other = (Pessoa) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (idade != other.idade)
            return false;
        if (dataNasc == null) {
            if (other.dataNasc != null)
                return false;
        } else if (!dataNasc.equals(other.dataNasc))
            return false;
        if (rg == null) {
            if (other.rg != null)
                return false;
        } else if (!rg.equals(other.rg))
            return false;
        if (cpf == null) {
            if (other.cpf != null)
                return false;
        } else if (!cpf.equals(other.cpf))
            return false;
        if (nomeMae == null) {
            if (other.nomeMae != null)
                return false;
        } else if (!nomeMae.equals(other.nomeMae))
            return false;
        if (nomePai == null) {
            if (other.nomePai != null)
                return false;
        } else if (!nomePai.equals(other.nomePai))
            return false;
        return true;
    }

    
    


    



}
