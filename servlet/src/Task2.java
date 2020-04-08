

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
//日付表示用
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Task2
 */
@WebServlet("/Task2")
public class Task2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Task2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html; charset = UTF-8");
		PrintWriter out = response.getWriter();

		//日付表示設定
		Date today= new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

		out.println("<!DOCTYPE HTML>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset = UTF-8'>");
		out.println("<title>ServletTask</title>");
		out.println("</head>");
		out.println("<body>");
		out.print("<h1>");
		out.print("今日の日付: " + sdf.format(today));
		out.println("</h1>");
		out.println("</body>");
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
