package utn.dds;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TP0Tests {
	
	@Before
	public void before() {
		Item articulo1 = new Item("calculadora", 1234, 25, "articulo");
		Item articulo2 = new Item("computadora", 3124, 100, "articulo");
		Item articulo3 = new Item("heladera", 4321, 1000, "articulo");
		Item servicio1 = new Item("agregar wifi", 011323, 200, "servicio");
		
		OperacionEgreso OPArticulosAbierto = new OperacionEgreso();
		OperacionEgreso OPArticulosCerrado = new OperacionEgreso();
		OperacionEgreso OPMezclaArtServCerrado = new OperacionEgreso();

		OPArticulosAbierto.agregarItem(articulo1);
		OPArticulosAbierto.agregarItem(articulo2);
		OPArticulosAbierto.agregarItem(articulo3);
		
		OPArticulosCerrado.agregarItem(articulo1);
		OPArticulosCerrado.agregarItem(articulo2);
		OPArticulosCerrado.agregarItem(articulo3);
		
		OPMezclaArtServCerrado.agregarItem(articulo1);
		OPMezclaArtServCerrado.agregarItem(articulo2);
		OPMezclaArtServCerrado.agregarItem(articulo3);
		OPMezclaArtServCerrado.agregarItem(servicio1);
		
		Organizacion organizacion = new Organizacion();
		organizacion.agregarOperacionDeEgreso(OPArticulosAbierto);
		organizacion.agregarOperacionDeEgreso(OPArticulosCerrado);
		organizacion.agregarOperacionDeEgreso(OPMezclaArtServCerrado);	
	}
	
	@Test
	public void noPuedeGenerarRemitoSiHayUnServicio() {
		Assert.assertFalse( OPMezclaArtServCerrado.puedeGenerarRemito() );	// No se porqué da error :/
	}
	
	@Test
	public void noPuedoAgregarItemSiEstaCerradaLaOperacion() {
		
	}
	
}
