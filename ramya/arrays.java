package day6;

import java.util.Arrays;

public class arrays {

	public static void main(String[] args) {
		//approach 1: declaring+adding values
		/*int a[]=new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;*/
		
		//approach 2: declaring+adding values
		
		int a[]= {10, 20, 30, 40, 50};
		
		//3 find size of an array
	     System.out.println(a.length);   //5
		
		//4 read single value from an array
		System.out.println(a[2]);               //30
		System.out.println(a[4]);               //50
		System.out.println(a[0]);               //10
		System.out.println(a[3]);               //40
		System.out.println(a[1]);    //20
		
		//5) read multiple values from an array 
		//System.out.println(Arrays.toString((a)));               // [10, 20, 30, , 50]
		for (int i=0; i<5; i++)
		{
			System.out.println(a[i]);
		}

}
	
}
