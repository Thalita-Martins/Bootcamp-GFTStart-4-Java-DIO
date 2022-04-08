package Desafio_Banco;

public abstract class Conta implements IConta{//fazer como abstrata para não instanciar  objeto

    private static final int AGENCIA_PADRAO = 1;//Todas as contas teram um numero de agência padrão
    private static int SEQUENCIAL = 1;//numeros das contas vão ser gerados automatico por sequência

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {

        saldo-= valor;
    }

    @Override
    public void depositar(double valor) {

        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {//pega o saldo da conta subtrai e soma na conta destino
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public int getAgencia() {

        return agencia;
    }

    public int getNumero() {

        return numero;
    }

    public double getSaldo() {

        return saldo;
    }

    protected void imprimirInfosComuns() {//Informações para impressão do extrato
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("CPF: %d", this.cliente.getCpf()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
}
