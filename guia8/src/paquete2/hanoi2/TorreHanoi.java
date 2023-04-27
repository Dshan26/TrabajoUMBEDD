package paquete2.hanoi2;

public class TorreHanoi {
    private final int nDiscos;
    private final Pila[] torres;

    public TorreHanoi(int nDiscos) {
        this.nDiscos = nDiscos;
        this.torres = new Pila[]{new Pila(nDiscos), new Pila(nDiscos), new Pila(nDiscos)};
        // Inicializamos la primera torre con los discos
        for (int i = nDiscos; i > 0; i--) {
            torres[0].apilar(i);
        }
    }

    public void resolver() {
        moverDiscos(nDiscos, 0, 2, 1);
    }

    private void moverDiscos(int n, int origen, int destino, int auxiliar) {
        if (n > 0) {
            moverDiscos(n - 1, origen, auxiliar, destino);
            int disco = torres[origen].desapilar();
            torres[destino].apilar(disco);
            System.out.println("Moviendo disco " + disco + " de la torre " + (origen+1) + " a la torre " + (destino+1));
            moverDiscos(n - 1, auxiliar, destino, origen);
        }
    }
}
