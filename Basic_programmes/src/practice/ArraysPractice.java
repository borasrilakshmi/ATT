package practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ArraysPractice {
	public void frequecyofarray(int[] arr) {
		int size = arr.length;
		int[] arr1=new int[size];
		for(int l=0;l<arr1.length;l++) {
			arr1[l]=1;
		}
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(arr[i]==arr[j]) {
					arr1[i]=arr1[i]+1;
				}
			}
		}
		for(int k=0;k<arr1.length;k++) {
			System.out.println(arr1[k]);
		}
		
	}
	public void arrayelefreusingmap(int[] arr) {
		Map<Integer,Integer> hs=new HashMap();
		for(int i=0;i<arr.length;i++) {
			if(hs.containsKey(arr[i])) {
				hs.put(arr[i], hs.get(arr[i])+1);
			}
			else 
				hs.put(arr[i], 1);
		}
		System.out.println(hs);
	}
public void duplicateEleofArray(int[] arr) {
	System.out.println("duplicate Elements :::::");
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
		
			if(arr[i]==arr[j]) {
				System.out.print(arr[i]+" ");
			}
		}
	}
}

public void reverOfArray(int[] arr) {
	int[] arr1=new int[arr.length];
	for(int i=arr.length-1,j=0;i>=0;i--,j++) {
		arr1[j]=arr[i];
		
	}
	System.out.println("Reverse of elements is ::::");
	for(int a:arr1) {
		System.out.print(a+" ");
	}
	System.out.println();
	
}
public void largestEle(int[] arr) {
	int max=0 ; 
	for(int i=0;i<arr.length;i++) {
		  for(int j=i+1;j<arr.length-1;j++) {
			  if(arr[i]>max && arr[i]>arr[j]) {
					max=arr[i];
						}
			  else if(max<arr[j]) {
				  max=arr[j];
			  }
			
		  }
		
	}
	System.out.println("Max value :::"+max);
}
public void minValEle(int[] arr) {
	int min =arr[0] ; 
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length-1;j++) {
			if(arr[i]<=arr[j] && min>=arr[i]) {
				min=arr[i];
			}
			else if(min>=arr[j]) {
				min=arr[j];
			}
	}
		}
	System.out.println("The minmum value of array is :::"+min);
}

public void ascendingorderele(int[] arr) {
	int temp=0 ; 
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]>=arr[j]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp; 
			}
		}
		
	}
	System.out.println("Acending order of array elements is ::::");
	for(int a:arr) {
		System.out.print(a+" ");
	}
}
public void decendingorder(int[] arr) {
	int temp =0 ; 
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++){
			if(arr[i]<=arr[j])
				temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
	}
	System.out.println("Descending order of array elements is ::::");
	for(int a:arr) {
		System.out.print(a+" ");
	}
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArraysPractice obj=new ArraysPractice(); 
		int[] arr= {4,8,4,4,3,4,8,11,89,15};
		obj.frequecyofarray(arr);
		obj.arrayelefreusingmap(arr);
		obj.duplicateEleofArray(arr);
		obj.reverOfArray(arr);
		obj.largestEle(arr);
		obj.minValEle(arr);
		obj.ascendingorderele(arr);
		System.out.println();
		obj.decendingorder(arr);
		
	}

}
