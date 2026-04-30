import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;
import net.salesianos.videojuego.Videojuego;

public class App {

    public static void main(String[] args) throws Exception {

        String rutaCSV = "src/net/salesianos/data/videojuego.csv";
        String rutaResumen = "src/net/salesianos/data/resumen_videojuegos.txt";
        String rutaLog = "src/net/salesianos/data/log_videojuegos.txt";

        ArrayList<Videojuego> lista = new ArrayList<>();

        List<String> lineas = Files.readAllLines(Path.of(rutaCSV));

        for (int i = 1; i < lineas.size(); i++) {
            String[] partes = lineas.get(i).split(",");
            String titulo = partes[0].trim();
            String genero = partes[1].trim();
            int horas = Integer.parseInt(partes[2].trim());
            lista.add(new Videojuego(titulo, genero, horas));
        }

        int total = lista.size();
        int totalHoras = 0;
        Videojuego max = null;

        for (Videojuego v : lista) {
            totalHoras += v.getHorasJugadas();
            if (max == null || v.getHorasJugadas() > max.getHorasJugadas()) {
                max = v;
            }
        }

        double media = total > 0 ? (double) totalHoras / total : 0;

        String resumen = "Total videojuegos: " + total + "\n" +
                "Total horas: " + totalHoras + "\n" +
                "Media horas: " + media + "\n" +
                "Más jugado: " + max.getTitulo() + " (" + max.getHorasJugadas() + "h)";

        Files.writeString(Path.of(rutaResumen), resumen);

        Files.writeString(
                Path.of(rutaLog),
                "Ejecución correcta\n",
                StandardOpenOption.CREATE,
                StandardOpenOption.APPEND);
    }
}