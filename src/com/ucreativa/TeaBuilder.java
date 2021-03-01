/**
 * 
 */
package com.ucreativa;

/**
 * @author Fran
 *
 */
public class TeaBuilder extends StarbucksBuilder{

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

	public TeaBuilder(String size) {
		super(size);
	}
	
	@Override
	public void buildSize() {

	}
	
	@Override
	public void buildDrink() {
		super.Atributo1.setDrink("Tea");
	}

	@Override
	public String toString() {
		return "TeaBuilder [Tipo=" + Tipo + ", Temperatura=" + Temperatura + ", Addons=" + Addons + "]";
	}
	
}