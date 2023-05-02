package mod10_heranca_polimorfismo_interfaces.Interfaces;

// Essa interface será o nosso contrato de autenticação
public interface PermitirAcesso {
    // Apenas Declaração do Método
    // Excluir para não fazer a autenticação diretamente com o Objeto;
    // public boolean autenticar();  
    // Incluir para fazer a autenticação diretamente com a Interface;
    public boolean autenticar(String login, String senha);
    // Outra forma é usando Interfaces e Construtores:
    public boolean autenticar();  
}
