# Ejercicio 3 – Lectura de CSV y generación de informes

El objetivo es leer un fichero CSV con información de videojuegos, procesarlo y generar dos ficheros de salida.

## Contenido del proyecto

- `App.java`: clase principal que lee el CSV y genera los informes.
- `Videojuego.java`: clase que representa un videojuego con título, género y horas jugadas.
- `videojuego.csv`: fichero con los datos del enunciado (ubicado en `src/net/salesianos/data/`).

## Qué hace el programa

1. Lee el fichero `videojuego.csv`.
2. Ignora la primera línea (cabecera).
3. Convierte cada línea en un objeto `Videojuego`.
4. Guarda todos los videojuegos en un `ArrayList`.
5. Calcula:
   - total de videojuegos
   - total de horas jugadas
   - media de horas
   - videojuego con más horas
6. Genera el fichero `resumen_videojuegos.txt` con los resultados.
7. Añade un mensaje al fichero `log_videojuegos.txt` sin borrar lo anterior.

## Tecnologías usadas

- `Files.readAllLines()`
- `Files.writeString()`
- `ArrayList`
- `StandardOpenOption.APPEND`

## Notas

El CSV está dentro de la carpeta `data`, por lo que las rutas se ajustan a esa ubicación.
