package interfaceexample;

public class Interface implements Inter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Interface obj=new Interface();//interface objectname=new classname
     Inter ob=new Interface();
     obj.display();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		int c=a+b;
		System.out.println(c);
	}

}
