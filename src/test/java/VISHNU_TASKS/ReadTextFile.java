package VISHNU_TASKS;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.Test;

public class ReadTextFile {
	
	
	FileReader fr=null;
	BufferedReader br=null;
	
	String readLine;
	
	String filePath;
	
	StringBuffer sb=new StringBuffer();
	
	String line;
	
	public StringBuffer readTextFile(String filepath) throws IOException
	{
		
		try {
			fr=new FileReader(filepath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		br=new BufferedReader(fr);
		
		
		
		while((readLine=br.readLine())!=null){
			
			line=readLine;
			
			sb.append(line+"\n");
		}
		
		//System.out.println(line);
		
		return sb;
		
		
	}
	
	@Test
	public void VeriftBranchCode() throws IOException {
		
		StringBuffer sb1=readTextFile(".//files//dataFile.txt");
		
		System.out.println(sb1);
		
		Assert.assertTrue(sb1.toString().contains("BranchCode4"));
		
		System.out.println("BranchCode 4 is found in the file generated");
		
	}
	


}
