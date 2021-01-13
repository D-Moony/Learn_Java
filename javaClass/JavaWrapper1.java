package javaClass;

public class JavaWrapper1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntWrapper1 wrap = new IntWrapper1(3);
		
		showData(wrap);
		showData(new IntWrapper1(7));
		
	}

	public static void showData(Object obj) {
		System.out.println(obj);
	}
	
}

class IntWrapper1 {
	private int num;
	
	public IntWrapper1 (int num) {
		this.num = num;
	}
	
	public String toString() {
		return ""+num;
	}
}