package proyectoPersonal.Presentacion;

import java.util.Comparator;
import proyectoPersonal.Datos.Departamento;

/**
 * Fecha: 24/09/2017 Autor: Antonio Aburto Cortez
 */
class CopararProfesorMenor implements Comparator<Departamento> {

    public int compare(Departamento one, Departamento two) {
        if (one.getEdad() < two.getEdad()) {
            return 1;
        } else if (one.getEdad() > two.getEdad()) {
            return -1;
        } else {
            return 0;
        }
    }
}
