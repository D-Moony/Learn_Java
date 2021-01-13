package javaClass;

public class JavaConstructerOverload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*생성자 오버로드*/
		
		Food fd = new Food(300,"밥");
		Food fd1 = new Food(60,"귤",true);
		
		fd.tellinfo();
		fd1.tellinfo();
		
	}

}

class Food
{
	private int kcal;
	private String name;
	private boolean vitaminC = false;
	
	public Food(int kcal, String name, boolean vitaminC)
	{
		this.kcal = kcal;
		this.name = name;
		this.vitaminC = vitaminC;
	}
	
	public Food(int kcal, String name)
	{
		this.kcal = kcal;
		this.name = name;
	}

	public void tellinfo()
	{
		System.out.println("이름 : "+ name);
		System.out.println("칼로리 : "+ kcal);
		if(vitaminC == true)
			System.out.println("비타민C 있음");
		else
			System.out.println("비타민C 없음");
	}
}
