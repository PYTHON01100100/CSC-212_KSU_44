import java.io.*;
import java.util.Locale;
import java.util.Scanner;
import java.util.*;
public class test {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		/*
		String	filename="C:/Users/Dell/Videos/eng/txt.txt";
		wordanalysis l=new wordanalysis();
		l.readFileAndAnalyse(filename);
		System.out.println(l.documentLength());
		System.out.println(l.uniqueWords());
		
		*/
		
		Scanner input=new Scanner(System.in).useLocale(Locale.US);
		int d=0;
		linkedList<String> l=new linkedList<String>();
		String s;
		do {
			System.out.println("enter word");
			s=input.next();
			l.insert(s);
			System.out.println("cont:");
			d=input.nextInt();
		}while(d!=-1);
		l.display();
		System.out.println("=======================================================================================");
		l.displayTheCurrent();
		
		
		
	}

}
