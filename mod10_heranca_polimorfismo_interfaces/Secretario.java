package mod10_heranca_polimorfismo_interfaces;

import mod10_heranca_polimorfismo_interfaces.Interfaces.PermitirAcesso;

// Classe filha da Classe Pessoa que extende de pessoa
// Implementar a Interface: implements PermitirAcesso
public class Secretario extends Pessoa implements PermitirAcesso {

    private String registro;
    private String nivelCargo;
    private String experiencia;

    // Para autenticar, é necessário um Login e uma Senha;
    // Porém este é o jeito mais fácil mas causa a "quebra do código ou da estrutura";
    // Excluir pois não iremos fazer a autenticação diretamente com o Objeto, mas com a Interface;
    // private String Login; // Excluir
    // private String Senha; // Excluir

    // Outra forma é usando Interfaces e Construtores:
    private String login; // Incluir novamente
    private String senha; // Incluir novamente
    // Incluir o Construtor Padrão do Java:
    public Secretario(String login, String senha) {  // Sempre irá receber o Login e a Senha como parâmetro;
        // Indicar os parâmetros da classe:
    this.login = login;
    this.senha = senha;
    }
    public Secretario() {  // Além do Construtor com parâmetros, também podemos manter o Construtor Padrão;

    }


    // toString: É necessária a inclusão dos Objetos/Elementos da Classe Pessoa:
    @Override
    public String toString() {
        return "Secretario [nome=" + nome + ", idade=" + idade + ", dataNasc=" + dataNasc + ", rg=" + rg + ", cpf="
                + cpf + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai + ", registro=" + registro + ", nivelCargo="
                + nivelCargo + ", experiencia=" + experiencia + "]";
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public String getNivelCargo() {
        return nivelCargo;
    }

    public void setNivelCargo(String nivelCargo) {
        this.nivelCargo = nivelCargo;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }
    
    
    // Método abstrato criado na Classe Pessoa
    @Override // Identifica um Método Sobreescrito
    public double salario() {
        return 1800.80 * 0.9;
    }

    // Método do contrato de autenticação, obrigatório ao Implementar a Interface diretamente com o Objeto;
    // Excluir:
    // @Override
    // public boolean autenticar() {
    //     // Retorna true caso login="admin" e senha = "admin", senão retorna false;
    //     return login.equals("admin") && senha.equals("admin");
    // }


    // Método do contrato de autenticação, obrigatório ao Implementar a Interface diretamente com a Interface;
    // Incluir:
    @Override
    public boolean autenticar(String login, String senha) {
        // Outra forma é usando Interfaces e Construtores:
        // return login.equals("admin") && senha.equals("admin");  // Excluir
        this.login = login;
        this.senha = senha;
        return autenticar();  // Pode chamar o Método autenticar abaixo;
    }


    // Outra forma é usando Interfaces e Construtores:
    @Override
    public boolean autenticar() {
        return login.equals("admin") && senha.equals("admin");
    }

    


    

}
