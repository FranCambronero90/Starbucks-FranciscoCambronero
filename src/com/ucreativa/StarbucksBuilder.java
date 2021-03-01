/**
 * 
 */
package com.ucreativa;

/**
 * @author Fran
 *
 */
public abstract class StarbucksBuilder {

	public Starbucks Atributo1;
	public String Atributo2;
	public String Size;
	
	public Starbucks getAtributo1() {
		return Atributo1;
	}

	public void setAtributo1(Starbucks atributo1) {
		Atributo1 = atributo1;
	}

	public String getAtributo2() {
		return Atributo2;
	}

	public void setAtributo2(String atributo2) {
		Atributo2 = atributo2;
	}

	public String getSize() {
		return Size;
	}

	public void setSize(String size) {
		Size = size;
	}

	StarbucksBuilder(String Size){
		this.Size = Size;
	}
	
	public Starbucks getStarbucks() {
		return Atributo1;
}
	
	public void createStarbucks() {
		System.out.println("Creando un Starbucks apartir de una orden");
		
	}
	
	public void buildSize() {
		
	}
	
	public void buildDrink() {
		
	}
	
}
