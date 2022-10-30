import java.io.*;
import java.util.Locale;
import java.util.Scanner;
import java.util.*;
public class test {

public static void main(String[] args) throws IOException {
		
		try {
			wordanalysis t = new wordanalysis();
			t.readFileAndAnalyse("C:/Users/Dell/Videos/eng/txt.txt");
			System.out.println("=============================================");
			System.out.println(t.totalNoOfWords("data"));
			System.out.println("##########################################################");
		t.display();
		System.out.println("###########################################################");
		System.out.println(t.documentLength());
		System.out.println(t.uniqueWords());
		}catch(IOException e) {
			
		}
		
	}

}
		
		/*
		
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
		*/
		
		
	