package Presentacion;

import Datos.Productos;
import java.util.Comparator;

/**
 * Fecha: 23/09/2017 Autor: Antonio Aburto Cortez
 */
class ComparaProductos implements Comparator<Productos>{

    public int compare(Productos one, Productos two) {
        return one.getCategoria().compareToIgnoreCase(two.getCategoria());
    }
}
