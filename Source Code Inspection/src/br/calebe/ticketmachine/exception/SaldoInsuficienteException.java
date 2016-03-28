package br.calebe.ticketmachine.exception;

/**
 *
 * @author Calebe de Paula Bianchini
 */
public class SaldoInsuficienteException extends Exception {
    
    protected int saldo;

    public SaldoInsuficienteException(int saldo) {
        this.saldo = saldo;
    }

    public int getSaldo() {
        return saldo;
    }
   
}
