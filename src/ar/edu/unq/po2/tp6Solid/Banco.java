package ar.edu.unq.po2.tp6Solid;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private List<Cliente> clientesList = new ArrayList<Cliente>();
	private List<Credito> solicitudesDeCredito = new ArrayList<Credito>();
	
	public Banco() {
	}
	
	public void setCliente(Cliente cliente){
		clientesList.add(cliente);
	}
	
	public List<Cliente> getClientes(){
		return clientesList;
	}
	
	public List<Credito> getCreditos(){
		return solicitudesDeCredito;
	}
	
	public boolean registrarSolicitudCredito(Credito credito, Cliente cliente) {
		this.solicitudesDeCredito.add(credito);
		return credito.evaluarCredito(cliente);
	}
	
	public double montoTotalCreditos() {
		double montoTotal = 0;
		for(Credito i: solicitudesDeCredito){
			montoTotal += i.getMontoSolicitado();
			}
		return montoTotal;
	}
}
