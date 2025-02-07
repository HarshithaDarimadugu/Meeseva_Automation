package database_utility;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class DataBase_Utility {
	
	public String readDataFromDB(String whereAttName,String select,String whereAttValue)
	{
		String user = "dev_team";
        String password = "pass@word1";
        String url = "jdbc:sqlserver://192.168.90.60:1433;databaseName=master;encrypt=false";
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        String attribute="";
        try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                System.out.println("Connecting to database...");
                connection = DriverManager.getConnection(url, user, password);
                System.out.println("Creating statement...");
                statement = connection.createStatement();
                try{
                	String sql ="SELECT * FROM NPP_Development_Test.dbo.tblOTPData to2  WHERE "+whereAttName+"="+whereAttValue+"";
                	resultSet = statement.executeQuery(sql);
                }catch(Exception e) {
                	String sql ="SELECT * FROM NPP_Development_Test.dbo.tblOTPData to2  WHERE "+whereAttName+"='"+whereAttValue+"'";
                  	resultSet = statement.executeQuery(sql);
                }
                System.out.println("db query is executed ");
                while (resultSet.next()) {
                         attribute = resultSet.getString(select);
                        System.out.println(" Attribute: " + attribute);
                }
        } catch (SQLException | ClassNotFoundException e) {
                e.printStackTrace();
        } finally {
                try {
                        if (resultSet != null)
                                resultSet.close();
                        if (statement != null)
                                statement.close();
                        if (connection != null)
                                connection.close();
                } catch (SQLException e) {
                        e.printStackTrace();
                }
        }
        return attribute;
	}
	
	public String readDataFromDB(String query,String select)
	{
		
		String user = "dev_team";
        String password = "pass@word1";
        String url = "jdbc:sqlserver://192.168.90.60:1433;databaseName=master;encrypt=false";
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        String attribute="";
        try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                System.out.println("Connecting to database...");
                connection = DriverManager.getConnection(url, user, password);
                System.out.println("Creating statement...");
                statement = connection.createStatement();
                try{
                	String sql =query;
                	resultSet = statement.executeQuery(sql);
                }catch(Exception e) {
                	String sql =query;
                  	resultSet = statement.executeQuery(sql);
                }
                System.out.println("db query is executed ");
                while (resultSet.next()) {
                         attribute = resultSet.getString(select);
                        System.out.println(" Attribute: " + attribute);
                }
        } catch (SQLException | ClassNotFoundException e) {
                e.printStackTrace();
        } finally {
                try {
                        if (resultSet != null)
                                resultSet.close();
                        if (statement != null)
                                statement.close();
                        if (connection != null)
                                connection.close();
                } catch (SQLException e) {
                        e.printStackTrace();
                }
        }
        return attribute;
	}
	
	@Test
	public void query()
	{
		DataBase_Utility db=new DataBase_Utility();
		System.out.println(db.readDataFromDB("select top 1 sFMOTPvalue from tblSupplier where sPhone='9971222700' and sFMOTPvalue is not null  order by  dtLastModified desc","sFMOTPvalue"));
	}
}
