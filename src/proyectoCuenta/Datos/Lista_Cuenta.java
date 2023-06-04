package proyectoCuenta.Datos;

import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

/**
 * Fecha: 24/09/2017 Autor: Antonio Aburto Cortez
 */
public class Lista_Cuenta {

    private Vector<Cuenta> L;

    public Lista_Cuenta() {
        L = new Vector<Cuenta>();

    }

    public void agregar(Cuenta e) {
        L.add(e);
    }

    public int buscar(Cuenta e) {
        return L.indexOf(e);
    }

    public void ordenar(Comparator<Cuenta> cs) {
        Collections.sort(L, cs);

    }

    public int buscar(Cuenta key, Comparator<Cuenta> cs) {
        Collections.sort(L, cs);
        return Collections.binarySearch(L, key, cs);
    }

    public void Eliminar(int i) {
        L.remove(i);
    }

    public Cuenta getElementos(int i) {
        return L.get(i);
    }

    public int getN() {
        return L.size();
    }

    public void inserta(int i, Cuenta e) {
        L.set(i, e);
    }

    public void reemplaza(int i, Cuenta e) {
        L.set(i, e);
    }

    public Vector<Cuenta> getL() {
        return L;
    }

    
    public void mostrar() {
        for (Cuenta e : L) {
            System.out.println(e);
        }
    }

    public Object[][] devuelveDatos() {
        Object datos[][] = new Object[L.size()][4];
        for (int i = 0; i < L.size(); i++) {
            Cuenta a = L.get(i);
            datos[i][0] = a.getCodigo();
            datos[i][1] = a.getApellidos();
            datos[i][2] = a.getNombres();
            datos[i][3] = a.getSaldo();
         }
        return datos;

    }
      public Lista_Cuenta buscarCodigo(String codigo) {
       Lista_Cuenta s = new Lista_Cuenta();
        for (int i = 0; i < L.size(); i++) {
            Cuenta d = L.get(i);
            if (d.getCodigo().startsWith(codigo)) {
                s.agregar(d);
            }
        }
        return s;
    }
}
