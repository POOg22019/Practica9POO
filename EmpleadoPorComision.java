public class EmpleadoPorComision extends Empleado{
    
    private String nombre;
    private String apellido;
    private String seguro;
    private double ventasTotales;
    private double tasaComision;
    
    public EmpleadoPorComision( String nombre, String apellido, String seguro, double ventasTotales, double tasaComision ){
        this.nombre = nombre;
        this.apellido = apellido;
        this.apellido = seguro;
        this.ventasTotales = ventasTotales;
        this.tasaComision = tasaComision;
    }
    
    public void setVentasTotales( double vT ){
        ventasTotales = vT;
    }
    
    public void setTasaComision( double tC){
        tasaComision = tC;
    }
   
    public String getName(){
        return nombre;
    }
    
    public String obtenerApellido(){
        return apellido;
    }
    
    public String obtenerSeguro(){
        return seguro;
    }
   
    public double getVentasTotales(){
        return ventasTotales;
    }
    
    public double getTasaComision(){
        return tasaComision;
    }
    
    public double ingresos(){
        return getTasaComision() * getVentasTotales();
    }
    
     public String toString(){
        return " Nombre: " +getName()+ " Apellido: " +obtenerApellido()+ " Numero de seguridad social: " +obtenerSeguro()+ " Ventas Totales: "+getVentasTotales()+ " Tasa de comision: " +getTasaComision()+ " Ingresos: " +ingresos();
    }
    
}
