package object;

//継承元・課題4～用
public class Animal {
	//名前
	String name;
	//年齢
	int age;

	//コンストラクタ
	public Animal() {};
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	//眠る
	public void sleep() {
		System.out.println("眠った");
	}
}
