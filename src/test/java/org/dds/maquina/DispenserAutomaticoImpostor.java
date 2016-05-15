package org.dds.maquina;


public class DispenserAutomaticoImpostor implements DispenserAutomatico {
	
	private boolean seLlamoAIniciar = false;
	private boolean seLLamoAgregarAzucar = false;
	private float cantidadDeAzucar = 0;
	private float cantidadDeEdulcorante = 0 ;
	private boolean seLLamoAgregarEdulcorante = false;
	
	public void iniciar() {
		seLlamoAIniciar = true;
	}
	
	public boolean seLlamoAIniciar() {
		return seLlamoAIniciar;
	}

	public boolean seLLamoAgregarAzucar() {
		return seLLamoAgregarAzucar ;
	}

	@Override
	public void dispensarAzucar(float d) {
		this.cantidadDeAzucar  += d;
		this.seLLamoAgregarAzucar = true;
	}

	public float cucharadasDeAzucar() {
		return cantidadDeAzucar;
	}

	public float cucharadasDeEdulcorante() {
		return cantidadDeEdulcorante;
	}

	@Override
	public void dispensarEdulcorante(float cucharadasDeEdulcorante) {
		this.cantidadDeEdulcorante += cucharadasDeEdulcorante;
		this.seLLamoAgregarEdulcorante = true;
		
	}

}
