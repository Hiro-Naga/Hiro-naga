package instance;

//課題1部分
public class Person {
	String name;
	int age;

//課題3用myProfileメソッド
	public void myProfile(){
		System.out.println("私の名前は"+ this.name + "です。");
		System.out.println("年齢は" + this.age + "です。");
		System.out.println("よろしくお願いします。");
	}

}