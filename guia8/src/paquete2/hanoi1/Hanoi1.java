package paquete2.hanoi1;

public class Hanoi1 {
    public static void main(String[] args) {
        Hanoi1 Solucion = new Hanoi1();

        Solucion.Hanoi(64,1,2,3);

    }

    public void Hanoi(int discos, int torre1, int torre2, int torre3){

        //caso base
        if( discos==1){
            System.out.println("Mover Disco de Torre "+ torre1+" a Torre" + torre3);
        }
        else {
            //dominio
            Hanoi(discos-1, torre1, torre3, torre2);
            System.out.println("Mover Disco de Torre "+ torre1+ " a Torre "+torre3);
            Hanoi(discos-1, torre2, torre1, torre3);
        }

    }
}
