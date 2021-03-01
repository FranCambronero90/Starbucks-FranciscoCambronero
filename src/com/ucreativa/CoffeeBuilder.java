/**
 * 
 */
package com.ucreativa;

/**
 * @author Fran
 *
 */
public class CoffeeBuilder extends StarbucksBuilder{

	private String Tipo;
	private String Temperatura;
	private String Addons;
	
	public String getTipo() {
		return Tipo;
	}

	public void setTipo(String tipo) {
		Tipo = tipo;
	}

	public String getTemperatura() {
		return Temperatura;
	}

	public void setTemperatura(String temperatura) {
		Temperatura = temperatura;
	}

	public String getAddons() {
		return Addons;
	}

	public void setAddons(String addons) {
		Addons = addons;
	}

	public CoffeeBuilder(String Size) {
		super(Size);
	}
	
	@Override
	public void buildSize() {
		
	}
	
	@Override
	public void buildDrink() {
		super.Atributo1.setDrink("Cafe");
	}

	@Override
	public String toString() {
		return "CoffeeBuilder [Tipo=" + Tipo + ", Temperatura=" + Temperatura + ", Addons=" + Addons + "]";
	}
		
}