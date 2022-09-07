package com.SortMethods;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class UsingLoop {

	@Test
	public void sortMethod() {
		int a[]= {1,4,3,6,2};
		//For Loop
		for(int i=0;i<a.length;i++) {
			// Inner nested loop pointing 1 index ahead
			for(int j=i+1;j<a.length;j++) {
				//checking elements
				int temp=0;
				if(a[j]< a[i]) {
					//swapping
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					}
			
				}
			
			}System.out.print(Arrays.toString(a));
		}
	}


