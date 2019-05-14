package java_simple.main;
import java_simple.model.Cliente;
import java_simple.model.Cuenta;
public class Main {

    
    public static void main(String[] args) {
     
        Cuenta cuentOrigen= new Cuenta(001101223983.00,0.00);
        Cuenta cuentDestino= new Cuenta(01232435345.00,0.00);
        Cliente c1 = new Cliente("Leonardo", "Garcia");
                
        System.out.println(cuentOrigen);
        System.out.println(c1);
        System.out.println("Al momento usted tiene $" + cuentOrigen.getSaldo());
        System.out.println("");
        c1.ingresar(cuentOrigen, 15000.00);
        System.out.println("");
        c1.consultar(cuentOrigen);
        System.out.println("");
        c1.retirar(cuentOrigen, 5000.00);
        System.out.println("");
        c1.consultar(cuentOrigen);
        c1.retirar(cuentOrigen,110000.00);
        System.out.println("");
        c1.consultar(cuentOrigen);
        System.out.println("");

        c1.transferirDineroCuenta(cuentOrigen, cuentDestino, 6000.00);
        System.out.println(""); 
        System.out.println("Cuenta origen: " + cuentOrigen.getNumero());
        c1.consultar(cuentOrigen);
        System.out.println("");
        System.out.println("Cuenta destino: "+ cuentDestino.getNumero());
        c1.consultar(cuentDestino);
    }
    
}
