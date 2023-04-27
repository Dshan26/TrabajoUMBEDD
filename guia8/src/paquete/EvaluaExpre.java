package paquete;

import java.util.Stack;

public class EvaluaExpre {
    // Método para evaluar la expresión que recibe como parametro una expresion matematica
    boolean evaluarExpresion(String expresion) {
        //recibe un valor booleano que nos indicara si la expresion esta balanceada, "si tiene ( o ])
        Stack<Character> pila = new Stack<>();
        //creamos una pila stack para recorrer mediante un for caracter por caracter
        for (int i = 0; i < expresion.length(); i++) {
            char c = expresion.charAt(i);
            //si algunas de estas dos expresiones es verdadera la agregamos a la pila mediante un push
            if (c == '(' || c == '[') {
                pila.push(c);
                //luego para el cierre hacemos lo mismo pero debe estar cerrado correctamente para que se cumpla nuestra condicion
            } else if (c == ')' || c == ']') {
                //si la pila esta vacia se retornara una expresion booleana false que indicara que la expresion no esta balanceada
                if (pila.empty()) {
                    return false;
                }
                //sacamos el ultimo elemento de la pila y comparamos si es igual al elemento de apertura si no es asi significa q no esta balanceada
                char top = pila.pop();
                if ((top == '(' && c != ')') || (top == '[' && c != ']')) {
                    return false;
                }
            }
        }
        //si la expresion esta balanceada y la pila esya vacia devolvera un true donde mostrara en pantalla un mensaje
        //la expresion esta balanceada
        return pila.empty();
    }
}
