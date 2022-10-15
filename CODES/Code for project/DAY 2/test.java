import java.io.*;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
import java.math.*;
import java.lang.Math;
import java.util.Scanner;
/*
 * diagram : https://app.diagrams.net/
 * 
 */
public class test  {
		public static void main(String[] args) throws IOException {
			String	filename="C:/Users/Dell/Downloads/HOMEWORKS/txt.txt";
			String words[]=new String[100];
			Scanner in=new Scanner(System.in).useLocale(Locale.US);
			int d;
			int x=0;
			int l=1;
			
			File f=new File(filename);
			ReadFromfile t=new ReadFromfile(filename);
			Scanner input=new Scanner(f);
			input.useDelimiter("[^A-Za-z]+");
			
		}}