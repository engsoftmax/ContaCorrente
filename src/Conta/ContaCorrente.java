package Conta;

public class ContaCorrente {
	
	private int numeroConta;
    private String nomeCorrentista;
    private double saldo;
	
	public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente(123, "João da Silva");
        conta.deposito(1000);
        conta.saque(500);
        conta.imprimirInformacoes();
	}

    public ContaCorrente(int numeroConta, String nomeCorrentista) {
        this.numeroConta = numeroConta;
        this.nomeCorrentista = nomeCorrentista;
        this.saldo = 0.0;
    }

    public void alterarNome(String novoNome) {
        nomeCorrentista = novoNome;
    }

    public void deposito(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    public void saque(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor de saque inválido.");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void imprimirInformacoes() {
        System.out.println("Número da Conta: " + numeroConta);
        System.out.println("Nome do Correntista: " + nomeCorrentista);
        System.out.println("Saldo: R$" + saldo);
    }
}

