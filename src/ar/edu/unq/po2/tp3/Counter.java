package ar.edu.unq.po2.tp3;
import java.util.ArrayList;
import java.util.List;

public class Counter {
	private int num; 
	private Integer num2;
	private List<Integer> listaDeNumeros = new ArrayList<Integer>();

	public void addNumber(int numero) {
		listaDeNumeros.add(numero);
	}
	
	public int contarPares() {
		int cont = 0;	
		for(int n: listaDeNumeros){
			if((n % 2) == 0){
				cont+=1;
			}
			}
		return cont;
	}
	
	public int contarImpares() {
		int cont = 0;	
		for(int n: listaDeNumeros){
			if((n % 2) != 0){
				cont+=1;
			}
			}
		return cont;
	}
	
	public int contarLosMultiplosDeEnLaLista(int numero) {
		int cont = 0;	
		for(int n: listaDeNumeros){
			if((n % numero) == 0){
				cont+=1;
			}
			}
		return cont;
	}
	public int numeroConMasDigitosEnLaLista() {
		int maxCont = 0;
        int numeroConMasPares = 0;
        
        for (int n : listaDeNumeros) {
            int cont = contarDigitosParesDeNumero(n);
            if (cont > maxCont) {
            	maxCont = cont;
                numeroConMasPares = n;
            }
        }
        
        return numeroConMasPares;
	}
	
	public static int contarDigitosParesDeNumero(int number) {
        int cont = 0;
        int num = number; 

        while (num > 0) {
            int digito = num % 10; // Saca el ultimo digito y lo guarda en digito
            if (digito % 2 == 0) { // Contar si el digito es par
            	cont+=1;
            }
            num /= 10; // Sacar el ultimo digito del numero 
        }

        return cont;
    }
	
	public static int multiploDeDosNumeros(int x, int y) { 
		int num = 1000;
		int multiplo = -1;
		while (num != 0) {
			if(((num % x) == 0) && ((num % y) == 0)){
				multiplo = num;
				num = 1;
			}
			num -= 1;
		}
		return multiplo;
    }
	
	public void clasePruebaString() { 
		
		System.out.println(this.num);
		System.out.println(this.num2);
		String a = "abc";
		String s = a;
		//String t; MAL! tengo que inicializarla al menos
		System.out.println(s.length());
		//t.length(); MAL! la variable no fue inicializada 
		//1 + a; MAL! operador no compatible
		System.out.println("Libertad".indexOf("r"));
		System.out.println(a.toUpperCase());
		System.out.println("Universidad".lastIndexOf('i'));
		System.out.println("Quilmes".substring(2,4));
		System.out.println((a.length() + a).startsWith("a"));
		//s == a; MAL! operador no compatible
		System.out.println(a.substring(1,3).equals("bc"));
    }
}
