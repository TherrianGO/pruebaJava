package com.acme;

public class HolaMundo {
    public static void main(String[] args) {
        mensaje msg = new mensaje();
        String nombre = msg.solicitarDatos("Escribe tu nombre: ");
        msg.saludar(nombre);
    }
}
