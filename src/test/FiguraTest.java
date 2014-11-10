package test;

import static org.junit.Assert.*;

import org.junit.Test;

import app.Figura;

public class FiguraTest {

	@Test
	public void test() {
		Figura f = new Figura("cuadrado",5);
		assertEquals("comparando en Test", 25, f.getArea(),0);
	}
	@Test
	public void test_cuadrado_3() {
		Figura f = new Figura("cuadrado",3);
		assertEquals("comparando en Test", 9, f.getArea(),0);
	}
	
	@Test
	public void test_cuadrado_2() {
		Figura f = new Figura("cuadrado", 2);
		assertEquals("comparando", 4, f.getArea(), 0);
	}

}
