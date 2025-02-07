package database_utility;


import java.sql.*;

public class DatabaseUtility {

    private String dbUrl;
    private String username;
    private String password;

    public DatabaseUtility(String dbUrl, String username, String password) {
        this.dbUrl = dbUrl;
        this.username = username;
        this.password = password;
    }

    /**
     * Executes the given SQL query and prints the result set.
     * 
     * @param query SQL query to execute.
     * @throws SQLException if a database access error occurs.
     * @throws Throwable 
     */
    public void executeQuery(String query) throws SQLException, Throwable {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
        	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            // Establish connection
            connection = DriverManager.getConnection(dbUrl, username, password);

            // Create statement
            statement = connection.createStatement();

            // Execute query
            resultSet = statement.executeQuery(query);

            // Get metadata to retrieve column names
            ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();

            // Print column names
            for (int i = 1; i <= columnCount; i++) {
                System.out.print(metaData.getColumnName(i) + "\t");
            }
            System.out.println();

            // Print rows
            while (resultSet.next()) {
                for (int i = 1; i <= columnCount; i++) {
                    System.out.print(resultSet.getString(i) + "\t");
                }
                System.out.println();
            }
        } finally {
            // Close resources
            if (resultSet != null) resultSet.close();
            if (statement != null) statement.close();
            if (connection != null) connection.close();
        }
    }

    public static void main(String[] args) throws Throwable {
        String dbUrl = "jdbc:sqlserver://192.168.90.60:1433;databaseName=NPP_Development-DEMO;encrypt=false";
        String username = "dev_team";
        String password = "pass@word1";
        String query = "SELECT * FROM tblSupplier";
        //String query = "select top 1 sFMOTPvalue from tblSupplier where sPhone='9971222700' and sFMOTPvalue is not null  order by  dtLastModified desc";

        DatabaseUtility dbUtility = new DatabaseUtility(dbUrl, username, password);

        try {
            dbUtility.executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
