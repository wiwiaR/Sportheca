package one.digitalinnovation;

public class Pilha {

    private No refNoEntrada;


    public Pilha() {
        this.refNoEntrada = null;
    }

    public void push(No novoNo) {
        No auxNo = refNoEntrada;
        refNoEntrada = novoNo;
        refNoEntrada.setRefNo(auxNo);
    }

    public No pop() {
        if (!isEmpty()) {
            No noPoped = refNoEntrada;
            refNoEntrada = refNoEntrada.getRefNo();
            return noPoped;
        }
        return null;
    }

    public No top() {
        return refNoEntrada;
    }

    public boolean isEmpty() {
        return refNoEntrada == null ? true : false;
    }

    @Override
    public String toString() {

        String stringRetorno = "-----------------\n";
        stringRetorno += "      Pilha\n";
        stringRetorno += "-----------------\n";

        No noAux = refNoEntrada;

        while (true) {
            if (noAux != null) {
                stringRetorno += "[No{dados=" + noAux.getDado() + "}]\n";
                noAux = noAux.getRefNo();
            } else {
                break;
            }
        }
        stringRetorno += "=================\n";
        return stringRetorno;
    }
}
