import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuAppwithList {

	
	static Scanner Scanner = new Scanner (System.in); 
	static List<String> students = new ArrayList<String>(); 

	public static void main(String[] args) {
		
		int choice = 0; 
		
		while( choice != 4) {
			
			showMenu(); 
			
			choice = getUserChoice();
			if(choice == 1) {
				printStudentName (); 
			}else if(choice ==2 ) {
				addNewStudent();
			}else if(choice ==3) {
				deleteStudent(); 
			}else if (choice ==4) {
				System.out.println("Goodbye");
			}else {
				System.out.println("Please select a valid option.");
			}
			
		}
		
	}

	
	public static void showMenu() {
		System.out.println("1) Pring Student Names");
		System.out.println("2) Add new student");
		System.out.println("3) Delete Student at Postion");
		System.out.println("4) Exit ");
		System.out.println("-------------------------------");
	}
	
	public static int getUserChoice() {
		return Scanner.nextInt(); 
	}
	
	public static void printStudentName() {
		for ( String student: students) {
			System.out.println(student);
		}
	}
	
	public static void addNewStudent() {
		System.out.print("Enter the name you would like to add");
		String name = Scanner.next();
		students.add(name); 
		System.out.println("Student added: " + name);
	}
	
	public static void deleteStudent() {
		System.out.print("Enter the Index of the student you wish delete: ");
		int index = getUserChoice(); 
		if(index < students.size()) {
			students.remove(index); 
		}
	}
	
}
