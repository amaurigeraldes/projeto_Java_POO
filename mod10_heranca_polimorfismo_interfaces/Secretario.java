package mod10_heranca_polimorfismo_interfaces;

// Classe filha da Classe Pessoa que extende de pessoa
public class Secretario extends Pessoa {

    private String registro;
    private String nivelCargo;
    private String experiencia;


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

    // Método abstrato criado na Classe Pessoa
    @Override // Identifica um Método Sobreescrito
    public double salario() {
        return 1800.80 * 0.9;
    }

    

}
