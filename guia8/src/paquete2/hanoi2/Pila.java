package paquete2.hanoi2;

public class Pila {
    private final int[] elementos;
    private int tope;

    public Pila(int capacidad) {
        this.elementos = new int[capacidad];
        this.tope = -1;
    }

    public boolean estaVacia() {
        return tope == -1;
    }

    public boolean estaLlena() {
        return tope == elementos.length - 1;
    }

    //Este metodo recibe un entero y lo agrega a la pila si esta no esta llena
    public void apilar(int elemento) {
        if (!estaLlena()) {
            tope++;
            elementos[tope] = elemento;
        }
    }

    //este metodo saca el ultimo elemento agregado a la pila y lo devuelve, si la pila no esta vacia
    public int desapilar() {
        if (!estaVacia()) {
            int elemento = elementos[tope];
            tope--;
            return elemento;
        }
        return -1;
    }
}
