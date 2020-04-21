package useDatabase;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class search
 */
@WebServlet("/search")
public class search extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public search() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//表示内容及び取得内容の文字コード指定
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset = UTF-8");
		PrintWriter out = response.getWriter();

		//HTMLの入力内容取得
		String searchName = request.getParameter("name");

		//HTMLのheader-body部分
		out.println("<!DOCTYPE HTML>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset = 'UTF-8'>");
		out.println("<title>検索結果</title>");
		out.println("</head>");
		out.println("<body>");

		out.println("検索結果");

		//データベース接続
		Connection con = null;
		try {
			//JDBCドライバの読み込み(MySQL)
			Class.forName("com.mysql.cj.jdbc.Driver");

			//データベースへの接続
			//ポート番号3306,DB名task1,ユーザーは初期(root,pass = "")
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/task1", "root", "");

			//select
			String sql = "SELECT * FROM employee WHERE name LIKE ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, "%" + searchName + "%");

			//SQL文の結果取得・表示
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				int id = rs.getInt("id");
				out.println("ID：" + id + "<br>");
				String name = rs.getString("name");
				out.println("名前：" + name + "<br>");
				Date birthday = rs.getDate("birthday");
				out.println("生年月日：" + birthday + "<br>");
				int age = rs.getInt("age");
				out.println("年齢：" + age + "<br>");
			}
			ps.close();
			rs.close();

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
		out.println("</body>");
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
