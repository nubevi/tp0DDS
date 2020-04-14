package utn.dds;

import java.util.*;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class OperacionEgreso {
	LinkedList <Item> items = new LinkedList <Item>();
	private Boolean operacionAbierta;
	private DocumentoComercial remito;
	private double valorOperacion = 0;

		
	public LinkedList<Item> getItems() {
		return items;
	}
	public void agregarItem(Item item) {
		if(this.operacionAbierta()){
			items.add(item);
		}
	}
	
	public boolean itemsSonArticulos() {
		return items.stream().allMatch(item -> item.getTipo() == "articulo");
	}
	
	public boolean puedeGenerarRemito() {
		return this.itemsSonArticulos();
	}
	
	public void generarRemito() {
		if(this.puedeGenerarRemito() && !this.operacionAbierta()) {
			remito = new DocumentoComercial();
			items.stream().forEach(item -> remito.agregarItemComprado(item));
		}
	}
		
	public boolean operacionAbierta() {
		return this.operacionAbierta;
	}
	
	public double valorDeOperacion() {
		if (operacionAbierta) {
			valorOperacion = items.stream().mapToDouble(Item::getPrecio).sum();
		}
		
		return valorOperacion;
	}
}
