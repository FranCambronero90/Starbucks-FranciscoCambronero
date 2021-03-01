/**
 * 
 */
package com.ucreativa;

/**
 * @author Fran
 *
 */
public class Waiter {
	
	private StarbucksBuilder Orden;
	private int Numero_Mesa;
	private boolean Orden_entregada;  
	
	public int getNumero_Mesa() {
		return Numero_Mesa;
	}

	public void setNumero_Mesa(int numero_Mesa) {
		Numero_Mesa = numero_Mesa;
	}

	public boolean isOrden_entregada() {
		return Orden_entregada;
	}

	public void setOrden_entregada(boolean orden_entregada) {
		Orden_entregada = orden_entregada;
	}

	public void setStarbucksBuilder(StarbucksBuilder Orden) {
		this.Orden = Orden;
	}
	
	public Starbucks getStarbucksDrink() {
		return Orden.getStarbucks();
	}
	
	public Waiter() {
		
	}
	
	public void constructStarbucks() {
		Orden.createStarbucks();
		Orden.buildSize();
		Orden.buildDrink();
	}

	@Override
	public String toString() {
		return "Waiter [Orden=" + Orden + ", Numero_Mesa=" + Numero_Mesa + ", Orden_entregada=" + Orden_entregada + "]";
	}
	
}