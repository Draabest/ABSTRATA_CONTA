public class contaCorrente extends contaBancaria {
    private final double taxaSaque = 0.05; // Taxa de 5%
    private final double taxaDeposito = 0.015; // Taxa de 1.5%
    private double limite; // Limite extra que a ContaCorrente pode usar

    public contaCorrente(double saldoInicial, double limite) {
        super(saldoInicial);
        this.limite = limite;
    }

    @Override
    public void sacar(double valor) {
        double valorComTaxa = valor + (valor * taxaSaque);
        if (saldo + limite >= valorComTaxa) {
            saldo -= valorComTaxa;
            System.out.println("Saque de " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saque não permitido. Limite excedido.");
        }
    }

    @Override
    public void depositar(double valor) {
        double valorComTaxa = valor - (valor * taxaDeposito);
        saldo += valorComTaxa;
        System.out.println("Depósito de " + valor + " realizado com sucesso.");
    }

    @Override
    public double consultarSaldo() {
        return saldo;
    }
}