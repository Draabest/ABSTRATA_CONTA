public class banco {
    public static void main(String[] args) {
        // Testando Conta Poupança
        contaBancaria poupanca = new contaPoupanca(500.00);
        poupanca.sacar(100);
        poupanca.depositar(200);
        poupanca.exibirSaldo();

        // Testando Conta Corrente
        contaBancaria corrente = new contaCorrente(300.00, 500.00);
        corrente.sacar(600);
        corrente.depositar(150);
        corrente.exibirSaldo();
    }
}
