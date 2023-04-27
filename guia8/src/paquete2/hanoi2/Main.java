package paquete2.hanoi2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\t\t\t--------Bienvenidos al juego Torres de hanoi------\n");

        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor ingrese el numero de discos que desea jugar:");
        int disco= sc.nextInt();

        TorreHanoi th = new TorreHanoi(disco); // Crea un juego de Torre de Hanoi con 3 discos
        th.resolver(); // Resuelve el juego
        System.out.println("-----------Juego terminado--------");
    }
}
