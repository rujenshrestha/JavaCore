package com.javacore.filehandlingpractice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandlingExample {
	
	public static void main(String[] args){
		
		FileHandlingExample fileHndl = new FileHandlingExample();
		
		String fileName="User Info.txt";
		String filePath = "D:/Programming/Java/Java_Projects/JavaCore/src/com/javacore/filehandlingpractice/";
		File file = new File(filePath+fileName);
		
		//String content = fileHndl.getInfo();
		//fileHndl.writeToFile(file, content);
		
		fileHndl.readFromFile(file);
		
		//fileHndl.deleteFile(file);
	}
	
	
	public void readFromFile(File file){
		String line;
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			
			while((line = br.readLine()) !=null){
				System.out.println(line);
			}
			//System.out.println(line); //br.readLine() gives null at the end of file
				
		} catch (FileNotFoundException e) {
			System.out.println("File Reading FileNotFoundException: "+e);
		}catch (IOException e) {
			System.out.println("File Reading IOException: "+e);
		}
		
	}
	
	
	public void writeToFile(File file, String content){
		try {
			FileWriter fw = new FileWriter(file, true); // (File, Boolean Append)
			fw.write(content);
			fw.close();
			
		} catch (IOException e) {
			System.out.println("File Writing IOException: "+e);
		}
	}
	
	public void deleteFile(File file){
		if(file.delete()){
			System.out.println("File Deleted Succesfully");
		}else{
			System.out.println("Failed to delete the file: "+file.getName());
		}
	}
	
	public String getInfo(){
		StringBuilder sb = new StringBuilder();
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Your Full Name: ");
		sb.append("Name: "+input.nextLine()+"\r\n");
		System.out.print("Address 1: ");
		sb.append("Address: "+input.nextLine()+", ");
		System.out.print("Address 2: ");
		sb.append(input.nextLine()+", ");
		System.out.print("City: ");
		sb.append(input.nextLine()+", ");
		System.out.print("State: ");
		sb.append(input.nextLine()+", ");
		System.out.print("Country: ");
		sb.append(input.nextLine()+".\r\n");
		System.out.print("Contact: ");
		sb.append("Contact: "+input.nextLine()+"\r\n");
		System.out.print("Email: ");
		sb.append("Email: "+input.nextLine()+"\r\n");
		sb.append("\r\n"); // \r\n to move the cursor to a new line in file
		
		input.close();
		
		return sb.toString();
	}
	

}
