package clases;

import java.util.Objects;

public class Usuario {
    private int telefono;
    private float estatura;
    private String nombre;
    private int numero;
    private int platos;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Usuario)) return false;
        Usuario Usuario = (Usuario) o;
        return getTelefono() == Usuario.getTelefono() && Float.compare(Usuario.getEstatura(), getEstatura()) == 0 && getNumero() == Usuario.getNumero() && Objects.equals(getNombre(), Usuario.getNombre()) && Objects.equals(getPlatos(), Usuario.getPlatos());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTelefono(), getEstatura(), getNombre(), getNumero(), getPlatos());
    }

    public Usuario(int telefono, float estatura, String nombre, int numero, int sueldo) {
        this.telefono = telefono;
        this.estatura = estatura;
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

    public float getEstatura() {
        return estatura;
    }

    public void setEstatura(float precio) {
        this.estatura = estatura;
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
        return "Usuario -> " +
                "telefono=" + telefono +
                ", estatura=" + estatura +
                ", nombre='" + nombre + '\'' +
                ", numero=" + numero +
                ", platos=" + platos;
    }

    public void setPlatos(int platos) {
        this.platos = platos;
    }
}
