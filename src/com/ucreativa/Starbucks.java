/**
 * 
 */
package com.ucreativa;

/**
 * @author Fran
 *
 */
public class Starbucks {

	private String Size;
	private String Drink;
	private String Bocadillo;

	public String getBocadillo() {
		return Bocadillo;
	}

	public void setBocadillo(String Bocadillo) {
		this.Bocadillo = Bocadillo;
	}

	public String getSize() {
		return Size;
	}
	
	public void setSize(String Size) {
		this.Size = Size;
	}

	public String getDrink() {
		return Drink;
	}	

	public void setDrink(String Drink) {
		this.Drink = Drink;
	}
	
	public Starbucks() {
		
	}
	
	public void NuevaOrden() {
		System.out.println("Recibir orden");
	}
	public void Preparando() {
		System.out.println("Reparar una Orden");
	}
	public void EntregarOrden() {
		System.out.println("Entregar una orden");
	}

	@Override
	public String toString() {
		return "Starbucks [Size=" + Size + ", Drink=" + Drink + ", Bocadillo=" + Bocadillo + "]";
	}
	
}