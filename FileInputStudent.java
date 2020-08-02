package FileInputStudentList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileInputStudent {
	
	void getStudentInfo() throws IOException {
		Scanner sc=new Scanner(System.in);
		char response;
		String data="";
		
		do {
		System.out.println("Enter your name:");
		String name=sc.nextLine();
		
		System.out.println("Enter phone number:");
		String phone=sc.nextLine();
		
		System.out.println("Enter roll number:");
		String rollNo=sc.nextLine();
		
		System.out.println("Enter your address:");
		String address=sc.nextLine();
		
		data="name="+name+";phone="+phone+";rollNo="+rollNo+";address="+address+";\n";
		
		File file = new File("Student.txt"); 
		file.createNewFile();
		FileWriter writer=new FileWriter(file,true);
		
		BufferedWriter buffer = new BufferedWriter(writer);
		
		  PrintWriter pw=new PrintWriter(buffer);
		  pw.write(data);
		  pw.close();
		  
		  System.out.println("\nContinue? [y/n]: ");
	        response = sc.nextLine().charAt(0);

		}while(response != 'n');
	}
	
	void displayStudentList() throws IOException {
		File file = new File("Student.txt");
		  BufferedReader br = new BufferedReader(new FileReader(file)); 
		  String st;
		  List<Student> list = new ArrayList<>();
		  
		  while ((st = br.readLine()) != null) {
			  String[] splited=st.split(";");
				  
				  String n=splited[0].split("=")[1];
				  String p=splited[1].split("=")[1];
				  String r=splited[2].split("=")[1];
				  String add=splited[3].split("=")[1];
				  
				  list.add(new Student(n,p,r,add));
		  }
		  for(int i=0; i<list.size(); i++) {
			  System.out.println("Name:\t"+list.get(i).getName());
			  System.out.println("PhoneNo:"+list.get(i).getPhone());
			  System.out.println("RollNo:\t"+list.get(i).getRollNo());
			  System.out.println("Address:"+list.get(i).getAddress());
			  System.out.println();
		  }
		  
		  br.close();
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		  FileInputStudent student=new FileInputStudent();
		  student.getStudentInfo();
		  student.displayStudentList();
	}
}
