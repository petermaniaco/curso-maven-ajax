package com.robe.ejem.tres;

public class Usuario {
	private String nombre;
	private String dni;
	private String telefono;
	private int edad;
	private float salario;
	private boolean estado;
	private Genero genero;

	public Usuario() {
		super();
	}

	public Usuario(String nombre, String dni, String telefono, int edad, float salario, boolean estado, Genero genero) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.telefono = telefono;
		this.edad = edad;
		this.salario = salario;
		this.estado = estado;
		this.genero = genero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	
	public void setGenero(String genero) {
		
	}

	@Override
	public String toString() {
		return "Usuario {nombre:'" + nombre + "', dni:'" + dni + "', telefono:'" + telefono + "', edad:'" + edad
				+ "', salario:'" + salario + "', estado:'" + estado + "', genero:'" + (genero != null
						? genero.getDescripcionGenero()
						: null) + "'}";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		return true;
	}
	

}
