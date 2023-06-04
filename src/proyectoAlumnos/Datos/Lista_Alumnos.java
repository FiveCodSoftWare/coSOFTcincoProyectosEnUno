package proyectoAlumnos.Datos;

import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

/**
 * Fecha: 23/09/2017 Autor: Antonio Aburto Cortez
 */
public class Lista_Alumnos {

    private Vector<Alumnos> L;

    public Lista_Alumnos() {
        L = new Vector<Alumnos>();

    }

    public void agregar(Alumnos e) {
        L.add(e);
    }

    public int buscar(Alumnos e) {
        return L.indexOf(e);
    }

    public void ordenar(Comparator<Alumnos> cs) {
        Collections.sort(L, cs);

    }

    public int buscar(Alumnos key, Comparator<Alumnos> cs) {
        Collections.sort(L, cs);
        return Collections.binarySearch(L, key, cs);
    }

    public void Eliminar(int i) {
        L.remove(i);
    }

    public Alumnos getElementos(int i) {
        return L.get(i);
    }

    public int getN() {
        return L.size();
    }

    public void inserta(int i, Alumnos e) {
        L.add(e);
    }

    public void reemplaza(int i, Alumnos e) {
        L.set(i, e);
    }

    public Vector<Alumnos> getL() {
        return L;
    }

    public void mostrar() {
        for (Alumnos e : L) {
            System.out.println(e);
        }
    }

    public Object[][] devuelveDatos() {
        Object datos[][] = new Object[L.size()][7];
        for (int i = 0; i < L.size(); i++) {
            Alumnos a = L.get(i);
            datos[i][0] = a.getCodigo();
            datos[i][1] = a.getApellidos();
            datos[i][2] = a.getNombre();
            datos[i][3] = a.getCarrera();
            datos[i][4] = a.getCiclo();
            datos[i][5] = a.getPromedio();
            datos[i][6]=a.getEstado();

        }
        return datos;

    }

    public Lista_Alumnos buscarCarrea(String carrera) {
        Lista_Alumnos s = new Lista_Alumnos();
        for (int i = 0; i < L.size(); i++) {
            Alumnos d = L.get(i);
            if (d.getCarrera().startsWith(carrera)) {
                s.agregar(d);
            }
        }
        return s;
    }

    public Lista_Alumnos alumnosAprobados(String aprovads) {
        Lista_Alumnos aprovado = new Lista_Alumnos();
        for (int i = 0; i < L.size(); i++) {
            Alumnos d = L.get(i);
            if (d.getEstado().equalsIgnoreCase(aprovads)) {
                aprovado.agregar(d);
            }
        }
        return aprovado;
    }

   public Lista_Alumnos alumnosdesAprobados(String desaprovads) {
        Lista_Alumnos aprovado = new Lista_Alumnos();
        for (int i = 0; i < L.size(); i++) {
            Alumnos d = L.get(i);
            if (d.getEstado().equals(desaprovads)) {
                aprovado.agregar(d);
            }
        }
        return aprovado;
    }
}
