import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import net.salesianos.reparacion.Reparacion;

public class App {
    public static void main(String[] args) {
        Queue<Reparacion> cola = new LinkedList<>();
        Stack<Reparacion> pila = new Stack<>();

        cola.add(new Reparacion("R001", "Ana", "Cambio de pantalla", false));
        cola.add(new Reparacion("R002", "Luis", "Batería dañada", true));
        cola.add(new Reparacion("R003", "Marta", "Teclado roto", false));
        cola.add(new Reparacion("R004", "Pedro", "Puerto de carga", true));

        System.out.println("Reparaciones pendientes:");
        for (Reparacion r : cola) System.out.println(r);
         System.out.println("\nPrimera reparación sin eliminar:");
        System.out.println(cola.peek());

        Reparacion r1 = cola.poll();
        Reparacion r2 = cola.poll();

        pila.push(r1);
        pila.push(r2);

        System.out.println("\nÚltima reparación atendida:");
        System.out.println(pila.peek());

        System.out.println("\nExtrayendo una del historial:");
        System.out.println(pila.pop());

        System.out.println("\nReparaciones pendientes: " + cola.size());
        System.out.println("¿Cola vacía? " + cola.isEmpty());
    
    }
}
