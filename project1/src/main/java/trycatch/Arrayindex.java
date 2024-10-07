package trycatch;

public class Arrayindex {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
try
{
int a[]= {1,2,3};
System.out.println(a[10]);
}catch(Exception e)
{
	System.out.println("array out of boundary");
}
System.out.println("exception handled");


	}

}
