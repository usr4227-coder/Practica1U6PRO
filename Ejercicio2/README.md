# Ejercicio 2 – Gestión de asistentes (HashSet y HashMap)

El objetivo es gestionar asistentes evitando duplicados y agrupándolos por grupo.

## Contenido del proyecto

- `App.java`: clase principal con toda la lógica.
- `Asistente.java`: clase que representa un asistente con dni, nombre y grupo.

## Qué hace el programa

1. Crea un **HashSet** de asistentes.
2. Intenta añadir los asistentes del enunciado.
3. Muestra el contenido del set.
4. Muestra cuántos se intentaron añadir y cuántos se añadieron realmente.
5. Explica por qué no se añaden duplicados (equals + hashCode).
6. Crea un **HashMap** para contar asistentes por grupo.
7. Recorre el set y actualiza el mapa.
8. Muestra el mapa completo.
9. Muestra cuántos hay en DAM1.
10. Comprueba si existe ASIR1.
11. Elimina ASIR1 si existe.
12. Muestra todas las claves del mapa.

## Tecnologías usadas

- `HashSet`
- `HashMap`
- `equals()` y `hashCode()` basados en el DNI
