public class Main
{
	public static void main(String[] args) {
	    
	    String str1="abc";
	    String str2="";
	    for(int i=str1.length()-1;i>=0;i--)
	    {
	      str2=str2+Character.toString(str1.charAt(i));
	    }
		System.out.println("After Reverse: "+str2);
	}
}
