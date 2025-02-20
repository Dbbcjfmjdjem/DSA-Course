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
	int N1 = sc.nextInt();
	int N2 = sc.nextInt();
	int N3 = sc.nextInt();
	int sum = N1+N2+N3;
	if(sum==180){
	    System.out.print("Triangle formed");
	}
	else{
	    System.out.print("Triangle not formed");
	}
	}
}
