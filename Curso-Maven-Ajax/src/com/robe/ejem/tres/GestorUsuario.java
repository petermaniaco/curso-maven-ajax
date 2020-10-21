package com.robe.ejem.tres;

import java.util.HashSet;
import java.util.Set;

public class GestorUsuario {
	private static Set<Usuario> listaUsuarios = new HashSet<>();
	
	public static boolean addUsuario(Usuario usuario) {
		if(!listaUsuarios.contains(usuario)) {
			listaUsuarios.add(usuario);
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean borraUsuario(Usuario usuario) {
		if(listaUsuarios.contains(usuario)) {
			listaUsuarios.remove(usuario);
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean modificaUsuario(Usuario usuario) {
		if(listaUsuarios.contains(usuario)) {
			borraUsuario(usuario);
			addUsuario(usuario);
			return true;
		}else {
			return false;
		}
	}
	
	public static String muestraUsuario(Usuario usuario) {
		return usuario.toString();
	}
	
	public static String muestroTodosLosUsuarios() {
		StringBuilder stB = new StringBuilder();
		for(Usuario us : listaUsuarios) {
			stB.append(us.toString());
			stB.append("\n");
		}
		
		return stB.toString();
	}

	public static Set<Usuario> getListaUsuarios() {
		return listaUsuarios;
	}

	public static void setListaUsuarios(Set<Usuario> listaUsuarios) {
		GestorUsuario.listaUsuarios = listaUsuarios;
	} 
}
