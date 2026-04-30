package net.salesianos.reparacion;

public class Reparacion {
    private String codigo;
    private String cliente;
    private String descripcion;
    private boolean urgente;

    public Reparacion(String codigo, String cliente, String descripcion, boolean urgente) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.descripcion = descripcion;
        this.urgente = urgente;
    }

    public String getCodigo() { return codigo; }
    public String getCliente() { return cliente; }
    public String getDescripcion() { return descripcion; }
    public boolean isUrgente() { return urgente; }

    public void setCodigo(String codigo) { this.codigo = codigo; }
    public void setCliente(String cliente) { this.cliente = cliente; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public void setUrgente(boolean urgente) { this.urgente = urgente; }

    @Override
    public String toString() {
        return codigo + " - " + cliente + " - " + descripcion + " - urgente: " + urgente;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Reparacion)) return false;
        Reparacion other = (Reparacion) obj;
        return this.codigo.equals(other.codigo);
    }
}
