package mod10_heranca_polimorfismo_interfaces;

// Classe filha da Classe Pessoa que extende de pessoa
public class Diretor extends Pessoa {

    private String registroEducacao;
    private int tempoDirecao;
    private String titulacao;

    // toString: É necessária a incluisão dos Objetos/Elementos da Classe Pessoa:
    @Override
    public String toString() {
        return "Diretor [nome=" + nome + ", idade=" + idade + ", dataNasc=" + dataNasc + ", rg=" + rg + ", cpf=" + cpf
                + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai + ", registroEducacao=" + registroEducacao
                + ", tempoDirecao=" + tempoDirecao + ", titulacao=" + titulacao + "]";
    }

    public String getRegistroEducacao() {
        return registroEducacao;
    }

    public void setRegistroEducacao(String registroEducacao) {
        this.registroEducacao = registroEducacao;
    }

    public int getTempoDirecao() {
        return tempoDirecao;
    }

    public void setTempoDirecao(int tempoDirecao) {
        this.tempoDirecao = tempoDirecao;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    // Método abstrato criado na Classe Pessoa
    @Override
    public double salario() {
        return 3900.78;
    }

    


    

}
