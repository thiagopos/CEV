package com.model;

public enum Acesso {
    FUNCIONARIO(1), MODERADOR(2), ADMIN(3);

    private final int NIVEL;

    Acesso(int nivel) {
        this.NIVEL = nivel;
    }

    public int getNivel() {
        return NIVEL;
    }

}
