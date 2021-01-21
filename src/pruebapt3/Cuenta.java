package pruebapt3;



public class Cuenta {
	private double balance;
	private String nombre;
	private String apellidos;

	public Cuenta(double balance, String nombre,String apellidos) {
		this.balance = balance;
		this.nombre = nombre;
		this.apellidos=apellidos;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void dineroRetirado(double dineroRetirado) {
		System.out.println("Dinero retirado");
		this.balance = balance - dineroRetirado;
	}

	public void deposito(double montanteDeposito) {
		this.balance = balance + montanteDeposito;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
}