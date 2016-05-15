package org.dds.maquina;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaquinaTest {

	@Test
	public void testLlamaAInciarDeLaInterfazCuandoSeEjecutarInciar() {
		DispenserAutomaticoImpostor dispenser = new DispenserAutomaticoImpostor();
		
		MaquinaDeCafe maquinaDeCafe = new MaquinaDeCafe(dispenser);
		
		maquinaDeCafe.iniciar();
		
		assertTrue(dispenser.seLlamoAIniciar());
	}
	
	@Test
	public void testPonerAzucarNoLLamaAgregarAzucarDelDispenserHastaLlamarIniciar() throws Exception {
		DispenserAutomaticoImpostor dispenser = new DispenserAutomaticoImpostor();
		MaquinaDeCafe maquinaDeCafe = new MaquinaDeCafe(dispenser);
		maquinaDeCafe.agregarAzucar();
		assertFalse(dispenser.seLLamoAgregarAzucar());
	}
	
	@Test
	public void testPonerAzucarAgregarYSeLLamaIniciarSeDispensaAzucar() throws Exception {
		DispenserAutomaticoImpostor dispenser = new DispenserAutomaticoImpostor();
		MaquinaDeCafe maquinaDeCafe = new MaquinaDeCafe(dispenser);
		maquinaDeCafe.agregarAzucar();
		maquinaDeCafe.iniciar();
		
		assertTrue(dispenser.seLLamoAgregarAzucar());
	}
	
	@Test
	public void testPonerAzucarAgregarYSeLLamaIniciarSeDispensaAzucarAgregaUnaCucharada() throws Exception {
		DispenserAutomaticoImpostor dispenser = new DispenserAutomaticoImpostor();
		MaquinaDeCafe maquinaDeCafe = new MaquinaDeCafe(dispenser);
		maquinaDeCafe.agregarAzucar();
		maquinaDeCafe.iniciar();
		
		assertEquals(1.0f, dispenser.cucharadasDeAzucar(), 0.001f);
	}
	
	@Test
	public void testPonerAzucarAgregar2VecesYSeLLamaIniciarSePone2GramosDeAzucar() throws Exception {
		DispenserAutomaticoImpostor dispenser = new DispenserAutomaticoImpostor();
		MaquinaDeCafe maquinaDeCafe = new MaquinaDeCafe(dispenser);
		maquinaDeCafe.agregarAzucar();
		maquinaDeCafe.agregarAzucar();
		maquinaDeCafe.iniciar();
		
		assertEquals(2.0f, dispenser.cucharadasDeAzucar(), 0.001f);
	}
	
	@Test
	public void testPonerEdulcorante2VecesYSeLLamaIniciarSePone2CucharadasDeEdulcorante() throws Exception {
		DispenserAutomaticoImpostor dispenser = new DispenserAutomaticoImpostor();
		MaquinaDeCafe maquinaDeCafe = new MaquinaDeCafe(dispenser);
		maquinaDeCafe.agregarEdulcorante();
		maquinaDeCafe.agregarEdulcorante();
		maquinaDeCafe.iniciar();
		
		assertEquals(2.0f, dispenser.cucharadasDeEdulcorante(), 0.001f);
	}
	
	@Test
	public void testPulsoBotonConEdulcorante2VecesYSeLLamaIniciarSePone2CucharadasDeEdulcorante() throws Exception {
		DispenserAutomaticoImpostor dispenser = new DispenserAutomaticoImpostor();
		MaquinaDeCafe maquinaDeCafe = new MaquinaDeCafe(dispenser);
		
		maquinaDeCafe.pulsarBoton("AgregarEdulcorante");
		maquinaDeCafe.pulsarBoton("AgregarEdulcorante");
		
		maquinaDeCafe.iniciar();
		
		assertEquals(2.0f, dispenser.cucharadasDeEdulcorante(), 0.001f);
	}
	
	
	
	

}
