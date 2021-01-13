package javaClass;

public class JavaObjectEquals2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IntEquals2 ieq1 = new IntEquals2(10);
		IntEquals2 ieq2 = new IntEquals2(20);
		IntEquals2 ieq3 = new IntEquals2(10);
				
		if(ieq1.equals(ieq2))
			System.out.println("같음!");
		else
			System.out.println("다름!");
	}

}

class IntEquals2 {
	int key1;

	IntEquals2(int key) {
		this.key1 = key;
	}

	public int printInt() {
		return key1;
	}

	public boolean equals(Object obj) {
		if (this.key1 == ((IntEquals2)obj).printInt())
			return true;
		else
			return false;
	}

}