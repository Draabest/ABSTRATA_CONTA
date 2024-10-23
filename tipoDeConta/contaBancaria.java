public abstract class contaBancaria {
    protected double saldo;

    // Construtor que inicializa o saldo
    public contaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    // Métodos abstratos para as operações de saque, depósito e consulta
    public abstract void sacar(double valor);
    public abstract void depositar(double valor);
    public abstract double consultarSaldo();

    // Método comum para exibir o saldo
    public void exibirSaldo() {
        System.out.println("Saldo atual: " + this.saldo);
    }
}