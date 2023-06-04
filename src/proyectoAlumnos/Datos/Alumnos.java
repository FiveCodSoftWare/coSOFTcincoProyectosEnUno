package proyectoAlumnos.Datos;

import java.util.Objects;

/**
 * Fecha: 23/09/2017 Autor: Antonio Aburto Cortez
 */
public class Alumnos {

    private String codigo;
    private String apellidos;
    private String nombre;
    private String carrera;
    private String ciclo;
    private double promedio;
    private String estado;

    public Alumnos() {
    }

    public Alumnos(String codigo, String apellidos, String nombre, String carrera, String ciclo, double promedio,String estado) {
        this.codigo = codigo;
        this.apellidos = apellidos;
        this.nombre = nombre;
        this.carrera = carrera;
        this.ciclo = ciclo;
        this.promedio = promedio;
        this.estado=estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getCiclo() {
        return ciclo;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return "Alumnos{" + "codigo=" + codigo + ", apellidos=" + apellidos + ", nombre=" + nombre + ", carrera=" + carrera + ", ciclo=" + ciclo + ", promedio=" + promedio + ", estado=" + estado + '}';
    }

  

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 73 * hash + Objects.hashCode(this.codigo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumnos other = (Alumnos) obj;
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        return true;
    }

}
