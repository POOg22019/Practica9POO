public class EmpleadoBaseMasComision extends EmpleadoPorComision {
    
    private double salarioBase;
    
    public EmpleadoBaseMasComision( String nombre, String apellido, String seguro, double ventasTotales, double tasaComision, double salarioBase ){
        super( nombre, apellido, seguro, ventasTotales, tasaComision );
        this.salarioBase = salarioBase;
    }
    
    public double getSalarioBase(){
        return salarioBase;
    }
    
    public double Ingresos(){
        return getSalarioBase() + super.ingresos(); 
    }
    
    public void toString(){
        System.out.print(" Empleado Base mas comision\n" + " Nombre: " + super.getNombre() + "\nApellido:" + super.getApellido() + "\nNumero de seguridad social: " + super.getSeguro() + "\nVentas Totales: " + super.getVentasTotales() + "\nTasa de comision: " + super.getTasaComision() + "\nSalario base: " + this.getSalarioBase() + "\nIngresos: " + this.Ingresos());
    }
    
}