package proyectoPersonal.Datos;

/**
 * Fecha: 23/09/2017 Autor: Antonio Aburto Cortez
 */
public class Departamento {

    private String nombre;
    private String sexo;
    private int edad;
    private Departamento[] departamento;
   private int totalElemnetos;
    public Departamento() {
    }

    public Departamento(String nombre, String sexo, int edad) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Departamento{" + "nombre=" + nombre + ", sexo=" + sexo + ", edad=" + edad + '}';
    }
  public Departamento(int limite){
     departamento = new Departamento[limite];
      totalElemnetos++;
  } 
    public void agregarr(Departamento profesor) {

        if (totalElemnetos < departamento.length) {
            departamento[totalElemnetos] = profesor;
            totalElemnetos++;

        }
    }

    public int Promedio() {
        int suma = 0;
        for (int i = 0; i < totalElemnetos; i++) {
            suma += departamento[i].getEdad();
        }
        int promedio = suma / totalElemnetos;
        return promedio;
    }

    public Departamento profesorMasJoven() {
        int a = departamento[0].getEdad();
        int p = 0;
        for (int i = 0; i < totalElemnetos; i++) {
            if (departamento[i].getEdad() < a) {
                p = i;
            }

        }
        return departamento[p];
    }

    public Departamento profesorMasMayor() {

        int a = departamento[0].getEdad();
        int p = 0;
        for (int i = 0; i < totalElemnetos; i++) {
            if (departamento[i].getEdad() > a) {

                p = i;
            }
        }
        return departamento[p];
    }

    public int profesoresMayoresPromedio() {
        int j = 0;
        for (int i = 0; i < totalElemnetos; i++) {
            if (departamento[i].getEdad() >= Promedio()) {
                j++;
            }
        }
        return j;
    }

    public int profesoresMenoresPromedio() {
        int j = 0;
        for (int i = 0; i < totalElemnetos; i++) {
            if (departamento[i].getEdad() <= Promedio()) {
                j++;
            }
        }
        return j;
    }

    public Departamento getProfesor(int limite) {
        return departamento[limite];
    }

    public int getTotalElementos() {
        return totalElemnetos;
    }
}
