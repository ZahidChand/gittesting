import java.io.*;
import java.util.*;
class Pattern7{
	public static void main(String[] args) {
		int i,j;
		int p;
		for (i=1; i<=5; i++)
		 {
			p = 1;
			for (j=1; j<=i; j++) 
			{
				System.out.print(" "+p+" ");
				p=p+2;
			}
				System.out.println("\n");
				
		}
	}
}