package com.example.recyclerview_con_cardview;

public class jugadorfutbol {
    private String jugador,nacionalidad;
    private int imgJugador;

    public jugadorfutbol() {

    }
    public jugadorfutbol(String jugador, String nacionalidad, int imgJugador){
        this.jugador = jugador;
        this.nacionalidad = nacionalidad;
        this.imgJugador = imgJugador;
    }

    public String getJugador() {
        return jugador;
    }

    public void setJugador(String jugador) {
        this.jugador = jugador;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getImgJugador() {
        return imgJugador;
    }

    public void setImgJugador(int imgJugador) {
        this.imgJugador = imgJugador;
    }
}
