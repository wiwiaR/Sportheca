package one.digitalinnovation;

public class Main {
    public static void main(String[] args) {

        Pilha pilha = new Pilha();

        pilha.push(new No(1));
        pilha.push(new No(2));
        pilha.push(new No(3));
        pilha.push(new No(4));
        pilha.push(new No(5));
        pilha.push(new No(6));
        pilha.push(new No(7));
        pilha.push(new No(8));

        System.out.println(pilha.toString());

        pilha.pop();
        pilha.pop();
        pilha.pop();
        pilha.pop();

        System.out.println(pilha.toString());

        pilha.push(new No(9));
        pilha.push(new No(10));

        System.out.println(pilha.toString());
    }
}
