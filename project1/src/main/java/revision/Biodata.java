package revision;

public class Biodata {

	 static String s,p;
	 static int i;
	 public static void display(String u,int v,String w )
	 {
		s=u;
		p=w;
		i=v;
		
	 }
	 static void print()
	 {
	   
		 System.out.println("name:"+s);
			System.out.println("id:"+i);
			System.out.println("place:"+p);
			
	 }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Biodata o=new Biodata();
     o.display("Drisya",15,"chathannoor");
     o.print();
	}

}
