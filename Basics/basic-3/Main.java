/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	if(N>=90){
	    System.out.print("Grade A");
	}
	else if(N>=80){
	    System.out.print("Grade B");
	}
	else if(N>=60){
	      System.out.print("Grade c");
	}
	else if(N>=35){
	      System.out.print("Grade D");
	}
	
	else{
	     System.out.print("fail");
	}
	}
}
