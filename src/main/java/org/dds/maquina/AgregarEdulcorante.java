package org.dds.maquina;


public class AgregarEdulcorante implements Operacion {

	private DispenserAutomatico dispenser;

	public AgregarEdulcorante(DispenserAutomatico dispenser) {
		this.dispenser = dispenser;
	}

	@Override
	public void ejecutar() {
		this.dispenser.dispensarEdulcorante(1.0f);
	}

}
