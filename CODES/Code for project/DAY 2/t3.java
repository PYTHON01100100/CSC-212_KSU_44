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
public class t3  {
		public static void main(String[] args) throws IOException {
			String	filename="C:/Users/Dell/Downloads/HOMEWORKS/txt.txt";
			String words[]=new String[100];
			Scanner in=new Scanner(System.in).useLocale(Locale.US);
			int d;
			int x=0;
			int l=1;
			
			File f=new File(filename);
			ReadFromfile t=new ReadFromfile(filename);
			System.out.println(t.NoOfWords());
			Scanner input=new Scanner(f);
			input.useDelimiter("[^A-Za-z]+");
			System.out.println("Slam alykom");
			do{
				System.out.println("=======================================================================================================");
				System.out.println("How can I serve you? :");
				System.out.println("1: display the text.");
				System.out.println("2: give me the max length.");
				System.out.println("3: give The No. Of lines.");
				System.out.println("-1: to exit.");
				System.out.println("=======================================================================================================");
				d=in.nextInt();
				if(d==1) {t.DisplayTheTextFile();}
				else if(d==2) {System.out.println("The max length is: "+t.maxLength());}
				else if(d==3) {System.out.println("The No of lines is: "+t.getNoOfLines());}
				else {System.out.println("please try againe!!!!!!!");}
				if(d!=-1) {
				System.out.println("=======================================================================================================");
				System.out.println("Do you want to try more: \n AnyNo:Yes \n Exit:-1");
				System.out.println("=======================================================================================================");
				d=in.nextInt();
				}
				if(d==-1) {System.out.println("========================================="); System.out.println("good bye");}
			}while(d!=-1);			
		}}