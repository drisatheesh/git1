package sampleprogram;

public class Buffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     StringBuffer b=new StringBuffer("Drisya");
     b.insert(3, "o");
     System.out.println(b);
     b.replace(1, 3, "p");
     System.out.println(b);
     b.delete(1, 3);
     System.out.println(b);
     b.reverse();
     System.out.println(b);
     //b.repla
     
	}

}
