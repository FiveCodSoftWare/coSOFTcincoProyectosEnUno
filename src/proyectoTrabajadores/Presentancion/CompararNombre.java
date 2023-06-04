package proyectoTrabajadores.Presentancion;

import java.util.Comparator;
import proyectoTrabajadores.Datos.Trabajador;

/**
 * Fecha: 23/09/2017 Autor: Antonio Aburto Cortez
 */
class CompararNombre implements Comparator<Trabajador> 
{

    @Override
    public int compare(Trabajador one, Trabajador two) {
        
        return one.getNombre().compareTo(two.getNombre());
    }
}
