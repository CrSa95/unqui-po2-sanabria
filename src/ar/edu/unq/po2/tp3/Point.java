package ar.edu.unq.po2.tp3;

public class Point {
	
	private int x; 
	private int y;
	
	public Point() {
		this.x = 0;
		this.y = 0;
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void moverPuntoALaPosicion(int otroX, int otroY){
		this.setX(otroX);
		this.setY(otroY);
	}
	
	public void sumarAlPuntoElPunto(Point point){
		this.setX(this.getX() + point.getX());
		this.setY(this.getY() + point.getY());
	}
}
