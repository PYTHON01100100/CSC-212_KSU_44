import java.io.*;
import java.util.Locale;
import java.util.Scanner;
import java.util.*;

public class wordanalysis {
	int m,n;
	int k;
	WordInformation SortedArray[];
	linkedList<WordInformation> arrayOfDifferentLengths[];
	String	filename;
	Scanner input;

	public wordanalysis()throws FileNotFoundException,IOException {
		n=0;
		m=0;
		Scanner input=new Scanner(System.in).useLocale(Locale.US);
	}



	public void readFileAndAnalyse(String fn)throws FileNotFoundException,IOException {
		//this.filename = filename;
		this.filename = fn; File f=new File(filename); input=new Scanner(f); int k; k=maxLength(fn);  this.n=NoOfWords(fn);
		 arrayOfDifferentLengths=new linkedList[(k+1)];
		 String words[]=new String[n+1];
		Scanner in=new Scanner(System.in).useLocale(Locale.US);
		//to deal with all the words
		int x=0;
		//line
		int l=1;		
		Scanner input=new Scanner(f);
		input.useDelimiter("[^A-Z-a-z]+");
		while(input.hasNext()) {
			String s=input.next();
			words[x++]=s;
		}
		try (FileReader fr = new FileReader(filename);
				BufferedReader br = new BufferedReader(fr)) {
			String line;
			x=0;
			while((line = br.readLine()) != null) {
				String[] s;
				s=line.split(" ");
				for(int i=0;i<s.length;i++) {
					insertTheWord(words[x], (x+1),l);
					int len=words[x].length();

					x++;
				}
				l++;
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	private void insertTheWord(String s, int pos,int line) {
		int in=s.length();
		if(arrayOfDifferentLengths[in].empty()) {
			WordInformation t=new WordInformation (s,new WordOccurrence(pos,line));
			arrayOfDifferentLengths[in].insert(t);
			this.m++;
			return;
		}
		
		arrayOfDifferentLengths[in].findFirst();
		while(!arrayOfDifferentLengths[in].retrieve().getWord().equalsIgnoreCase(s)) {
			if(!arrayOfDifferentLengths[in].last())
			arrayOfDifferentLengths[in].findNext();
		}
		if(!arrayOfDifferentLengths[in].retrieve().getWord().equalsIgnoreCase(s)) {
		WordInformation t=new WordInformation (s,new WordOccurrence(pos,line));
		arrayOfDifferentLengths[in].insert(t);
		this.m++;
		}
		else if(arrayOfDifferentLengths[in].retrieve().getWord().equalsIgnoreCase(s)) {
			arrayOfDifferentLengths[in].retrieve().addOcc(pos,line);
		}
		else {
			arrayOfDifferentLengths[in].retrieve().addOcc(pos,line);
		}
		
		}


		//undone
	public int totalWordsForLength(int len) {
		int no=0;
		
		return no;
	}
	public int totalNoOfWords(String s) {
		int no=0;
		
		return no;
	}
	public boolean checkAdjacent(String s1,String s2) {
		int len1=s1.length();
		int len2=s2.length();
		
		return false;
	}
	public void ccurrences(String s) {
		int len=s.length();
		arrayOfDifferentLengths[len].findFirst();
		while(!arrayOfDifferentLengths[len].last()) {
			if(arrayOfDifferentLengths[len].retrieve().getWord().equalsIgnoreCase(s)) {
				break;
			}
			
			arrayOfDifferentLengths[len].findNext();
		}
		while(!arrayOfDifferentLengths[len].last()) {

		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//done list
	
	public int documentLength () {return n;} public int uniqueWords() {return m;}

	
	
	public int maxLength(String fn)throws FileNotFoundException,IOException {
		this.filename = fn;
		File f=new File(filename);
		input=new Scanner(f);
		int max=0;
		input.useDelimiter("[^A-Za-z]+");	
		while(input.hasNext()) {
			int tmp=input.next().length();
			if(tmp>max) {max=tmp;}
		}
	return max;
}
	public int NoOfWords(String fn) throws FileNotFoundException {
		this.filename = fn;
		File f=new File(filename);
		input=new Scanner(f);
		int n=0;
		input.useDelimiter("[^A-Z-a-z]+");	
		while(input.hasNext()) {
			input.next();
			n++;
		}
	return n;
}

}
