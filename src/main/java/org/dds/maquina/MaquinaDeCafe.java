package org.dds.maquina;

import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MaquinaDeCafe {

	private DispenserAutomatico dispenser;
	private List<Operacion> operaciones = new ArrayList<>();
	private Map<String, Operacion> mapeoBotones = new HashMap<String, Operacion>();

	public MaquinaDeCafe(DispenserAutomatico dispenser) {
		this.dispenser = dispenser;
		
		mapeoBotones.put("AgregarAzucar", new AgregarAzucar(dispenser));
		mapeoBotones.put("AgregarEdulcorante", new AgregarEdulcorante(dispenser));
	}

	public void iniciar() {
		for (Operacion operacion : this.operaciones) {
			operacion.ejecutar();
		}
		dispenser.iniciar();
	}

	public void agregarAzucar() {
		this.operaciones.add(new AgregarAzucar(dispenser));
	}

	public void agregarEdulcorante() {
		this.operaciones.add(new AgregarEdulcorante(dispenser));
	}

	public void pulsarBoton(String boton) {
	   this.operaciones.add(this.mapeoBotones.get(boton));
	}
}
