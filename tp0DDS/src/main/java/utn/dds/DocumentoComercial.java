package utn.dds;

import java.util.*;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class DocumentoComercial {
	private LinkedList <String> articulosComprados;
	private float totalCompra;

	public float getTotalCompra() {
		return totalCompra;
	}

	public LinkedList<String> getArticulosComprados() {
		return articulosComprados;
	}
	
	public void agregarItemComprado(Item item) {
		articulosComprados.add(item.getNombre());
	}
	
	
}
