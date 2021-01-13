package javaClass;

public class JavaClass {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      
      /*생성자 오버로드*/
      
      Student st1 = new Student("문희찬",1,3);
      Student st2 = new Student("옥성현",1,2);
      
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
	   System.out.println("반 : "+ cl);
   }
   public void tellinfo()
   {
      System.out.println("이름 : "+ name);
      System.out.println("학년 : "+ gr);
   }
}