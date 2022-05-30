package oopsLis;

import java.util.Scanner;
import java.lang.Exception;
class UsernameException extends Exception{
	UsernameException(String msg){
		System.out.print(msg);
	}
}
class PasswordException extends Exception{
	PasswordException(String msg){
		System.out.print(msg);	
	}
}

public class UserNamepass {
	public static void main(String[]args) {
		Scanner reader=new Scanner(System.in);
		String username,password;
		System.out.print("enter username:");
		username=reader.nextLine();
		System.out.print("enter password:");
		password=reader.nextLine();
		int len=username.length();
		try {
			if(len<8)
				throw new UsernameException("username must be greater than 8 characterers\n");
			else if(!password.equals("admin"))
				throw new PasswordException("Incorrect password\n");
			else
				System.out.println("login successful");
		}
		catch (UsernameException u) {
			System.out.println(u);
		}
		catch (PasswordException p) {
			System.out.println(p);
		}
	}
}
