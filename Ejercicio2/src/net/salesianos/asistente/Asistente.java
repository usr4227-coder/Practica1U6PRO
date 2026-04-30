package net.salesianos.asistente;

public class Asistente {
    private String dni;
    private String nombre;
    private String grupo;

    public Asistente(String dni, String nombre, String grupo) {
        this.dni = dni;
        this.nombre = nombre;
        this.grupo = grupo;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    @Override
    public String toString() {
        return dni + " - " + nombre + " - " + grupo;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Asistente))
            return false;
        Asistente other = (Asistente) obj;
        return this.dni.equals(other.dni);
    }

    @Override
    public int hashCode() {
        return dni.hashCode();
    }
}
