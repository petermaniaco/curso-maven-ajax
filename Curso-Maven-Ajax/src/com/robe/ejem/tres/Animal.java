package com.robe.ejem.tres;

public class Animal {
	private String nombre;
	private String especie;
	private String genero;
	private float peso;
	private int edad;
	

	public Animal(String nombre, String especie, String genero, float peso, int edad){
		super();
		this.nombre = nombre;
		this.especie = especie;
		this.genero = genero;
		this.peso = peso;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Animal [nombre=" + nombre + ", especie=" + especie + ", genero=" + genero + ", peso=" + peso + ", edad="
				+ edad + "]";
	}
	
	public boolean isMayor(Animal animal) {
		return this.edad > animal.edad;
	}
	
	

}
