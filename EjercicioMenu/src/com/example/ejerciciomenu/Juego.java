package com.example.ejerciciomenu;

public class Juego {
	
	private String titulo;
	private String subtitulo;
	private String fecha;
	private int foto;

	public Juego(String tit, String sub, String fec, int fot){
		titulo = tit;
		subtitulo = sub;
		fecha = fec;
		foto = fot;
	}
	
	public String getTitulo(){
		return titulo;
	}
	
	public String getSubtitulo(){
		return subtitulo;
	}
	
	public String getFecha(){
		return fecha;
	}
	
	public int getFoto(){
		return foto;
	}
}
