package method;

import java.util.Scanner;

public class Task2 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		double bottom = sc.nextDouble();
		double height = sc.nextDouble();
		sc.close();
		
		System.out.println("三角形の面積");
		double area = getTriangleArea(bottom, height);
		System.out.println(area);
	}
	
	//面積計算
	public static double getTriangleArea(double bot, double hei) {
		double ar = bot * hei / 2.0;
		double area = ((double)Math.round(ar) * 10 / 10);			//小数点第一位までで四捨五入
		return area;
	}

}
