package multilevelinheritance;

public class Sub extends Multi {
   int e;
   public void subtra()
   {
	 e=a-b;
	 System.out.println("sub="+e);
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Sub obj=new Sub();
     obj.add();
     obj.mul();
     obj.subtra();
	}

}
