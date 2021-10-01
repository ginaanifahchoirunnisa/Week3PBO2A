package Soal1;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Pertama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		String a = input.nextLine();//=> untuk mengambil inputan dari user
		
		/*
		 *trim() , digunakan untuk menghapus Whitespace sebelum atau sesudah suatu string
		 *split, untuk men-split atau membagi string dari suatu karakter tertentu
		 *String[]arr => akan menampung hasil dari trim dan split yang telah dilakukan program 
		 * */
        String[]arr = a.trim().split("[ !,?._'@]+");
        
        /*
         * ArrayList<String> berbeda dengan array biasa
         * Perbedaannya adalah:
         * array biasa apabila kita menghapus/menambah elemen maka tidak akan mengubah ukurannya
         * ArrayList , akan berubah ukuran ketika kita menambah atau mengurangi isi dari array
         */
        ArrayList<String>listOfStrings = new ArrayList<String>(Arrays.asList(arr));
        
        //untuk mengetahui berapa banyak elemen dari array 
        System.out.println(listOfStrings.size());
  
      for(String str:listOfStrings){
        System.out.println(str);
      }

	}
}
