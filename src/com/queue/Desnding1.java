package com.queue;

public class Desnding1 {

	public static void main(String[] args) {
	  int a[]={12,34,56,10,100,105,5};
	    int temp;
	    for (int i = 0; i < a.length; i++) {
			
		  for (int j = i+1; j < a.length; j++) {
			
		      if(a[i]<a[j])
		      {
		    	  temp=a[i];
		    	  a[i]=a[j];
		    	  a[j]=temp;
		      }
		  
		  }
	    System.out.println(a[i]);
	    }

	}

}
