package proyectoTrabajadores.Datos;

import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

/**
 * Fecha: 23/09/2017 Autor: Antonio Aburto Cortez
 */
public class Lista_Trabajadores {

    private Vector<Trabajador> L;

    public Lista_Trabajadores() {
        L = new Vector<>();

    }

    public void agregar(Trabajador e) {
        L.add(e);
    }

    public int buscar(Trabajador e) {
        return L.indexOf(e);
    }

    public void ordenar(Comparator<Trabajador> cs) {
        Collections.sort(L, cs);

    }

    public int buscar(Trabajador key, Comparator<Trabajador> cs) {
        Collections.sort(L, cs);
        return Collections.binarySearch(L, key, cs);

    }

    public void eliminar(int i) {
        L.remove(i);
    }

    public Trabajador getElemento(int i) {
        return L.get(i);
    }

    public int getN() {
        return L.size();
    }

    public void inserta(int i, Trabajador e) {
        L.add(i, e);
    }

    public void reempleza(int i, Trabajador e) {
        L.set(i, e);
    }

    public Vector<Trabajador> getL() {
        return L;
    }

    public void mostrar() {
        for (Trabajador e : L) {
            System.out.print(e);
        }
    }

    public Object[][] devolverDatos() {
        Object datos[][] = new Object[L.size()][5];
        for (int i = 0; i < L.size(); i++) {
            Trabajador x = L.get(i);
            datos[i][0] = x.getCodigo();
            datos[i][1] = x.getNombre();
            datos[i][2] = x.getValor_hora();
            datos[i][3] = x.getHoras_trabajadas();
            datos[i][4] = x.getSueldo();

        }
        return datos;

    }

}
