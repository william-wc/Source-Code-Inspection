package br.calebe.ticketmachine.core;

import java.util.Iterator;

/**
 *
 * @author Calebe de Paula Bianchini
 */
class Troco {

    protected PapelMoeda[] papeisMoeda;

    public Troco(int valor) {
        int[] moedas = {2, 5, 10, 20, 50, 100};
        papeisMoeda = new PapelMoeda[moedas.length];
        
        for(int i = moedas.length - 1; i >= 0; i--) {
            int count = valor / moedas[i];
            valor %= moedas[i];
            papeisMoeda[i] = new PapelMoeda(moedas[i], count);
        }
    }

    public Iterator<PapelMoeda> getIterator() {
        return new TrocoIterator(this);
    }

    class TrocoIterator implements Iterator<PapelMoeda> {

        protected Troco troco;
        private int count;

        public TrocoIterator(Troco troco) {
            this.troco = troco;
            count = troco.papeisMoeda.length - 1;
        }

        @Override
        public boolean hasNext() {
            return count > 0;
        }

        @Override
        public PapelMoeda next() {
            PapelMoeda ret = null;
            if(hasNext()) {
                count--;
                ret = troco.papeisMoeda[count];
            }
            return ret;
        }

        @Override
        public void remove() {
            next();
        }
    }
}
