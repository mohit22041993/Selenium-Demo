package com.utility;

public class testing {
   
	public static void main(String[] args) {
		int[] a={1,1,5,5,6,6,7,2};
		int[] s;
		for(int i=0;i<a.length-1;i++)
		{
			 for(int j=i+1;j<a.length;j++)
			 {
				 
				 if((a[i]==a[j])&&(i!=j))
				 {
					 
					 System.out.println(a[j]);
				 }
				 
			 }
			System.out.println(a[i]);
		}

	}

}
