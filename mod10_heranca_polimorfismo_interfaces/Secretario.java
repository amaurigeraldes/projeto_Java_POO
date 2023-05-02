package mod10_heranca_polimorfismo_interfaces;

import mod10_heranca_polimorfismo_interfaces.Interfaces.PermitirAcesso;

// Classe filha da Classe Pessoa que extende de pessoa
// Implementar a Interface: implements PermitirAcesso
public class Secretario extends Pessoa implements PermitirAcesso {

    private String registro;
    private String nivelCargo;
    private String experiencia;

    // Para autenticar, é necessário um Login e uma Senha:
    private String Login;
    private String Senha;




    // toString: É necessária a incluisão dos Objetos/Elementos da Classe Pessoa:
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
    
    public String getLogin() {
        return Login;
    }

    public void setLogin(String login) {
        Login = login;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String senha) {
        Senha = senha;
    }

    // Método abstrato criado na Classe Pessoa
    @Override // Identifica um Método Sobreescrito
    public double salario() {
        return 1800.80 * 0.9;
    }

    // Método do contrato de autenticação, obrigatório ao Implementar a Interface:
    @Override
    public boolean autenticar() {
        // Retorna true caso login="admin" e senha = "admin", senão retorna false;
        return Login.equals("admin") && Senha.equals("admin");
    }

    

}
