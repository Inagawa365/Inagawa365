package jp.co.colla_tech;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletTask3")
public class ServletTask3 extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //占いをランダムで決定
        String[] fortune = {"大吉", "中吉", "小吉", "末吉", "凶", "大凶"};
        Random random = new Random();
        String luck = fortune[random.nextInt(6)];

	    response.setContentType("text/html; charset = UTF-8");
        PrintWriter out = response.getWriter();

        //headerとfooterの間に内容を記述
        HtmlTemplate.header(out);
        out.println("<title>Servlet Kadai</title>");
        out.println("<p>↓占い結果↓</p>");
        out.println("<h1>" + luck + "</h1>");
        HtmlTemplate.footer(out);


	}

}
