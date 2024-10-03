package accessmodifier;

public class Access {
    public void print()
    {
      System.out.println("public method");	
    }
    private void display()
    {
     System.out.println("private");	
    }
    protected void printl()
    {
     System.out.println("protected");	
    }
    void defaultex()
    {
    System.out.println("default");	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Access obj=new Access();
      obj.print();
      obj.display();
      obj.printl();
      obj.defaultex();
      
	}

}
