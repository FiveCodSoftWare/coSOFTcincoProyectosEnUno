package proyectoCuenta.Datos;

import java.util.Objects;

/**
 * Fecha: 24/09/2017 Autor: Antonio Aburto Cortez
 */
public class Cuenta {

    private String codigo;
    private String apellidos;
    private String nombres;
    private double saldo;

    public Cuenta() {
    }

    
    
    
    public Cuenta(String codigo, String apellidos, String nombres, double saldo) {
        this.codigo = codigo;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.saldo = saldo;
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

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double cantidad) {
        saldo = saldo + cantidad;

    }

    public boolean retirar(double cantidad) {
        if (saldo >= cantidad) {
            saldo = saldo - cantidad;
            return true;
        }
        return false;

    }

    
   
           
    @Override
    public String toString() {
        return "Cuenta{" + "codigo=" + codigo + ", apellidos=" + apellidos + ", nombres=" + nombres + ", saldo=" + saldo + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.codigo);
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
        final Cuenta other = (Cuenta) obj;
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        return true;
    }

}

