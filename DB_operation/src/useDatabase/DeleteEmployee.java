package useDatabase;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DeleteEmployee
 */
@WebServlet("/DeleteEmployee")
public class DeleteEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteEmployee() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//表示内容及び取得内容の文字コード指定
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset = UTF-8");

		//HTMLの内容取得
		int id = Integer.parseInt(request.getParameter("ID"));

		//データベース接続
		Connection con = null;
		try {
			//JDBCドライバの読み込み(MySQL)
			Class.forName("com.mysql.cj.jdbc.Driver");

			//データベースへの接続
			//ポート番号3306,DB名task1,ユーザーは初期(root,pass = "")
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/task1", "root", "");

			//delete
			String sql = "DELETE FROM employee WHERE id = ?";
			PreparedStatement ps = con.prepareStatement(sql);

			//?にHTMLから入力した各値を設定
			ps.setInt(1, id);

			//SQL文の結果取得
			int result = ps.executeUpdate();
			//HTMLで出力
			PrintWriter out = response.getWriter();
			out.println("<!DOCTYPE HTML>");
			out.println("<html>");
			out.println("<head>");
			out.println("<meta charset = 'UTF-8'>");
			out.println("<title>削除結果</title>");
			out.println("</head>");
			out.println("<body>");
			out.println(result + "行が削除されました");
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
