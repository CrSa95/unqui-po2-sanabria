package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class Multioperador {
	private List<Integer> listaDeNumeros = new ArrayList<Integer>();

	public void addNumber(int numero) {
		listaDeNumeros.add(numero);
	}

	public int sumarTodosLosNumerosDeLista() {
		int resultado = 0;	
		for(int n: listaDeNumeros){
			resultado += n; 
			}
		return resultado;
	}
	
	public int restarTodosLosNumerosDeLista() {
		int resultado = 0;	
		for(int n: listaDeNumeros){
			resultado -= n; 
			}
		return resultado;
	}
	
	public int multiplicarTodosLosNumerosDeLista() {
		int resultado = 1;	
		for(int n: listaDeNumeros){
			resultado *= n; 
			}
		return resultado;
	}
}
