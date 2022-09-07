package asa;

import static org.junit.Assert.*;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import org.junit.Test;

public class WriteFileClass {

	@Test
	public void test() throws IOException {
		Scanner sc=new Scanner(System.in);
		//String d=sc.nextLine();
			File fo=new File("Testdata//inputdatafile");
			FileWriter fr=new FileWriter(fo);
			   BufferedWriter br=new BufferedWriter(fr);  
			br.write(sc.nextLine());
		//	br.newLine();
			
		//	br.write("Automation");
			br.close();
	}

}
