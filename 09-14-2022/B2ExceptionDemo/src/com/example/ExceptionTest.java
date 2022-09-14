package com.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionTest {
	public static String readFileContent(String filename) throws IOException{
			FileReader fr=new FileReader(filename);
			BufferedReader br=new BufferedReader(fr);
			String s="";
			StringBuilder sb=new StringBuilder();
		
			while((s=br.readLine())!=null) {
				sb.append(s);
				sb.append("\n");
			}
		
		return sb.toString();
			
	}
	
	public static void main(String[] args) {
		
		try {
			String s=readFileContent("D:\\java-my-soul\\Batch2-JavaOurSoul\\java-our-soul-batch-2\\09-14-2022\\B2ExceptionDemo\\ReadMe.txt");
			System.out.println(s);
		} catch(IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.err.println(e);
		}
		System.out.println("end of main");
	}

}
