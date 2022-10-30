import java.io.*;
import java.util.Locale;
import java.util.Scanner;
import java.util.*;

public class wordanalysis {
	private String filename;
	private int n =0;
	private int m =0;
	private Scanner input;
	LinkedList<WordInformation> arrayOfDifferentLengths[] ;
	WordInformation sortedArray[];
	String rep = ",;'";

	public wordanalysis()throws FileNotFoundException,IOException {
		n=0;
		m=0;
		Scanner input=new Scanner(System.in).useLocale(Locale.US);
	}



	public void readFileAndAnalyse(String fn) throws IOException {
	    filename=fn; this.filename = fn; n=NoOfWords(fn);
	    int  k=maxLength(filename);
		arrayOfDifferentLengths = (LinkedList<WordInformation>[]) new LinkedList[k+1];
		//System.out.println(arrayOfDifferentLengths.length);
		for(int i=0;i<arrayOfDifferentLengths.length;i++) { arrayOfDifferentLengths[i] = new LinkedList<WordInformation>();}
		File f =new File(filename);
		input=new Scanner(f);
		int pos=1;
		int Line=1;
		String words[]=new String[n+1];
		Scanner in=new Scanner(System.in).useLocale(Locale.US);
		//to deal with all the words
		int x=0;
		//line
		int l=1;		
		Scanner input=new Scanner(f);
		input.useDelimiter("[^A-Z-a-z\u0027]+");
		while(input.hasNext()) {
			String s=input.next();
			words[x++]=s;
		}
		System.out.println("##########################################################################################################################");
		try (FileReader fr = new FileReader(filename);
				BufferedReader br = new BufferedReader(fr)) {
			
			String line;
			x=0;
			while((line = br.readLine()) != null) {
				WordInformation wi;
				WordOccurrence wo;
				System.out.println("line: "+Line);
				String[] s;
				//s.useDelimiter("[^A-Za-z]+");
				s=line.split(" ");
				System.out.println(line);
				for(int i=0;i<s.length;i++) {
					/*
					  
					 
					 */
					int len=words[x].length();
					System.out.println("LINE:"+Line);
					System.out.println("Position: "+ (pos));
					System.out.println("Words: "+words[x]);
					System.out.println("==================================================================");
					if(arrayOfDifferentLengths[words[x].length()] !=null && arrayOfDifferentLengths[words[x].length()].findWord(words[x])) {	
						//arrayOfDifferentLengths[s[i].length()].findLast();
						arrayOfDifferentLengths[words[x].length()].retrieve().occList.insert(wo = new WordOccurrence(Line, pos));
						arrayOfDifferentLengths[words[x].length()].retrieve().size = arrayOfDifferentLengths[words[x].length()].retrieve().size+1 ;
						System.out.println("a repeated word "+arrayOfDifferentLengths[words[x].length()].retrieve().word);
						//n++;
						pos++;
					}
					else {arrayOfDifferentLengths[words[x].length()].insert(wi = new WordInformation(words[x]));
				//	arrayOfDifferentLengths[s[i].length()].findLast();
					arrayOfDifferentLengths[words[x].length()].retrieve().occList.insert(wo = new WordOccurrence(Line, pos));
					arrayOfDifferentLengths[words[x].length()].increaseSize();
					System.out.println("The new Word: "+arrayOfDifferentLengths[words[x].length()].retrieve().word);
					pos++;
					//n++;
					m++;
					}
					System.out.println("==================================================================");
					x++;
				}
				Line++;
				pos=1;
				}
				
			
		} catch (IOException e) {
		
		}
		sortedArray=new WordInformation[m];
		
		

}

		
		
		
		
		

public void display() {
	for(int i =1; i<arrayOfDifferentLengths.length;i++) {
		
		System.out.println(i);
		arrayOfDifferentLengths[i].display();
	}
}
    //undone and we should throw
	public int totalWordsForLength(int len) {
		//int no=0;
		if(arrayOfDifferentLengths[len] !=null) {
			return arrayOfDifferentLengths[3].retrieve().size;
		}
		
		
		return 0;
	}
	public int totalNoOfWords(String s) {
		while(arrayOfDifferentLengths[s.length()] !=null && arrayOfDifferentLengths[s.length()].findWord(s))
			return arrayOfDifferentLengths[s.length()].retrieve().size;
		return 0;
	}
	public boolean checkAdjacent(String s1,String s2) {
		int len1=s1.length();
		int len2=s2.length();
		while(arrayOfDifferentLengths[len1] !=null && arrayOfDifferentLengths[len1].findWord(s1)) {
			
			
			
			while(arrayOfDifferentLengths[len2] !=null && arrayOfDifferentLengths[len2].findWord(s2)) {
				//if(arrayOfDifferentLengths[len1])
				
			}
			
			
		}
		
		return false;
	}
	//undone
	public void DisplayTheMost() {
		for(int i=0;i<sortedArray.length;i++) {
			System.out.println("Word"+sortedArray[i].word);
			System.out.println("total No. Of Words: "+sortedArray[i].size);
		}
	}
	//undone
	public LinkedList<WordOccurrence> ccurrences(String s) {
		if(arrayOfDifferentLengths[s.length()] !=null && arrayOfDifferentLengths[s.length()].findWord(s)) {
			return arrayOfDifferentLengths[s.length()].retrieve().getOccList();
		}
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//done list
	
	public int documentLength () {return n;} public int uniqueWords() {return m;}

	
	
	private int maxLength(String fn)throws FileNotFoundException,IOException {
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
	private int NoOfWords(String fn) throws FileNotFoundException {
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
