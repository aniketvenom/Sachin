public class ReverseString {
	
	public static void main(String args[])
	{
		String s1 = "where do you live";
		String reverse1="",reverse2="";
		
		String[] s2 = s1.split(" ");

		//first reverse
	        for(int i=s2.length-1;i>=0;i--)
		{
		
			reverse1 = reverse1 + s2[i] + " " ;
		}
		
		System.out.println(reverse1);

		//second reverse
		for(int i=s2.length-1;i>=0;i--)
		{
			for(int j=s2[i].length()-1;j>=0;j--)
			{
				reverse2 += s2[i].charAt(j);
			}
			reverse2 += " ";
		}
		
		System.out.println(reverse2);
	}

}
