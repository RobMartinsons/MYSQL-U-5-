import java.sql.*;


public class DBlogic {

        String DB = "jdbc:mysql://localhost:3306/2311";
        String USER = "root";
        String PASS =  "********"; //Parole pašam jāievada

        // insert
        public void insert() {
                try{
                    //connection
                    Connection conn = DriverManager.getConnection(DB , USER , PASS);
                    Statement stmt = conn.createStatement();

                    String sql = "INSERT INTO users (name) VALUES ('Roberts')";

                    stmt.executeUpdate(sql);

                    System.out.println("Dati ievaditi");

                } catch (SQLException e) {
                        e.printStackTrace();
                }
        }
    // update
    public void update() {
        try{
            //connection
            Connection conn = DriverManager.getConnection(DB , USER , PASS);
            Statement stmt = conn.createStatement();

            String sql = "UPDATE users SET name = 'Robots' WHERE id = 7";

            stmt.executeUpdate(sql);

            System.out.println("Dati atjaunoti");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    // delete
    public void delete() {
        try{
            //connection
            Connection conn = DriverManager.getConnection(DB , USER , PASS);
            Statement stmt = conn.createStatement();

            String sql = "DELETE FROM users";

            stmt.executeUpdate(sql);

            System.out.println("Dati izdzesti");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
  //select
    public void select() {
        try{
            //connection
            Connection conn = DriverManager.getConnection(DB , USER , PASS);
            Statement stmt = conn.createStatement();

            String sql = "SELECT * FROM users WHERE name = 'Roberts'";

            stmt.executeQuery(sql);
            ResultSet rs = stmt.getResultSet();
            System.out.println("izvēlētie dati:");
while (rs.next()) {
    System.out.println(rs.getString("name"));
}
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }



}
