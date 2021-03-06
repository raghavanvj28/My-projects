import java.util.Scanner;
public class PasswordValidation {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		int count1=0;
		int count2=0;int count3=0; int count4=0;
	System.out.println("Enter a password");
	System.out.println("");
	String password=sc.nextLine();
	int l=password.length();
	if(l>12)
	{
		System.out.println("Only 12 characters are allowed");
	}
	char a[]=password.toCharArray();
	int[] ascii = new int[password.length()];
	for(int i=0;i<password.length();i++) {
		ascii[i] = (int)a[i];
	}
		for(int j=0;j<password.length();j++) {
			
		 if(ascii[j]>=65 && ascii[j]<=96) {
			 count1++;
		 }
		 else if(ascii[j] >= 97 && ascii[j] <= 123) {
			 count2++;
		}
		 else if(ascii[j] >= 48 && ascii[j] <= 57) {
			 count3++;
		 }
		 else if(ascii[j]>=33 && ascii[j] <=47) {
			 count4++;
		 }
		 
		}
			if(count1==0)
			{
				System.out.println("Need atleast one capital fonts");
			}
			if(count2==0)
			{
				System.out.println("Need atleast one small fonts");
			}
			if(count3==0)
			{
				System.out.println("Need atleast one numerical character");
			}
			if(count4==0)
			{
				System.out.println("Need atleast one special character");
			}
			else {
				System.out.println("Password is valid");
			}
			
		}
		 
	}
			

		  
	



	


