package practice;

public class Numbers {
static	int n1=0,n2=1,n3=0,sum=1;
	public void fibnaciwithoutusingrecursion(int count) {
		int n1=0,n2=1,n3; 
		System.out.print(n1+" "+n2+" ");
		for(int i=2;i<count;i++) {
			n3=n1+n2; 
			n1=n2;n2=n3;
			System.out.print(n3+" ");
		}
	}
	public void fibnaciUsingRecursion(int count) {
		if(count>0) {
			n3=n1+n2; 
			n2=n1;
			n1=n3; 
			System.out.print(" "+n3);

			fibnaciUsingRecursion(count-1);

		}
	}
	
	public void primenumber(int num) {
		int count=0;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				count=1;
				break;
			}
		}
		if(count==1) {
			System.out.println("Given number is not a prime Number");

		}
		else {
			System.out.println("Given number is  a prime number");

		}
		
	}
	public void palindram(int num) {
		int temp=num,rev=0;
		while(num>0) {
			rev=rev*10+(num%10);
			num=num/10;
		}
		if(temp==rev) {
			System.out.println("The given number is palandram");
		}
		else {
			System.out.println("The given number is not a palandram");
		}
	}
	
	public void factorial(int num) {
		int sum=1;
       for(int i=num;i>0;i--) {
    	   sum=sum*i;
       }		
       System.out.println("The factorial of numer "+num+" is ::"+sum);
		
	}
	public void factoialUsingRecursion(int num) {
		if(num>0) {
			sum=sum*num;
			factoialUsingRecursion(num-1);
		}
	}
	public void armstrongNum(int num) {
		int sum=0,temp=num,rev=0;
		while(num>0) {
			rev=num%10;
			sum=sum+(rev*rev*rev);
			num=num/10;
		}
		if(sum==temp) {
			System.out.println("The given number "+temp+" is Armstrong number");
		}
		else 
			System.out.println("The given number "+temp+" is not Armstrong number");

	}
	public static void main(String[] args) {
		Numbers obj=new Numbers(); 
		obj.fibnaciwithoutusingrecursion(10);
		System.out.println();
		System.out.print(obj.n1+" "+obj.n2 );
		obj.fibnaciUsingRecursion(8);
		System.out.println();
		obj.primenumber(4);
		obj.palindram(112);
		obj.factorial(5);
		obj.factoialUsingRecursion(4);
		System.out.println("The factorial of a number using recursion::"+sum);
		obj.armstrongNum(18);
	}

	
}
