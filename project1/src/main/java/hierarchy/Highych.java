package hierarchy;

public class Highych extends Higher {
int b=25;
public void add()
{
	System.out.println(a+b);
	}

public static void main(String[] args) {
	// TODO Auto-generated method stub
Highych ch=new Highych();
ch.display();
ch.add();
}
}
