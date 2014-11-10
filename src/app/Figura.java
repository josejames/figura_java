package app;

public class Figura {
	
	private String nombre;
	private int lado1;
	private int lado2;

	public Figura(String nombre, int lado1, int lado2) {
		this.nombre = nombre;
		this.lado1 = lado1;
		this.lado2 = lado2;
	}

	public Figura(String nombre, int lado1) {
		this(nombre, lado1, lado1);
	}

	public double getArea() {

		if (nombre == "cuadrado") {
			return cuadrado(lado1);
		} else if (nombre == "circulo") {
			return circulo(lado1);
		} else if (nombre == "rectangulo") {
			return rectangulo(lado1, lado2);
		}
		return 0.0;
	}

	public double rectangulo(int lado, int lado2) {
		return lado * lado2;
	}

	public double cuadrado(int lado) {
		return lado * lado;
	}

	public double triangulo(int base, int altura) {
		return (base * altura) / 2;
	}

	public double circulo(int radio) {
		return 3.1416 * (radio * radio);
	}

	public double poligono(int per, int apot) {
		return (per * apot) / 2;
	}

	public String getNombre() {
		return nombre;
	}

}
