package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {
	private String nombre;
	private String direccion;
	private List<Producto> catalogoProductos = new ArrayList<Producto>();
	private List<ProductoPrimeraNecesidad> catalogoPrimeraNecesidad = new ArrayList<ProductoPrimeraNecesidad>();
	
	public Supermercado(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public List<Producto> getCatalogoProductos() {
		return catalogoProductos;
	}
	public void setCatalogoProductos(List<Producto> catalogoProductos) {
		this.catalogoProductos = catalogoProductos;
	}
	
	public void agregarProducto(Producto producto) {
		this.catalogoProductos.add(producto);
	}
	
	public List<ProductoPrimeraNecesidad> getCatalogoPrimeraNecesidad() {
		return catalogoPrimeraNecesidad;
	}
	public void setCatalogoPrimeraNecesidad(List<ProductoPrimeraNecesidad> catalogoPrimeraNecesidad) {
		this.catalogoPrimeraNecesidad = catalogoPrimeraNecesidad;
	}
	
	public int getCantidadDeProductos() {
		return catalogoProductos.size()+catalogoPrimeraNecesidad.size();
	}
	
	public double getPrecioTotal() {
		double sumaTotal = 0;	
		for(Producto p: catalogoProductos){
			sumaTotal += p.getPrecio();
			}
		return sumaTotal;
	}
}
