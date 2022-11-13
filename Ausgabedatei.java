import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;


public class Ausgabedatei {
//ArrayList<Student> students = new ArrayList<Student>();
	
	public static void main(String args []) {
		
		File datei = new File("C:/Users/patri/Documents/files/klausur.csv");
		
		System.out.println(datei.isFile()); 
		List<Student> students = new ArrayList<Student>();
		
		Scanner scan = null;
		
		try {
		scan = new Scanner(datei);
		
		while(scan.hasNextLine()) {
			
			String line = scan.nextLine();
			String [] Tafelliste = line.split(";");
		    students.add(new Student(Integer.parseInt(Tafelliste[0]),Tafelliste[1],Tafelliste[2],Double.parseDouble(Tafelliste[3]))) ;
			 
		}
		
		}catch (FileNotFoundException exception) {
			
			System.out.println("Datei wurde nicht gefunden");
			
		}

		 System.out.println(students);
students.sort((a,b)->compareTo(a,b));
		}

	public static int compareTo(Student student1,Student student2){
		if(student1. getNote()==student2.getNote()){
			if(student1.getNachName().equals(student2.getNachName())){
				return  student1.getMatrikelNummer()-student2.getMatrikelNummer();
			}
			return student1.getNachName().compareTo(student2.getNachName());
		}
		return (int) (student1.getNote()-student2.getNote());
	}


}
	
	
	

