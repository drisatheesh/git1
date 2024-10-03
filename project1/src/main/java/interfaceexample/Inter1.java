package interfaceexample;

public class Inter1 implements Inter,Newint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Newint obj=new Inter1();
    Inter obj1=new Inter1();
    obj.print();
    obj1.display();
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("drisya");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(32);
	}

}
