package dp.structural.facade;

import java.sql.Connection;

public class MySqlHelper {
    //“Provide a unified interface to a set of interfaces in a
    //subsystem. Facade Pattern defines a higher-level

    public static Connection getMySqlDBConnection() {
        //get MySql DB connection using connection parameters
        System.out.println("MySqlDBConnection created ...");
        return null;
    }

    public void generateMySqlPDFReport(String tableName, Connection con) {
        //get data from table and generate pdf report
        System.out.println("MySqlPDFReport Generated ...");
    }

    public void generateMySqlHTMLReport(String tableName, Connection con) {
        //get data from table and generate pdf report
        System.out.println("MySqlHTMLReport Generated ...");
    }
}