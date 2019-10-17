public class EmpleadoBaseMasComision extends EmpleadoPorComision {
    
    private double salarioBase;
    
    public EmpleadoBaseMasComision( String nombre, String apellido, String seguro, double ventasTotales, double tasaComision, double salarioBase ){
        super( nombre, apellido, seguro, ventasTotales, tasaComision );
        this.salarioBase = salarioBase;
    }
    
    public void setSalarioBase( double sB ){
        salarioBase = sB;
    }
    
    public double getSalarioBase(){
        return salarioBase;
    }
    
    public double ingresos(){
        return getSalarioBase() + super.ingresos(); 
    }
    
    public String toString(){
        return " Nombre: " +super.getName()+ " Apellido: " +super.obtenerApellido()+ " Numero de seguridad social: " +super.obtenerSeguro()+ " Ventas Totales: " +super.getVentasTotales()+ " Tasa de comision: " +super.getTasaComision()+ " Salario base: " +this.getSalarioBase()+ " Ingresos: " +this.ingresos();
    }
    
}