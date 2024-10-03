package revision;

public class Main {
 static int a,b,c;
 public static int add(int x,int y)
 {
	 a=x;
	 b=y;
	  c=a+b;
	 return c;
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Main m=new Main();
    m.add(10, 15);
    System.out.println("sum:"+c);
	}

}
