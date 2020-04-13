import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {

    public static void main(String[] args) {

        Connection con = null;
        try {
                Class.forName("com.mysql.cj.jdbc.Driver");

                con = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/task1", "Inagawa", "0720");
                System.out.println("DB接続に成功しました");

            } catch (ClassNotFoundException e1) {
                e1.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
            //データベースの切断
                if(con != null) {
                    try {
                        con.close();
                    } catch (SQLException e) {
                        //DB切断失敗時の処理
                        e.printStackTrace();
                    }
                }
            }
    }
}

