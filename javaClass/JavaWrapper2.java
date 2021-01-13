package javaClass;

public class JavaWrapper2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer iValue = new Integer(10);

		System.out.println(iValue);

		int a = iValue.intValue();

		a += 10;
		
		iValue = new Integer(a+14);
		
		System.out.println(iValue);
	}

}
