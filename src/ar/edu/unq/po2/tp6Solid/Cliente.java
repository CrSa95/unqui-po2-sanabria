package ar.edu.unq.po2.tp6Solid;

public class Cliente {
	
	private String nombre;
	private String apellido;
	private String direccion;
	private int edad;
	private double sueldo;
	private Propiedad propiedad;
	
	public Cliente (String nombre,String apellido,String direccion,int edad,double sueldo) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.edad = edad;
		this.sueldo = sueldo;
	}
	
	public double sueldoNetoMensual() {
		return this.sueldo;
	}
	
	public double sueldoNetoAnual() {
		return 12 * this.sueldoNetoMensual();
	}
	
	public boolean solicitarCredito(Banco banco, Credito credito) {
		return banco.solicitarCredito(credito, this);
	}
	
	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public int getEdad() {
		return edad;
	}

	public double getSueldo() {
		return sueldo;
	}

	public Propiedad getPropiedad() {
		return propiedad;
	}
	
	public void setPropiedad(Propiedad propiedad) {
		this.propiedad = propiedad;
	}
}
