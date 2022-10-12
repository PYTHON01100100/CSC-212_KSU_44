import java.io.*;
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
		input.useDelimiter("[^A-Za-z]+");	
		while(input.hasNext()) {
			int tmp=input.next().length();
			if(tmp>max)
				max=tmp;
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
}
