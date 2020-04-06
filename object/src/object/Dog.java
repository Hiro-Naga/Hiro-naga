package object;

public class Dog extends Animal{
	double weight;

	//名前、年齢、体重を同時に設定するコンストラクタ
	public Dog(String name, int age, double weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
	}

	//runメソッド
	public void run() {
		System.out.println(this.name + "は走った");
	}

	//sleepメソッドのオーバーライド
	public void sleep() {
		super.sleep();								//オーバーロード前のものを呼び出し
		System.out.println(this.name + "は眠った");
	}

}
