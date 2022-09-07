package asa;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import org.junit.AfterClass;
import org.junit.Ignore;
import org.junit.Test;

public class CreateFile {
	// CREATING A NOTEPAD FILES
	@Test
	public void Atest() throws IOException {
		File fi=new File("TestData//i");
	if(fi.createNewFile()) {
		System.out.println("Notepad path"+fi.getAbsolutePath());
	}else {
	System.out.println("Exist");}
	}
	//wRITING DATA IN THE NOTEPAD FILE
	@Test
	public void Btest() throws IOException {
		Scanner sc=new Scanner(System.in);
		//String d=sc.nextLine();
			File fo=new File("TestData//i");
			FileWriter fr=new FileWriter(fo);
			   BufferedWriter br=new BufferedWriter(fr);  
			   System.out.println("WRITE THE DATA IN THE NOTEPAD");
			br.write(sc.nextLine());
		//	br.newLine();
		//	br.write("Automation");
			br.close();
	}
	// READING DATA IN THE NOTEPAD FILE
	@Test
	public void Ctest() throws IOException {
	File fi=new File("TestData//i");
	FileReader fr=new FileReader(fi);
	   BufferedReader bi=new BufferedReader(fr);  
	String data=bi.readLine();
	System.out.println("READING DATA IN THE NOTEPAD DATA IS---"+data);
	bi.close();}
	@AfterClass
	public static void method11() {
		File fi=new File("TestData//i");
		if(fi.delete()) {
			System.out.println( "Delete the file "+ fi.getName());
		}
		else {
			System.out.println("Failed to Delete File");
		}
}
	}
	
