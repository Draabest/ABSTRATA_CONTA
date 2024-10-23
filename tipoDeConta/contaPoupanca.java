public class contaPoupanca extends contaBancaria {
    private final double taxaSaque = 0.02; // Taxa de 2%
    private final double taxaDeposito = 0.01; // Taxa de 1%

    public contaPoupanca(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public void sacar(double valor) {
        double valorComTaxa = valor + (valor * taxaSaque);
        if (saldo >= valorComTaxa) {
            saldo -= valorComTaxa;
            System.out.println("Saque de " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saque não permitido. Saldo insuficiente.");
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