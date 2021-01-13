package javaClass;

public class JavaObjectEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntEquals ieq1 = new IntEquals(10);
		IntEquals ieq2 = new IntEquals(20);
		IntEquals ieq3 = new IntEquals(10);
		
		if(ieq1.isEquals(ieq2))
			System.out.println("같음!");
		else
			System.out.println("다름!");
		if(ieq1.isEquals(ieq3))
			System.out.println("같음!");
		else
			System.out.println("다름!");
		
		ieq1 = ieq2;
		if(ieq1.equals(ieq2))
			System.out.println("같음!");
		else
			System.out.println("다름!");
		
	}

}

class IntEquals {
	private final int key;

	IntEquals(int key) {
		this.key = key;
	}

	public int printInt() {
		return key;
	}

	public boolean isEquals(IntEquals ieq) {
		if (this.key == ieq.printInt())
			return true;
		else
			return false;
	}

}