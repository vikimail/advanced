
package org.array;

public class Teating{
	
	public static void main(String[] args) {
		
	//single dimensional Array	
		int a[]= new int[8];
		
		
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=14;
		
		a[5]=88;
		a[6]=77;
		a[7]=55;
		
		for(int i = 0;i<6;i++) {
			System.out.println(a[i]);
		}
		//for each
		for(int i :a) {
			System.out.println(i);
		}
		
		
		
			 }
	
}