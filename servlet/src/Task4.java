

import java.io.IOException;
import java.io.PrintWriter;
//random生成用
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
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		//占い結果の設定
		String[] telling = {"大吉", "中吉", "小吉", "末吉", "凶", "大凶"};
		Random rand = new Random();
		int randomValue = rand.nextInt(5);
		HtmlTemplate htl = new HtmlTemplate();

		response.setContentType("text/html; charset = UTF-8");
		PrintWriter out = response.getWriter();

		//実際のHTML表示部分
		htl.header(out);
		out.println("<p>↓占い結果↓</p>");
		out.print("<h1>");
		out.print(telling[randomValue]);
		out.println("</h1>");
		htl.footer(out);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
