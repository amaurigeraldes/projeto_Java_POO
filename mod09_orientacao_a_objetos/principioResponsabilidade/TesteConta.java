package mod09_orientacao_a_objetos.principioResponsabilidade;


public class TesteConta {
    public static void main(String[] args) {
        ContaBancaria bancaria = new ContaBancaria();
        bancaria.setDescricao("Conta Bancária do Amaurí");
        
        System.out.println(bancaria);
        
        bancaria.menos100();
        bancaria.menos100();
        System.out.println(bancaria);

        bancaria.sacar(400);
        System.out.println(bancaria);

        bancaria.depositar(1000);
        System.out.println(bancaria);

        bancaria.mais100();
        System.out.println(bancaria);








    }
}
