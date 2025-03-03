import net.bytebuddy.agent.builder.AgentBuilder.InitializationStrategy.SelfInjection.Split;

public class reverse {

	public static void main(String[] args) {
		String a="Try programiz.pro";
		String Res="";
		String[] arr=a.split(" ");
		for(int i=0;i<arr.length;i++)
		{
			
			
			
			String r=reser(arr[i]);
			Res=Res+" "+r;
			
			
		}
        
		System.out.println(Res);
	}
	public static String reser(String s)
	{
		String r="";
		char ch;
		 for(int i=0;i<s.length();i++)//0
		        
	        {
	            
	             ch=s.charAt(i);
	            r=ch+r;
	        }
	        //System.out.println(r);
			return r;
	}

}
