package com.ploymorphism;

public class SQLServerConnection extends Connection {
    private String name;
    public SQLServerConnection(String name){
        this.name=name;
    }

    @Override
    public String toString() {
        return "SQLServerConnection{" +
                "name='" + name + '\'' +
                '}';
    }
}
