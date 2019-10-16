
package nomina;

public abstract class Empleado extends Object{
    public abstract String getName();
    public abstract String obtenerApellido();
    public abstract String obtenerSeguro();
    public abstract String toString();
    public double ingresos(){
        return 0.0;
    }
}
