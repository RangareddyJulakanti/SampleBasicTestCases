package com.ploymorphism;

public class OracleConnection extends Connection {
    private String name;
    public OracleConnection(String name){
        this.name=name;
    }

   /* @Override
    public String toString() {
        return "OracleConnection{" +
                "name='" + name + '\'' +
                '}';
    }*/
}
