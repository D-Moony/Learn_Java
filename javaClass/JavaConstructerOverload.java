package javaClass;

public class JavaConstructerOverload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*������ �����ε�*/
		
		Food fd = new Food(300,"��");
		Food fd1 = new Food(60,"��",true);
		
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
		System.out.println("�̸� : "+ name);
		System.out.println("Į�θ� : "+ kcal);
		if(vitaminC == true)
			System.out.println("��Ÿ��C ����");
		else
			System.out.println("��Ÿ��C ����");
	}
}
