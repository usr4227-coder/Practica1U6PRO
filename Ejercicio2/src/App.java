import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import net.salesianos.asistente.Asistente;

public class App {
    public static void main(String[] args) {

        Set<Asistente> set = new HashSet<>();
        int intentos = 0;

        Asistente[] datos = {
                new Asistente("111A", "Elena", "DAM1"),
                new Asistente("222B", "Hugo", "DAM1"),
                new Asistente("333C", "Sara", "DAW1"),
                new Asistente("111A", "Elena repetida", "DAM2"),
                new Asistente("444D", "Marcos", "DAW1"),
                new Asistente("555E", "Lucía", "DAM1")
        };

        for (Asistente a : datos) {
            intentos++;
            set.add(a);
        }

        System.out.println("Contenido del set:");
        for (Asistente a : set)
            System.out.println(a);

        System.out.println("\nIntentos de añadir: " + intentos);
        System.out.println("Añadidos realmente: " + set.size());

        // No se añaden duplicados porque HashSet usa equals() y hashCode() basados en
        // el DNI.

        Map<String, Integer> mapa = new HashMap<>();

        for (Asistente a : set) {
            mapa.put(a.getGrupo(), mapa.getOrDefault(a.getGrupo(), 0) + 1);
        }

        System.out.println("\nMapa completo:");
        System.out.println(mapa);

        System.out.println("\nAsistentes en DAM1: " + mapa.getOrDefault("DAM1", 0));

        System.out.println("¿Existe ASIR1? " + mapa.containsKey("ASIR1"));

        mapa.remove("ASIR1");

        System.out.println("\nClaves del mapa:");
        for (String clave : mapa.keySet())
            System.out.println(clave);
    }
}
