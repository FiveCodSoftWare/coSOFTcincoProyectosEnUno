package proyectoPersonal.Datos;

import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;
import javax.swing.JOptionPane;
import proyectoPersonal.Presentacion.FrmDepartamento;

/**
 * Fecha: 23/09/2017 Autor: Antonio Aburto Cortez
 */
public class Lista_Departamento {
    
    private Vector<Departamento> L;
    private Departamento[] departamento;
    private int totalElemnetos;
    
    public Lista_Departamento() {
        L = new Vector<>();
        
    }
    
    public void agregar(Departamento e) {
        L.add(e);
    }
    
    public int buscar(Departamento e) {
        return L.indexOf(e);
    }
    
    public void ordenar(Comparator<Departamento> cs) {
        Collections.sort(L, cs);
        
    }
    
    public int buscar(Departamento key, Comparator<Departamento> cs) {
        Collections.sort(L, cs);
        return Collections.binarySearch(L, key, cs);
        
    }
    
    public void eliminar(int i) {
        L.remove(i);
    }
    
    public Departamento getElemento(int i) {
        return L.get(i);
    }
    
    public int getN() {
        return L.size();
    }
    
    public void inserta(int i, Departamento e) {
        L.add(i, e);
    }
    
    public void reempleza(int i, Departamento e) {
        L.set(i, e);
    }
    
    public Vector<Departamento> getL() {
        return L;
    }
    
    public void mostrar() {
        for (Departamento e : L) {
            System.out.print(e);
        }
    }
    
    public Object[][] devolverDatos() {
        Object datos[][] = new Object[L.size()][3];
        for (int i = 0; i < L.size(); i++) {
            Departamento x = L.get(i);
            
            datos[i][0] = x.getNombre();
            datos[i][1] = x.getSexo();
            datos[i][2] = x.getEdad();
            
        }
        return datos;
        
    }
    
    public void agregarr(Departamento profesor) {
        
        if (totalElemnetos < departamento.length) {
            departamento[totalElemnetos] = profesor;
            totalElemnetos++;
            
        }
    }
    
    public int Promedio() {
         int con = 0;
        int suma = 0;
        for (int i = 0; i < L.size(); i++) {
            Departamento d = L.get(i);
            suma += d.getEdad();
           con++;
       }
      return  suma / con;
       
    }
    
    public void profesorMasJoven() {
        Departamento n = L.get(0);
        int menor = n.getEdad();
        String nombre = "";
        for (int i = 0; i < L.size(); i++) {
            Departamento d = L.get(i);
            if (d.getEdad() < menor) {
                menor = d.getEdad();
                nombre = d.getNombre();
            }
            
        }
               FrmDepartamento.txtProfesorMasJoven.setText(nombre);
    }
    
    public void profesorMasMayor() {
        Departamento n = L.get(0);
        int mayor = n.getEdad();
        String nombre = "";
        for (int i = 0; i < L.size(); i++) {
            Departamento d = L.get(i);
            if (d.getEdad() > mayor) {
                mayor = d.getEdad();
                nombre = d.getNombre();
            }
            
        }
        FrmDepartamento.txtProfesorMayoredad.setText(nombre);
    }
    
    public void profesoresMayoresPromedio() {
        int mayor = 0, menor = 0;
        for (int i = 0; i < L.size(); i++) {
            Departamento d = L.get(i);
            if (d.getEdad() <= Promedio()) {
                menor++;
            } else {
                mayor++;
            }
        }
        FrmDepartamento.txtMayorPromedio.setText(String.valueOf(mayor));
        FrmDepartamento.txtMenorPromdio.setText(String.valueOf(menor));
        
    }
}
