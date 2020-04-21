package useDatabase;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class register
 */
@WebServlet("/register")
public class register extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public register() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//表示内容及び取得内容の文字コード指定
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset = UTF-8");

		//String→Date用
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
		String birth = request.getParameter("birthday");

		//HTMLの入力内容取得
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		//Dateに関してはutil→sqlの変換が必要
		java.util.Date ubirth = new Date();
		try{
			ubirth = sdf.parse(birth);
		}catch(ParseException e){
			e.printStackTrace();
		}
		java.sql.Date sbirth = new java.sql.Date(ubirth.getTime());
		int age = Integer.parseInt(request.getParameter("age"));

		//データベース接続
		Connection con = null;
		try {
			//JDBCドライバの読み込み(MySQL)
			Class.forName("com.mysql.cj.jdbc.Driver");

			//データベースへの接続
			//ポート番号3306,DB名task1,ユーザーは初期(root,pass = "")
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/task1", "root", "");

			//insert
			String sql = "INSERT INTO employee (id, name, birthday, age) VALUES (?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);

			//?にHTMLから入力した各値を設定
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setDate(3, sbirth);
			ps.setInt(4, age);

			//SQL文の結果取得
			int result = ps.executeUpdate();
			//HTMLで出力
			PrintWriter out = response.getWriter();
			out.println("<!DOCTYPE HTML>");
			out.println("<html>");
			out.println("<head>");
			out.println("<meta charset = 'UTF-8'>");
			out.println("<title>入力結果</title>");
			out.println("</head>");
			out.println("<body>");
			out.println(result + "行が追加されました");
			out.println("</body>");
			out.println("</html>");

			//close
			ps.close();

		//接続失敗処理
		}catch(SQLException e){				//DB接続失敗等
			e.printStackTrace();
		}catch(ClassNotFoundException e) {		//JDBCドライバが見つからない時
			e.printStackTrace();
		}finally {
			//データベース切断
			if(con != null) {
				try {
					con.close();
				}catch(SQLException e) {		//DB切断失敗時
					e.printStackTrace();
				}
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
