package javaClass;

import java.math.BigDecimal;

public class JavaWrapper4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigDecimal e1 = new BigDecimal("1.6");
		BigDecimal e2 = new BigDecimal("3.5");
		
		System.out.println(e1.add(e2));
		System.out.println(e1.multiply(e2));
	}

}
