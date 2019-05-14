package java_simple.model;

public class Cuenta {

private Double numero;
private Double saldo;

    public Cuenta(Double numero, Double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public Double getNumero() {
        return numero;
    }

    public void setNumero(Double numero) {
        this.numero = numero;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    
    public void ingresar(Double cantidad){
        this.saldo= saldo + cantidad;
    }
    
    public void retirar(Double cantidad){
        if (this.saldo - cantidad< 0) {
            System.out.println("Fondos insuficientes. Se CANCELA la operación");
        }else{
            this.saldo= saldo - cantidad;
        }
    }
       
    public void transferir(Cuenta co, Cuenta cd ,Double cant){
        co.saldo= co.saldo-cant;
        cd.saldo=cd.saldo+cant;
    }
    
    
    @Override
    public String toString() {
        return "Cuenta " + "numero: " + numero;
    }

    
    
    
}
