package dataOperation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Result
 */
@WebServlet("/Result")
public class Result extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Result() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//表示内容及び取得内容の文字コード指定
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset = UTF-8");
		//HtmlTemplate使用
		HtmlTemplate htp = new HtmlTemplate();
		PrintWriter out = response.getWriter();

		//各内容取得
		String name = request.getParameter("name");
		String sex = request.getParameter("sex");
		String questType = request.getParameter("questionType");
		String questCont = request.getParameter("questionContent");

		htp.header(out);
		out.println("<p>" + "以下の内容でお問い合せしました。回答をお待ちください。" + "</p>");
		out.println("<p>" + "名前：" + name + "様" + "</p>");
		out.println("<p>" + "性別：" + sex + "</p>");
		out.println("<p>" + "お問合せ種類：" + questType + "</p>");
		out.println("<p>" + "お問合せ内容：" + questCont + "</p>");
		htp.footer(out);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
