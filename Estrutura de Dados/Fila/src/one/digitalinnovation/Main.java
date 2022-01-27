package one.digitalinnovation;

public class Main {

    public static void main(String[] args) {

        Fila fila = new Fila();

        fila.enqueue(new No("primeiro"));
        fila.enqueue(new No("segundo"));
        fila.enqueue(new No("terceiro"));
        fila.enqueue(new No("quarto"));
        fila.enqueue(new No("quinto"));

        System.out.println(fila);

        fila.dequeue();
        fila.dequeue();

        System.out.println(fila);

        fila.enqueue(new No("sexto"));

        System.out.println(fila);



    }
}
