package object;

public class Main {
	//mainクラス
	public static void main(String args[]) {

		//課題5
		String name = "ポチ";
		int age = 5;
		double weight = 12.3;
		Dog pochi = new Dog(name, age, weight);
		Animal dog = new Animal(name, age);

		//表示
		System.out.println("名前: " + pochi.name);
		System.out.println("年齢: " + pochi.age + "歳");
		System.out.println("体重" + pochi.weight + "kg");

		pochi.run();
		dog.sleep();			//オーバーライド前の呼び出しをしたいためAnimalクラスで設定
		pochi.sleep();
	}

}
