package com.ploymorphism;

public class Connection  {
    public static  Connection getConnection(String driverclass){
        if(driverclass.equalsIgnoreCase("MYSQL")){
            Connection con= new MySqlConnection("mysqlConnection");
            return con;
        }else if(driverclass.equalsIgnoreCase("ORACLE")){
            Connection con= new OracleConnection("oracle connection");
            return  con;
        }else if(driverclass.equalsIgnoreCase("SQLSERVER")){
            Connection con= new SQLServerConnection("SqlServer connection");
            return con;
        }else{
            return null;
        }
    }
    @Override
    public String toString(){
        return "connection class toString method";
    }
}
