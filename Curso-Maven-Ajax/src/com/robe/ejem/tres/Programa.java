package com.robe.ejem.tres;

public class Programa {

	public static void main(String[] args) {
		Usuario usuario1 = new Usuario();
		usuario1.setDni("12345678A");
		usuario1.setEdad(28);
		usuario1.setEstado(true);
		usuario1.setGenero(Genero.HOMBRE);
		usuario1.setNombre("Peter");
		usuario1.setSalario(1000.50f);
		usuario1.setTelefono("1234567890");
		
		GestorUsuario.addUsuario(usuario1);
		
		Usuario usuario2 = new Usuario("Maria", "12345678B", "123456789", 30, 1500f, true, Genero.MUJER);
		GestorUsuario.addUsuario(usuario2);
		
		Usuario usuario3 = new Usuario("Juan", "12345678c", "123456799", 32, 900f, true, Genero.HOMBRE);
		GestorUsuario.addUsuario(usuario3);
		
		System.out.println(GestorUsuario.muestroTodosLosUsuarios());
		
		
		Usuario usuario2Modif = new Usuario("Mario", "12345678B", "123456789", 30, 1500f, true, Genero.HOMBRE);
		GestorUsuario.modificaUsuario(usuario2Modif);
		
		System.out.println("Usuarios despues de la modificacion:\n" + GestorUsuario.muestroTodosLosUsuarios());
		
		Usuario usuario4 = new Usuario("Juanito", "12345678D", "123456799", 32, 900f, true, Genero.HOMBRE);
		GestorUsuario.addUsuario(usuario4);
		System.out.println("Usuarios despues de la nueva insercción:\n" + GestorUsuario.muestroTodosLosUsuarios());
		
		GestorUsuario.borraUsuario(usuario4);
		System.out.println("Usuarios despues del borrado:\n" + GestorUsuario.muestroTodosLosUsuarios());
	}

}
