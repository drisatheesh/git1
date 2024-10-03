package sampleprogram;

public class Instance {
 int x,y,z;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Instance obj=new Instance();
      obj.add(5,3);
      obj.avg();
	}
	public void add(int a,int b)
	{
		x=a;
		y=b;
		 z=x+y;
		System.out.println("sum="+z);
		//return z;
		
	}
	public void avg()
	{
		//p=c;
		//q=d;
		int m=z/2;
		System.out.println("avg="+m);
		//return m;
	}

}
