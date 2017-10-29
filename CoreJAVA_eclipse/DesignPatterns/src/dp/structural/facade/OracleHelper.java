package dp.structural.facade;

import java.sql.Connection;

public class OracleHelper {
    public static Connection getOracleDBConnection() {
        //get Oracle DB connection using connection parameters
        System.out.println("OracleDB Connection created ...");
        return null;
    }

    public void generateOraclePDFReport(String tableName, Connection con) {
        //get data from table and generate pdf report
        System.out.println("OraclePDFReport PDF report created ...");
    }

    public void generateOracleHTMLReport(String tableName, Connection con) {
        //get data from table and generate pdf report
        System.out.println("OracleHTMLReport  report created ...");
    }
}