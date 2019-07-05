package com.model;

public enum Grupo {
    FUNCIONARIO(1), MODERADOR(2), ADMIN(3);

    private final int NIVEL;

    Grupo(int nivel) {
        this.NIVEL = nivel;
    }

    public int getNivel() {
        return NIVEL;
    }
    
}
