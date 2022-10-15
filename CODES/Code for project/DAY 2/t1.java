import java.io.*;
import java.util.Scanner;

public class t1 {

	public static void main(String[] args) throws IOException{
		String	filename="C:/Users/Dell/Downloads/HOMEWORKS/txt.txt";
		String words[]=new String[100];
		int x=0;
		int l=1;
		File f=new File(filename);
		Scanner input=new Scanner(f);
		input.useDelimiter("[^A-Z-a-z]+");
		//input.useDelimiter(",");
		while(input.hasNext()) {
			String s=input.next();
			System.out.println(++x+","+l +":"+s);
		}
		/*
		while(input.hasNext()) {
			words[x++]=input.next();
			if(input.hasNextLine())
				l++;
		}
		*/
		/*
		for(int i=0;i<x;i++)
			System.out.println(" word "+(i+1)+", "+l+": "+words[i]);
			*/
	}

}
