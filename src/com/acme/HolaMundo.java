package com.acme;

public class HolaMundo {
    public static void main(String[] args) {
        mensaje msg = new mensaje();
        String nombre = msg.solicitarDatos("Escribe tu nombre: ");
        String apellidos = msg.solicitarDatos("Escribe tus apellidos");
        Persona p1 = new Persona(nombre, apellidos);
        msg.saludar(p1);
    }
}
