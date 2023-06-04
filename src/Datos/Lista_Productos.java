package Datos;

import Datos.Productos;
import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

/**
 * Fecha: 20/09/2017 Autor: Antonio Aburto Cortez
 */
public class Lista_Productos {

    private Vector<Productos> L;

    public Lista_Productos() {
        L = new Vector<Productos>();
    }

    public void agregar(Productos e) {
        L.add(e);
    }

    public int buscar(Productos e) {
        return L.indexOf(e);
    }

    public void ordenar(Comparator<Productos> cs) {
        Collections.sort(L, cs);
    }

    public int buscar(Productos key, Comparator<Productos> cs) {
        Collections.sort(L, cs);
        return Collections.binarySearch(L, key, cs);
    }

    public void Eliminar(int i) {
        L.remove(i);
    }

    public Productos getElemento(int i) {
        return L.get(i);
    }

    public int getN() {
        return L.size();
    }

    public void inserta(int i, Productos e) {
        L.add(i, e);

    }

    public void reemplaza(int i, Productos e) {
        L.set(i, e);
    }

    public Vector<Productos> getL() {
        return L;
    }

    public void mostrar() {
        for (Productos e : L) {
            System.out.println(e);
        }
    }

    public Object[][] devuelveDatos() {
        Object datos[][] = new Object[L.size()][5];
        for (int i = 0; i < L.size(); i++) {
            Productos x = L.get(i);
            datos[i][0] = x.getCodigo();
            datos[i][1] = x.getDescripción();
            datos[i][2] = x.getPrecio();
            datos[i][3] = x.getStock();
            datos[i][4] = x.getCategoria();

        }
        return datos;
    }

    public Lista_Productos buscarPorCategoria(String categoria) {
        Lista_Productos P = new Lista_Productos();
        for (int i = 0; i < L.size(); i++) {
            Productos x = L.get(i);
            if (x.getCategoria().equalsIgnoreCase(categoria)) {
                P.agregar(x);
            }

        }
        return P;
    }

    public Lista_Productos buscarPorCodigo(String codigo) {
        Lista_Productos P = new Lista_Productos();
        for (int i = 0; i < L.size(); i++) {
            Productos x = L.get(i);
            if (x.getCodigo().startsWith(codigo)) {
                P.agregar(x);
            }

        }
        return P;
    }

}
