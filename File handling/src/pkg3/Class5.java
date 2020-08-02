package pkg3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Class5
{
	 public static void main(String[] args) throws IOException 
	 {
		 File f = new File("C:\\Users\\\\Dell\\Desktop\\DummyManish.txt");
		 FileReader fr = new FileReader(f);
		 BufferedReader br = new BufferedReader(fr);
		 File f1 = new File("C:\\Users\\Dell\\Desktop\\DummyManish\\txt1.txt");
		 FileWriter fw = new FileWriter(f1);
		 BufferedWriter bw = new BufferedWriter(fw);
		 
		 String a;
		 
		 while((a=br.readLine())!=null) 
		 {
			 bw.write(a);
			 bw.newLine();
		  }
		 bw.close();
		 
			 
			 
		}
		
}
