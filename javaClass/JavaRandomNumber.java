package javaClass;

import java.util.Random;

public class JavaRandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();

		System.out.println(ran.nextInt(10));
		System.out.println("-------------------");
		ran = new Random(12);
		for (int i = 0; i < 11; i++)
			System.out.println(ran.nextInt(10));
		System.out.println("-------------------");
		ran = new Random(System.currentTimeMillis());
		System.out.println(ran.nextInt(10));
		System.out.println("-------------------");
		System.out.println(ran.nextInt(10));
	}

}
