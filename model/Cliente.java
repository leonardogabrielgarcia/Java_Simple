
package java_simple.model;

public class Cliente {
    private String nombre, apellido;

    public Cliente(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }    
    
    public Cliente(){
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
 public void ingresar(Cuenta c, Double saldo){
     
     System.out.println("Usted ha ingresado la suma de $" + saldo + " en su cuenta ");
     c.ingresar(saldo);
}
    
 public void consultar(Cuenta c){
 
     System.out.println("Su saldo es de $" + c.getSaldo());
     
 }

public void retirar(Cuenta c, Double saldo){
   
    System.out.println("Usted ha retirado la suma de $" + saldo + " de su cuenta");
   c.retirar(saldo);
}

public void transferirDineroCuenta(Cuenta co, Cuenta cd, Double saldo){
    System.out.println("Usted ha transferido un total de $ " + saldo);
    System.out.println("De lla cta n° " + co.getNumero() + " A la cta n° " + cd.getNumero());
    co.transferir(co, cd, saldo);
}


    @Override
    public String toString() {
        return "Cliente: " + nombre + " " + apellido;
    }
 


 
}
