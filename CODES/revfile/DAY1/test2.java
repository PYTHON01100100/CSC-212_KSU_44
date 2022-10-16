import java.io.*;
import java.util.Scanner;
/*
 * diagram : https://app.diagrams.net/
 * 
 */
public class test2  {
		public static void main(String[] args) throws IOException {
			String	filename="C:/Users/Dell/Downloads/HOMEWORKS/txt.txt";
			String words[]=new String[100];
			ReadFromfile3 t=new ReadFromfile3();
			
			
			System.out.println("");
			t.readFileAndAnalyse(filename);
			
			
		}}