package mod09_orientacao_a_objetos.principioResponsabilidade;

public class ContaBancaria {
    private String descricao;
    
    private double saldo = 8000;

    public void mais100() {
        saldo += 100;
    }

    public void menos100() {
        saldo -= 100;
    }

    public void sacar(double saque) {
        saldo -= saque;
    }

    public void depositar(double deposito) {
        saldo += deposito;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "ContaBancaria [descricao=" + descricao + ", saldo=" + saldo + "]";
    }

}
