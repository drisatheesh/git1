package superkeyword;

public class Superchild extends Super {
 public void print()
 {
	 System.out.println(super.c);
	 
 }
 public Superchild()
 {
	 super();
	 super.display();
	 
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Superchild obj=new Superchild();
  obj.print();
  //obj.Superchild();
  
	}

}
