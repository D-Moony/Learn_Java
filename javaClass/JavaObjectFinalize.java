package javaClass;

public class JavaObjectFinalize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalizeTest ft1 = new FinalizeTest("¾È³ç");
		FinalizeTest ft2 = new FinalizeTest("HI");
		
		ft1 = null;
		ft2 = null;
		
		System.gc();
		System.runFinalization();
		
	}

}

class FinalizeTest {
	String name;
	
	public FinalizeTest(String name) {
		this.name = name;
	}
	
	protected void finalize() throws Throwable{
		super.finalize();
		System.out.println("Á¾·á");
	}
	
}