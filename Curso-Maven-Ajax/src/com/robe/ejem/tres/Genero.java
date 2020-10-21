package com.robe.ejem.tres;

public enum Genero {
	HOMBRE('H', "Hombre"),
	MUJER('M', "Mujer");
	
	private char codGenero;
	private String descripcionGenero;
	
	private Genero(char codGenero, String descripcionGenero) {
		this.codGenero = codGenero;
		this.descripcionGenero = descripcionGenero;
	}

	public char getCodGenero() {
		return codGenero;
	}

	public String getDescripcionGenero() {
		return descripcionGenero;
	}
	
	public Genero getGenero(String genero) {
		for(Genero gen : values()) {
			if(genero.equalsIgnoreCase(String.valueOf(gen.getCodGenero())) 
					|| genero.equalsIgnoreCase(gen.getDescripcionGenero())) {
				return gen;
			}
		}
		
		return null;
	}
	
	
}
