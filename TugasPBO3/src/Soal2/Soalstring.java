package Soal2;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Soalstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc = new Scanner(System.in);
		 
		 /*Menggunakan next() bukan nextLine() supaya karakter setelah spasi tidak dibaca*/
	 
		 
		 String s1 = sc.next();
		 int a = sc.nextInt();
		 System.out.println(" ");
		 String s2 = sc.next();
		 int b = sc.nextInt();
		 System.out.println(" ");
		 String s3 = sc.next();
		 int c = sc.nextInt();
		 
		 
		 System.out.println("================================");
		 System.out.printf("%-15s %03d\n", s1, a);
		 System.out.printf("%-15s %03d\n", s2, b); //-15 untuk memberi space pada kanan string
		 System.out.printf("%-15s %03d\n", s3, c); //03 untuk memberikan angka 0 apabila kurang dari 3 digit
		 System.out.println("================================");
	        
	        
		
		

	}

}
