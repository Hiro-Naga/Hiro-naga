package dataOperation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class countSession
 */
@WebServlet("/countSession")
public class countSession extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public countSession() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//文字コード指定
		response.setContentType("text/html; charset = UTF-8");
		//HtmlTemplate使用
		PrintWriter out = response.getWriter();
		HtmlTemplate htp = new HtmlTemplate();
		//回数確認用
		int times = 1;

		//セッション取得
		HttpSession session = request.getSession();

		//以前のセッションがある場合
		if(session != null) {
			//sessionのデータ有無で場合分け
			if(session.getAttribute("visit") != null) {
				//セッションの情報取得、回数を更新・保存したいのでint型
				times = (Integer)session.getAttribute("visit") + 1;
			}
		}
		//以前のセッション有無にかかわらずデータを再設定(以前のものがない場合ここで設定)
		session.setAttribute("visit", times);

		htp.header(out);
		out.println("<h1>" + "訪問回数テスト（セッション）" + "</h1>");

		if(times == 1) {
			out.println("<p>" + "初めての訪問です。" + "</p>");
		}else {
			out.println("<p>" + times + "回目の訪問です。" + "</p>");
		}

		//再訪問部分
		out.println("<a href = /dataOperation/countSession>" + "画面を再訪問" + "</a>");
		htp.footer(out);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
