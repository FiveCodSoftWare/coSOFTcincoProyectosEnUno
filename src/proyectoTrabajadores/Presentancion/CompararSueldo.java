package proyectoTrabajadores.Presentancion;

import java.util.Comparator;
import proyectoTrabajadores.Datos.Trabajador;

/**
 * Fecha: 23/09/2017 Autor: Antonio Aburto Cortez
 */
class CompararSueldo implements Comparator<Trabajador> {

    public int compare(Trabajador one, Trabajador two) {
        if (one.calcularsueldo() > two.calcularsueldo()) {
            return 1;
        } else if (one.calcularsueldo() < two.calcularsueldo()) {
            return -1;
        } else {
            return 0;
        }
    }
}
