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

@WebServlet("/register")
public class register extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //リクエストパラメータの文字コードを指定
        request.setCharacterEncoding("UTF-8");

        //リクエストパラメータの取得
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        int birthday = Integer.parseInt(request.getParameter("birthday"));
        int age = Integer.parseInt(request.getParameter("age"));

        Connection con = null;
        PreparedStatement stmt = null;

        try {
            //ドライバクラスのロード
            Class.forName("com.mysql.jdbc.Driver");

            //データベースへの接続
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/task1", "Inagawa", "0720");

            //SQL文の実行
            String sql = "Insert INTO employee(id, name, birthday, age) VALUES(?, ?, ?, ?)";
            stmt = con.prepareStatement(sql);

            //条件の「?」に値を設定
            stmt.setInt(1, id);
            stmt.setString(2, name);
            stmt.setInt(3, birthday);
            stmt.setInt(4, age);

            //SQL文に追加する
            int result = stmt.executeUpdate();
            System.out.println(result + "行が追加されました");

            //リソース解放
            stmt.close();

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

