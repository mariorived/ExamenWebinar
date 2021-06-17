package clases;

import java.util.Objects;

public class Restaurante {
    private int telefono;
    private float precio;
    private String nombre;
    private int numero;
    private int platos;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Restaurante)) return false;
        Restaurante restaurante = (Restaurante) o;
        return getTelefono() == restaurante.getTelefono() && Float.compare(restaurante.getPrecio(), getPrecio()) == 0 && getNumero() == restaurante.getNumero() && Objects.equals(getNombre(), restaurante.getNombre()) && Objects.equals(getPlatos(), restaurante.getPlatos());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTelefono(), getPrecio(), getNombre(), getNumero(), getPlatos());
    }

    public Restaurante(int telefono, float precio, String nombre, int numero, int sueldo) {
        this.telefono = telefono;
        this.precio = precio;
        this.nombre = nombre;
        this.numero = numero;
        this.platos = platos;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getPlatos() {
        return platos;
    }

    @Override
    public String toString() {
        return "Restaurante -> " +
                "telefono=" + telefono +
                ", precio=" + precio +
                ", nombre='" + nombre + '\'' +
                ", numero=" + numero +
                ", platos=" + platos;
    }

    public void setPlatos(int platos) {
        this.platos = platos;
    }
}