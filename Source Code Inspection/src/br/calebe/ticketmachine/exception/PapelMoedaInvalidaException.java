package br.calebe.ticketmachine.exception;

import br.calebe.ticketmachine.core.PapelMoeda;

/**
 *
 * @author Calebe de Paula Bianchini
 */
public class PapelMoedaInvalidaException extends Exception {
    
    protected PapelMoeda papelMoeda;
    
    public PapelMoedaInvalidaException(PapelMoeda papelMoeda) {
        this.papelMoeda = papelMoeda;
    }

    public PapelMoeda getPapelMoeda() {
        return papelMoeda;
    }
    
}
