# Ejercicio 1 – Gestión de reparaciones (Queue y Stack)
  
El objetivo es simular la gestión de reparaciones usando una **cola** para las solicitudes y una **pila** para el historial.

## Contenido del proyecto
- `App.java`: clase principal donde se realizan todas las operaciones.
- `Reparacion.java`: clase que representa una reparación con código, cliente, descripción y si es urgente.

## Qué hace el programa
1. Crea una **cola** de reparaciones.
2. Añade las reparaciones dadas en el enunciado.
3. Muestra todas las reparaciones pendientes.
4. Muestra la primera reparación sin eliminarla (`peek()`).
5. Atiende dos reparaciones (`poll()`).
6. Guarda esas reparaciones en una **pila** (`push()`).
7. Muestra la última reparación atendida (`peek()`).
8. Extrae una reparación del historial (`pop()`).
9. Muestra cuántas reparaciones quedan en la cola.
10. Indica si la cola está vacía.

## Tecnologías usadas
- `Queue` (LinkedList)
- `Stack`
- Recorridos con `for-each`

## Notas
El ejercicio sigue exactamente lo que pide el PDF, sin añadir nada extra.
