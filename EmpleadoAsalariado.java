
package nomina;

public class EmpleadoAsalariado extends Empleado {
    private double SalarioSemanal;
    public String n;
    public String a;
    public String s;
    
    public EmpleadoAsalariado(){}
    
    public EmpleadoAsalariado(String nombre, String apellido, String SS, double salario){
        n=nombre;
        a=apellido;
        s=SS;
        SalarioSemanal=salario;
    }
    
    @Override
    public String getName() {
        return n;
    }

    @Override
    public String obtenerApellido() {
        return a;
    }

    @Override
    public String obtenerSeguro() {
        return s;
    }
    @Override
    public double ingresos(){
        return SalarioSemanal;
    }

    @Override
    public String toString() {
        return "Nombre: " + n + "Apellido: "+a+"Seguro Social: " +s+ "Salario: "+SalarioSemanal;
    }
    
}
