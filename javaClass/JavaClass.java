package javaClass;

public class JavaClass {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      
      /*������ �����ε�*/
      
      Student st1 = new Student("������",1,3);
      Student st2 = new Student("������",1,2);
      
      st1.tellinfo();
      st1.tellclass();
      
      st2.tellinfo();
      
   }

}

class Student
{
   private int gr;
   private int cl;
   private String name;

   
   public Student(String name, int gr, int cl)
   {
      this.gr = gr;
      this.name = name;
      this.cl = cl;
   }

   public void tellclass() {
	   System.out.println("�� : "+ cl);
   }
   public void tellinfo()
   {
      System.out.println("�̸� : "+ name);
      System.out.println("�г� : "+ gr);
   }
}