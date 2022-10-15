import java.io.*;
import java.util.Scanner;

public class t2 {

	public static void main(String[] args) throws IOException{
		String	filename="C:/Users/Dell/Downloads/HOMEWORKS/txt.txt";
		String words[]=new String[100];
		ReadFromfile t=new ReadFromfile("C:/Users/Dell/Downloads/HOMEWORKS/txt.txt");
		int x=0;
		int l=1;
		int no=1;
		File f=new File(filename);
		Scanner input=new Scanner(f);
		//input.useDelimiter("[^A-Za-z]+");
		try (FileReader fr = new FileReader(filename);
				BufferedReader br = new BufferedReader(fr)) {
			String line;
			while((line = br.readLine()) != null) {
				System.out.println("line: "+l);
				String[] s;
				//s.useDelimiter("[^A-Za-z]+");
				s=line.split(" ");
				System.out.println(line);
				for(int i=0;i<s.length;i++) {
					System.out.println(" word "+(no)+", "+l+": "+s[i]);
					words[++x]=s[i];
					no++;
				}
				l++;
			}
		} catch (IOException e) {
		}
		System.out.println("===================================================================================================================================");
		l=1;
	for(int j=1;j<=x;j++) {
		System.out.println(" word "+(j)+": "+words[j]);}
	}

}
