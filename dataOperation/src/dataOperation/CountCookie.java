package dataOperation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CountCookie")
public class CountCookie extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();

        //html
        out.println("<html>");
        out.println("<head>");
        out.println("<title>訪問回数</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>訪問回数テスト (クッキー)</h1>");

        //Cookieの値を取得
        Cookie cookies[] = request.getCookies();

        //Cookie変数の宣言
        Cookie visitedCookie = null;

        //nullチェック
        if(cookies != null) {
            for(int i = 0; i < cookies.length; i++) {
                if(cookies[i].getName().equals("visit")) {
                    visitedCookie = cookies[i];
                }
            }
        }

        //訪問回数の表示
        if(visitedCookie != null) {
            int visit = Integer.parseInt(visitedCookie.getValue()) + 1;

            out.println("<p>" + visit + "回目の訪問です。</p>");

            visitedCookie.setValue(Integer.toString(visit));
            visitedCookie.setMaxAge(300); //有効期限の設定
            response.addCookie(visitedCookie); //Cookieの保存

        }else{
            out.println("<p>初めての訪問です。</p>");

            Cookie newCookie = new Cookie("visit", "1"); //新しくCookieを作成
            newCookie.setMaxAge(300);
            response.addCookie(newCookie);
        }

        out.println("<a href=\"/dataOperation/CountCookie\">画面を再訪問</a>");
        out.println("</body>");
        out.println("</html>");
    }
}
