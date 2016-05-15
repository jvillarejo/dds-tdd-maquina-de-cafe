package org.dds.maquina;


public class AgregarAzucar implements Operacion {

	private DispenserAutomatico dispenser;

	public AgregarAzucar(DispenserAutomatico dispenser) {
		this.dispenser = dispenser;
	}

	public void ejecutar() {
		this.dispenser.dispensarAzucar(1.0f);		
	}

}
