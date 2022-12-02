/**
* Clase para representar círculos sobre el plano.
* Un círculo se define por su radio y las
* coordenadas de su centro.
* @version 1.2, 2/12/22
* @author Ángela Calvo Tejedor
*/
public class Circulo {
	protected double x,y; // coordenadas del centro Java 18
	protected double r; // radio del círculo
	/**
	* Crea un círculo a partir de su origen y radio.
	* @param x Coordenada x del centro del círculo.
	* @param y Coordenada y del centro del círculo.
	* @param r Radio del círculo. (>= 0).
	*/
	public Circulo(double x, double y, double r) {
		this.x=x; this.y = y; this.r = r;
	} 
	/**
	* Cálculo del área de este círculo.
	* @return El área (mayor o igual que 0) del círculo.
	*/
	public double area() {
		
		return Math.PI*r*r;
	}
	/**
	* Indica si un punto está dentro del círculo.
	* @param px componente x del punto
	Java 19
	* @param py componente y del punto
	* @return true si el punto está dentro del círculo o false en otro caso.
	*/
	public boolean contiene(double px, double py) {
		
		/* Calculamos la distancia de (px,py) al centro del círculo (x,y),
		que se obtiene como raíz cuadrada de (px-x)^2+(py-y)^2 */
		
		double d = Math.sqrt((px-x)*(px-x)+(py-y)*(py-y));
		
		// el círculo contiene el punto si d es menor o igual al radio
		return d <= r;
	}
}
