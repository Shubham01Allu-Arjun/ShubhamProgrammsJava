 
public class Methods{
    public static int add(int n1, int n2)
    {
    	return(n1+n2);
    }   
     public static int mul(int n1, int n2) 
     {   
    		return(n1*n2);
     }
     public static int sub(int n1, int n2)
     {
    	 return(n1-n2);
     }
     public static int Div(int n1, int n2)
     {
    	 return(n1/n2);
     }
    		
    
	public static void main(String[] args)
	{
		int n1=20;
		int n2=10;
		
		
		System.out.println("add is:"+n1+"+"+n2+"="+add(n1,n2));
		System.out.println("mul is:"+n1+"+"+n2+"="+mul(n1,n2));
		System.out.println("sub is:"+n1+"+"+n2+"="+sub(n1,n2));
	    System.out.println("Div is:"+n1+"+"+n2+"="+Div(n1,n2));
		{
			
		}
	}

}
