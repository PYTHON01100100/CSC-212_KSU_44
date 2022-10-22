import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class ReadFromfile {
	
	String	filename;
	Scanner input;
	public ReadFromfile(String filename) throws FileNotFoundException,IOException {
		this.filename = filename;
		File f=new File(filename);
		input=new Scanner(f);
		
	}
	public int NoOfWords() {
		int max=0;
		input.useDelimiter("[^A-Z-a-z]+");	
		while(input.hasNext()) {
			input.next();
			max++;
		}
	return max;
}
	public void readFileAndAnalyse(String fn)throws FileNotFoundException,IOException {
		//this.filename = filename;
		int k;
		k=maxLength();
		File f=new File(fn);
		input=new Scanner(f);
		int n1=NoOfWords();
		System.out.println("======================================");
		DisplayTheTextFile();
		System.out.println("======================================");
		System.out.println("The max Length: "+(k)+"\nThe No. of words:"+(n1));
		//ArrayLitst d=new ArrayLitst(k+1);
		String words[]=new String[n1+1];
		Scanner in=new Scanner(System.in).useLocale(Locale.US);
		int x=0;
		int l=1;		
		Scanner input=new Scanner(f);
		input.useDelimiter("[^A-Z-a-z]+");
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
				System.out.println("line: "+l);
				String[] s;
				//s.useDelimiter("[^A-Za-z]+");
				s=line.split(" ");
				System.out.println(line);
				for(int i=0;i<s.length;i++) {
					int len=words[x].length();
					System.out.println("LINE:"+l);
					System.out.println("Position: "+ (x+1));
					System.out.println("Words: "+words[x]);
					System.out.println("==================================================================");
					x++;
				}
				l++;
			}
		} catch (IOException e) {
		}
		System.out.println("Done\n");
	}
	
	
	
	//to take the max length
	public int maxLength() {
		int max=0;
		input.useDelimiter("[^A-Za-z]+");	
		while(input.hasNext()) {
			int tmp=input.next().length();
			if(tmp>max) {max=tmp;}
		}
	return max;
}
	public void DisplayTheTextFile() {
		System.out.println("The text: \n");
		try (FileReader fr = new FileReader(filename);
				BufferedReader br = new BufferedReader(fr)) {
			String line;
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
		}
		
}

	
	public int getNoOfLines() {
		int l=1;
		try (FileReader fr = new FileReader(filename);
				BufferedReader br = new BufferedReader(fr)) {
			String line;
			while((line = br.readLine()) != null) {
				System.out.println(line);
				l++;
			}
		} catch (IOException e) {
			return 0;
		}
		//because it will not give the real no. of lines
		return l-1;
		
}
	
}
