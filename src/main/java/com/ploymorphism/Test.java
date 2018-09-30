package com.ploymorphism;

public class Test {
    public static void main(String[] args) {
       Connection con= Connection.getConnection("oracle");
       /* System.out.println(con.toString());*/
     /*  MySqlConnection con=new MySqlConnection("mysql");
        System.out.println(con.toString());*/
       /* OracleConnection con=new OracleConnection("oracle");
        System.out.println(con.toString());*/

        //Connection con=new SQLServerConnection("sqlserver");
       // con=new OracleConnection("oracle");
        //con=new MySqlConnection("mysql");
        System.out.println(con.toString());
    }
}
