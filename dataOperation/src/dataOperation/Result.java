package dataOperation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Result")
public class Result extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //リクエストパラメータを取得
        request.setCharacterEncoding("UTF-8");
        String name = request.getParameter("name");
        String gender = request.getParameter("gender");
        String qtype = request.getParameter("qtype");
        String body = request.getParameter("body");

        //リクエストパラメータをチェック
        if(gender.equals("0")) {
            gender = "男性";
        } else if (gender.equals("1")) {
            gender = "女性";
        }

        //HTML
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<meta charset=\"UTF-8\">");
        out.println("<tilte>以下の内容でお問合わせしました。回答をお待ちください。</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<p>" + "名前:" + name + "様" + "</p>");
        out.println("<p>" + "性別:" + gender + "</p>");
        out.println("<p>" + "お問合わせ種類:" + qtype + "</p>");
        out.println("<p>" + "お問合わせ内容:" + body + "</p>");
        out.println("</body>");
        out.println("</html>");
    }

}
