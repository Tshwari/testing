package foreach;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {
	
	public void writeDataToFile(String filepath,String filename,String data) throws IOException
	{
		File f = new File(filepath+"/"+filename);
		FileWriter fw = new FileWriter(f);
		/*fw.write(data);
		fw.flush();
		fw.close();*/
		
		BufferedWriter bw = new BufferedWriter(fw);
		bw.newLine();
		bw.write("Hello World");
		bw.flush();
		bw.c
	}

	public void readDataFromFile(String filepath, String finename) throws IOException
	{
		File f = new File("C:/Users/Tswari.Rapeta/Desktop/SeleniumTstData.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		/*int i = fr.read();
		
		while(i != -1)
		{
			System.out.println(i);
			i = fr.read();
		}*/
		
		String s = br.readLine();
		while(s != null)
		{
			System.out.println(s);
			s = br.readLine();
		}
	}

	
}
