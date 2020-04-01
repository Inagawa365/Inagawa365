package practice;

import java.io.IOException;
import java.util.Date;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Task4")
public class Task4 extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        final String result = "/WEB-INF/JSP/fortune_result.jsp";

        //日付を取得
        Date today = new Date();

        //ランダムで運勢を設定
        String[] index = {"大吉", "中吉", "小吉", "末吉", "凶", "大凶"};
        Random random = new Random();
        String fortune = index[random.nextInt(6)];

        //リクエストスコープにデータを格納
        FortuneBean fortuneBean = new FortuneBean();
        fortuneBean.setToday(today);
        fortuneBean.setFortune(fortune);

        //リクエストスコープにインスタンスを保存
        request.setAttribute("result", fortuneBean);

        request.getRequestDispatcher(result).forward(request, response);

	}

}
