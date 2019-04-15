package testcases;

public class smallestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String words[] = {"cap","car","cat"};
		
		for(int i=0; i<words.length; i++)
		{
			String str = words[i];
			String k = "";
			for(int j= (str.length())-1; j>=0; j--)
			{
				k = k + str.charAt(j);			
			}
			System.out.println(k);
		}
		
		
		
		
		int a[] = {1,2,3,4,5,0};
		
		int smallestnumber = a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<a[0])
			{
				smallestnumber = a[i];
			}
		}
		System.out.println(smallestnumber);

	}

}
