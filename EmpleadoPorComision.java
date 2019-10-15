public class EmpleadoPorComision extends Empleado{
    private double ventasTotales;
    private double tasaComision;
    
    public EmpleadoPorComision( String nombre, String apellido, String seguro, double ventasTotales, double tasaComision ){
        super( nombre, apellido, seguro );
        this.ventasTotales = ventasTotales;
        this.tasaComision = tasaComision;
    }
   
    public double getVentasTotales(){
        return ventasTotales;
    }
    
    public double getTasaComision(){
        return tasaComision;
    }
    
    public double ingresos(){
        return tasaComision * ventasTotales;
    }
    
     public void toString(){
        System.out.print(" Empleado por comision\n" + " Nombre: " + super.getNombre() + "\nApellido:" + super.getApellido() + "\nNumero de seguridad social: " + super.getSeguro() + "\nVentas Totales: " + this.getVentasTotales() + "\nTasa de comision: " + this.getTasaComision() + "\nIngresos: " + this.ingresos());
    }
    
}
