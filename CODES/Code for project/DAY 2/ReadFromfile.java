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
	//to take the max length
	public int maxLength() {
		int max=0;
		input.useDelimiter("[^A-Z-a-z]+");	
		while(input.hasNext()) {
			int tmp=input.next().length();
			if(tmp>max)
				max=tmp;
		}
	return max;
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
	public void insertFromFile() throws FileNotFoundException,IOException {
		int w=maxLength();ArrayLitst d=new ArrayLitst(w+1);
		String words[]=new String[NoOfWords()+1];
		Scanner in=new Scanner(System.in).useLocale(Locale.US);
		int x=0;
		int l=1;
		File f=new File(filename);
		
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
				System.out.println("line: "+l);
				String[] s;
				//s.useDelimiter("[^A-Za-z]+");
				s=line.split(" ");
				System.out.println(line);
				for(int i=0;i<s.length;i++) {
					new WordOccurrence( l, x+1);
					x++;
				}
				l++;
			}
		} catch (IOException e) {
		}
		
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
				//System.out.println(line);
				l++;
			}
		} catch (IOException e) {
			return 0;
		}
		//because it will not give the real no. of lines
		return l-1;
		
}
	/*
	private void d1() {
		int l=1; int x=0; String words[]=new String[100];
		//input.useDelimiter("[^A-Za-z]+");
		try (FileReader fr = new FileReader(filename);
				BufferedReader br = new BufferedReader(fr)) {
			String line;
			while((line = br.readLine()) != null) {
				System.out.println("line: "+l);
				String[] s=line.split(" ");
				System.out.println(line);
				for(int i=0;i<s.length;i++) {
					System.out.println(" word "+(i+1)+", "+l+": "+s[i]);
					words[++x]=s[i];
				}
				l++;
			}
		} catch (IOException e) {
		}
	}
	*/
	//i don't need it
	/*
	private void D0() {
		int l=1;
		try (FileReader fr = new FileReader(filename);
				BufferedReader br = new BufferedReader(fr)) {
			String line;
			while((line = br.readLine()) != null) {
				System.out.println("line: "+l);
				String[] s=line.split(" ");
				System.out.println(line);
				for(int i=0;i<s.length;i++) {
					System.out.println(" word "+(i+1)+", "+l+": "+s[i]);
				}
				l++;
			}
		} catch (IOException e) {
		}
		
}
	*/
}
