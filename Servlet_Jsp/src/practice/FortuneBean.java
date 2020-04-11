package practice;

import java.io.Serializable;
import java.util.Date;

public class FortuneBean implements Serializable {

	//プライベートフィールド
	private Date today = new Date();
	private String Fortune = "";

	//引数なしのコンストラクタ
	public FortuneBean() {};

	//getter,setter
	public Date getToday() {
		return this.today;
	}
	public String getFortune() {
		return this.Fortune;
	}
	public void setToday(Date date) {
		this.today = date;
	}
	public void setFortune(String fortune) {
		this.Fortune = fortune;
	}

}
