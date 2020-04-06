package object;

public class Person {
	//フィールド　名前と年齢はprivate設定(課題3)
	//名前
	private String name = "";
	//年齢
	private int age = 0;
	//財布(課題2)、静的フィールドでの実装
	static int wallet = 0;

	//コンストラクタ(課題1)
	//引数なしの場合
	public Person(){
		System.out.println("名前・年齢未定義");
	}
	//引数あり(nameとageを引数に)
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}

	//お財布に入力した数字分を追加するインストラクタ(課題2)
	public Person(int wallet){
		this.wallet += wallet;
	}

	//myProfile
	public void myProfile() {
		System.out.println("私の名前は" + this.name + "です。");
		System.out.println("私の年齢は" + this.age + "です。");
		System.out.println("よろしくお願いします。");
	}

	//getter・setter(課題3)
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	//課題2確認用
	public static void main(String args[]) {
		System.out.println("コンストラクタを生成していない状態");
		System.out.println(Person.wallet);

		//インスタンス生成
		Person hoge01 = new Person(1000);
		Person hoge02 = new Person(2000);

		System.out.println("インスタンスhoge01でwalletにアクセス");
		System.out.println(hoge01.wallet);
		System.out.println("インスタンスhoge02でwalletにアクセス");
		System.out.println(hoge02.wallet);
		System.out.println("クラスPersonでwalletにアクセス");
		System.out.println(Person.wallet);

	}
}
