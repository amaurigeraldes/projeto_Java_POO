package mod10_heranca_polimorfismo_interfaces;

import mod10_heranca_polimorfismo_interfaces.Interfaces.PermitirAcesso;

// Classe filha da Classe Pessoa que extende de pessoa
// Implementar a Interface: implements PermitirAcesso
public class Diretor extends Pessoa implements PermitirAcesso {

    private String registroEducacao;
    private int tempoDirecao;
    private String titulacao;

    // Para Autenticar o Diretor:

    private String login;
    private String senha;

    // Incluir o Construtor Padrão do Java:
    public Diretor(String login, String senha) { // Sempre irá receber o Login e a Senha como parâmetro;
        // Indicar os parâmetros da classe:
        this.login = login;
        this.senha = senha;
    }

    public Diretor() { // Além do Construtor com parâmetros, também podemos manter o Construtor Padrão;

    }

    // Método do contrato de autenticação, obrigatório ao Implementar a Interface
    // diretamente com a Interface;
    // Incluir:
    @Override
    public boolean autenticar(String login, String senha) {
        // Outra forma é usando Interfaces e Construtores:
        // return login.equals("admin") && senha.equals("admin"); // Excluir
        this.login = login;
        this.senha = senha;
        return autenticar(); // Pode chamar o Método autenticar abaixo;
    }

    // Outra forma é usando Interfaces e Construtores:
    @Override
    public boolean autenticar() {
        return login.equals("admin") && senha.equals("admin");
    }

    // toString: É necessária a inclusão dos Objetos/Elementos da Classe Pessoa:
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
