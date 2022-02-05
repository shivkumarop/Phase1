package com.assistedproject;
import java.util.Scanner;    
import java.util.*; 
public class EmailId {
	public static void main(String[] args) {
		Boolean flag = false;
		String emails[] = new String[5];
		emails[0] = "shavishiv@gmail.com";
		emails[1] = "niranjanniru@gmail.com";
		emails[2] = "sumanthchinni@gmail.com";
		emails[3] = "mallikarjun@gmail.com";
		emails[4] = "dhanushdhanu@gmail.com";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Email: ");
		String userEmail = sc.next();
		
		for(String email:emails)
		{
			if(userEmail.matches(email))
			{
				System.out.println("Valid User");
				flag=true;
				break;
			}
		}
		if(flag==false)
		{
			System.out.println("Invalid User");
		}

	}
}
