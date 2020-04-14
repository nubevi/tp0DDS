package utn.dds;

import java.util.*;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class Organizacion {
	private LinkedList <OperacionEgreso> operacionesDeEgreso;
	private int gastoDeLaEmpresa = 0;
	
	public void agregarOperacionDeEgreso(OperacionEgreso nueva) {
		operacionesDeEgreso.add(nueva);
	}
	
	public void realizarOperacionDeEgreso(OperacionEgreso operacionARealizar) {
		gastoDeLaEmpresa += operacionARealizar.valorDeOperacion();
		this.agregarOperacionDeEgreso(operacionARealizar);
	}
}
