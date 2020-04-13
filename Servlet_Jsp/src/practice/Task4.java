package practice;

import java.io.IOException;
import java.util.Date;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Task4
 */
@WebServlet("/Task4")
public class Task4 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Task4() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		final String resultPath = "/WEB-INF/jsp/fortune_result.jsp";		//フォワード用パス設定
		Date today = new Date();											//日付
		Random rand = new Random();
		int num = rand.nextInt(6);											//乱数用
		String[] fortune = {"大吉", "中吉", "小吉", "末吉", "凶", "大凶"};	//占い結果の配列
		FortuneBean ftb = new FortuneBean();								//FortuneBean
		ftb.setToday(today);
		ftb.setFortune(fortune[num]);
		request.setAttribute("result", ftb);
		request.getRequestDispatcher(resultPath).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
