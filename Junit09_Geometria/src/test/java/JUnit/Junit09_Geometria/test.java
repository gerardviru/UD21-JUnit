package JUnit.Junit09_Geometria;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import JUnit.Junit09_Geometria.dto.Geometria;

class test {
	
	Geometria geo;
	
	@BeforeAll
	public static void testbeforeClass() {
		System.out.println("beforeClass");
	}
	
	@BeforeEach
	public void before() {
		geo = new Geometria();
	}
	
	App testApp = new App();
	@Test
	public void testMain() {
		testApp.main(null);
	}
	
	
	@Test
	public void testConstructor() {
	}
	
	@Test
	public void testGettersSettersGeometria() {
		System.out.println("TestGeometria()");
		geo.getId();
		geo.setId(0);
		geo.getNom();
		geo.setNom(null);
		geo.getClass();
		geo.getArea();
		geo.setArea(0);
		geo.toString();
	}
	
	@Test
	public void testareacuadrado() {
		System.out.println("TestAreaCuadrado");
		int resul = geo.areacuadrado(2);
		int resulE = 4;
		assertEquals(resulE, resul);
	}
	
	@Test
	public void testAreaCirculo() {
		System.out.println("TestAreaCirculo");
		double resul = geo.areaCirculo(2);
		double resultE = 12.5664;
		assertEquals(resultE, resul);
	}
	
	@Test
	public void testAreaTriangulo() {
		System.out.println("TestAreaTriangulo");
		double resul = geo.areatriangulo (2,5);
		double resulE = 5;
		assertEquals(resulE, resul);
	}
	
	@Test
	public void testAreaRectangulo() {
		System.out.println("TestAreaRectangulo");
		double resul = geo.arearectangulo(2,5);
		double resulE = 10;
		assertEquals(resulE, resul);
	}
	
	@Test
	public void testAreaPentagono() {
		System.out.println("TestAreaPentagono");
		double resul = geo.areapentagono(2,5);
		double resulE =5;
		assertEquals(resulE, resul);
	}
	
	@Test
	public void testAreaRombo() {
		System.out.println("TestAreaRombo");
		double resul = geo.arearombo(2,5);
		double resulE = 5;
		assertEquals(resulE, resul);
	}

	@Test
	public void testAreaRomboide() {
		System.out.println("TestAreaRomboide");
		double resul = geo.arearomboide(2,5);
		double resulE = 10;
		assertEquals(resulE, resul);
	}
	
	@Test
	public void testAreaTrapecio() {
		double resul = geo.areatrapecio(2,2,3);
		double resulE = 6;
		assertEquals(resulE, resul);
	}
	
	@Test
	public void testSwitch() {
		geo.figura(1);
		geo.figura(2);
		geo.figura(3);
		geo.figura(4);
		geo.figura(5);
		geo.figura(6);
		geo.figura(7);
		geo.figura(8);
		geo.figura(0);
	}
}
