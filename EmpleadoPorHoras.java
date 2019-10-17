
package Nomina;

public class EmpleadoPorHoras extends Empleado{
    private double sueldo;
    private int horas;
    private String nombre;
    private String apellido;
    private String seguro;
    private double ingresos;
    
    public EmpleadoPorHoras(){}
    
    public EmpleadoPorHoras(String n,String a, String seg,double suel, int hor){
        nombre=n;
        apellido=a;
        seguro=seg;
        sueldo=suel;
        horas=hor;
    }
    
    public double getsueldo(){
        return sueldo;
    }

    public int gethoras(){
        return horas;
    }
       //SOBREESCRITURA DE METODOS
    @Override
    public double ingresos(){
        if (horas<40){
            return sueldo*horas;
        }
        else
            return (float) ((sueldo*40)+(horas-40)*sueldo*1.5);
    }
    
 
    @Override
    public String getName(){
        return nombre;
    }
    
    @Override
    public String obtenerApellido(){
        return apellido;
    }
    
    @Override
    public String obtenerSeguro(){
        return seguro;
    }
    
    @Override
    public String toString(){
        return "Nombre: "+getName()+ " Apellido: "+obtenerApellido()+" Seguro: "+obtenerSeguro()+" Ingresos: "+ingresos();
    }
}
