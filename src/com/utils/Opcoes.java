package com.utils;

public class Opcoes {
    
    private final String IP_DATABASE;
    private final String IP_ZEBRA;
    private final boolean ZEBRACONNECT;

    public Opcoes(String IP_DATABASE, String IP_ZEBRA, boolean ZEBRACONNECT) {
        this.IP_DATABASE = IP_DATABASE;
        this.IP_ZEBRA = IP_ZEBRA;
        this.ZEBRACONNECT = ZEBRACONNECT;
    }

    public String getIP_DATABASE() {
        return IP_DATABASE;
    }

    public String getIP_ZEBRA() {
        return IP_ZEBRA;
    }

    public boolean isZEBRACONNECT() {
        return ZEBRACONNECT;
    }    
    
}
