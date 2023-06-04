package proyectoTrabajadores.Datos;

import java.util.Objects;

/**
 * Fecha: 23/09/2017 Autor: Antonio Aburto Cortez
 */
public class Trabajador {

    private String codigo;
    private String nombre;
    private Double valor_hora;
    private int horas_trabajadas;

    public Trabajador() {
    }

    public Trabajador(String codigo, String nombre, Double valor_hora, int horas_trabajadas) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.valor_hora = valor_hora;
        this.horas_trabajadas = horas_trabajadas;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getValor_hora() {
        return valor_hora;
    }

    public void setValor_hora(Double valor_hora) {
        this.valor_hora = valor_hora;
    }

    public int getHoras_trabajadas() {
        return horas_trabajadas;
    }

    public void setHoras_trabajadas(int horas_trabajadas) {
        this.horas_trabajadas = horas_trabajadas;
    }

    @Override
    public String toString() {
        return "Trabajador{" + "codigo=" + codigo + ", nombre=" + nombre + ", valor_hora=" + valor_hora + ", horas_trabajadas=" + horas_trabajadas + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.codigo);
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
        final Trabajador other = (Trabajador) obj;
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        return true;
    }

   

   
    public double calcularsueldo() {
        return horas_trabajadas * valor_hora;
    }

    public double getSueldo() {
        return calcularsueldo();  
    }
}
