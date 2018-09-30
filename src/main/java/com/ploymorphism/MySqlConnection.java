package com.ploymorphism;

public class MySqlConnection extends Connection{
    private String name;
    public MySqlConnection(String name){
        this.name=name;
    }

    @Override
    public String toString() {
        return "MySqlConnection{" +
                "name='" + name + '\'' +
                '}';
    }
}
