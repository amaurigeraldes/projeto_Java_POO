package mod10_heranca_polimorfismo_interfaces;

import mod10_heranca_polimorfismo_interfaces.Interfaces.PermitirAcesso;

// Somente Classes que possuem o Contrato de Interface de PermitirAcesso chamarão o autenticar;
// Trava a autenticação do código para ter mais segurança;
public class FuncaoAutenticacao {

    private PermitirAcesso permitirAcesso;
    
    // public boolean autenticarCursoJava(PermitirAcesso acesso) {
    //     return acesso.autenticar();
    // }

    public boolean autenticar() {
        return permitirAcesso.autenticar();
    }


    public FuncaoAutenticacao(PermitirAcesso acesso) {
        this.permitirAcesso = acesso;
    }


	// public boolean autenticar() {
		// return false;
	// }


}
