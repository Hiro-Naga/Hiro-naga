package dataOperation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CountCookie
 */
@WebServlet("/CountCookie")
public class CountCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public CountCookie() {
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
		int times = 1;	//回数確認用

		/*	cookieがない場合cookie生成
		 * 	ある場合は値を確認
		 */

		htp.header(out);
		out.println("<h1>" + "訪問回数テスト（クッキー）" + "</h1>");

		//nullチェック
		Cookie[] cookies = request.getCookies();
		if(cookies != null) {
			for(int i = 0; i < cookies.length; i++) {
				if(cookies[i].getName().equals("Visiter")) {
					times = Integer.parseInt(cookies[i].getValue()) + 1;
					//cookieの値更新
					cookies[i].setValue(Integer.toString(times));
					response.addCookie(cookies[i]);
				}else {
					//"Visiter"がない場合も"Visiterの"Cookie作成
					Cookie cookie = new Cookie("Visiter", "1");
					//有効期限設定(5分→300s)
					cookie.setMaxAge(300);
					//cookieの保存
					response.addCookie(cookie);
				}
			}
		}else {
			//Cookie作成
			Cookie cookie = new Cookie("Visiter", "1");
			//有効期限設定(5分→300s)
			cookie.setMaxAge(300);
			//cookieの保存
			response.addCookie(cookie);
		}

		if(times == 1) {
			out.println("<p>" + "初めての訪問です。" + "</p>");
		}else {
			out.println("<p>" + times + "回目の訪問です。" + "</p>");
		}

		//再訪問部分
		out.println("<a href = /dataOperation/CountCookie>" + "画面を再訪問" + "</a>");
		htp.footer(out);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
