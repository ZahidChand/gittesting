import java.io.*;
import java.util.*;
class Pattern2{
	public static void main(String[] args) {
		int i,j;
		int p;
		p = 5;
		for (i=1; i<=5; i++)
		 {
			for (j=1; j<=i; j++) 
			{
				System.out.print(p);
			}
				System.out.println("\n");
				p--;
				
		}
	}
}