import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/search")
public class search extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //htmlを出力
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();

        //リクエストパラメータの文字コードを指定
        request.setCharacterEncoding("UTF-8");

        String namae = request.getParameter("name");

        Connection con = null;
        PreparedStatement ps = null;

        out.println("<html>");
        out.println("<head>");
        out.println("<title>検索結果</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>検索結果</h1>");

        try {
            //ドライバクラスのロード
            Class.forName("com.mysql.jdbc.Driver");

            //データベースへの接続
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/task1", "Inagawa", "0720");

            //検索条件の設定
            String sql = "SELECT * FROM employee WHERE name LIKE ?;";
            ps = con.prepareStatement(sql);

            //入力された値を設定(部分一致の場合)
            ps.setString(1, "%" + namae + "%");
            ResultSet rs = ps.executeQuery();

            while(rs.next()){

                out.println("<p> ID:" +rs.getInt("id") + "</p>");
                out.println("<p> 名前:" + rs.getString("name") + "</p>");
                out.println("<p> 生年月日:" + rs.getDate("birthday") + "</p>");
                out.println("<p> 年齢:" + rs.getInt("age") + "</p>");
            }

            //リソース解放
            rs.close();
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

        out.println("</body>");
        out.println("</html>");
    }
}

