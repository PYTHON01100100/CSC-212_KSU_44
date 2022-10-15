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
public class t4  {
		public static void main(String[] args) throws IOException {
			String	filename="C:/Users/Dell/Downloads/HOMEWORKS/txt.txt";
			ReadFromfile t=new ReadFromfile(filename);
			String words[]=new String[t.NoOfWords()+1];
			System.out.println(words.length);
			Scanner in=new Scanner(System.in).useLocale(Locale.US);
			int d;
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
						System.out.println(" word "+(x+1)+", "+l+": "+words[x]);
						x++;
					}
					l++;
				}
			} catch (IOException e) {
			}
			}}