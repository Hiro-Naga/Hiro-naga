package useDatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {

	public static void main(String args[]) {

		Connection con = null;
		try {
			//JDBCドライバの読み込み(MySQL)
			Class.forName("com.mysql.cj.jdbc.Driver");

			//データベースへの接続
			//ポート番号3306,DB名task1,ユーザーは初期(root,pass = "")
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/task1", "root", "");

			//接続成功時
			System.out.println("DB接続が成功しました。");

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
}
