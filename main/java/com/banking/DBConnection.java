package com.banking;

import java.sql.Connection;
import java.sql.DriverManager;
public class DBConnection {
static Connection con = null;
static Connection get() {
 try {
 Class.forName("oracle.jdbc.driver.OracleDriver");
 con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SHIVAMkr", "asdfghjkl");
return con;
} catch (Exception e) {
return null;
}
}
}
