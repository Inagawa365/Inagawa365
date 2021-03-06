

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DeleteEmployee")
public class DeleteEmployee extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //リクエストパラメータの文字コードを指定
        request.setCharacterEncoding("UTF-8");

        //リクエストパラメータの取得
        int id = Integer.parseInt(request.getParameter("id"));

        Connection con = null;
        PreparedStatement ps = null;

        try {
            //ドライバクラスのロード
            Class.forName("com.mysql.jdbc.Driver");

            //データベースへの接続
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/task1", "Inagawa", "0720");

            //SQL文の実行
            String sql = "DELETE FROM employee WHERE id = ?";
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int reno = ps.executeUpdate();
            System.out.println(reno + "削除されました。");

            //リソース解放
            ps.close();

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
