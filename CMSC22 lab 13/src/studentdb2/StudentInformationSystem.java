package studentdb2;

import java.util.*;
import java.io.*;

class StudentInformationSystem {
	private static final String FILE_NAME = "db.ser";
	private static List<Student> studentInfoList = new ArrayList<Student>();
	private static Scanner sc = new Scanner(System.in);

	public static void main(String args[]) throws IOException {
		// Load Contents
		loadContents("db.txt");

		// User Inputs
		int option;
		boolean exit = false;

		while(!exit) {
			System.out.println("1. Register");
			System.out.println("2. Search");
			System.out.println("3. Delete");
			System.out.println("4. Save");
			System.out.println("5. Exit");
			System.out.print("Choose an option: ");
			option = sc.nextInt();
			System.out.println();

			if(option == 1) {
				try {
					register();
				} catch(StudentNumberAlreadyExistsException ex) {
					System.out.println(ex.getInfo());
				}
			} else if(option == 2) {
				retrieve();
			} else if(option == 3) {
				delete();
			} else if(option == 4) {
				save();
			} else {
				exit = true;
			}
			System.out.println("========================================");
		}
		System.out.println("Bye!");
	}

	@SuppressWarnings("unchecked")
	public static void loadContents(String inputFile) {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
		try {
			// DESERIALIZATION...
            File fin = new File(FILE_NAME);
            if(fin.length() == 0) {
                // file is emtpy!!
                System.err.println("FILE IS EMPTY");
                System.exit(-1);
            }
            
            fis = new FileInputStream(fin);
            ois = new ObjectInputStream(fis);

            studentInfoList = (List<Student>) ois.readObject();
            
            ois.close();
        } catch (IOException e) {
            // standard file handling exception
            e.printStackTrace();
        } catch (ClassNotFoundException ce) {
            // this might be thrown by ois.readObject()
            ce.printStackTrace();
        } finally {

	            // make sure to close the files!
	            try {
	                fis.close();
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
        	}
		}

	public static void register() throws StudentNumberAlreadyExistsException {
		sc.nextLine();
		System.out.print("Student Number: ");
		String studentNumber = sc.nextLine();

		for(Student isko : studentInfoList) {
			if(isko.getStudentNumber().equals(studentNumber)) {
				throw new StudentNumberAlreadyExistsException(studentNumber);
			}
		}

		System.out.print("First Name: ");
		String firstName = sc.nextLine();

		System.out.print("Middle Initial: ");
		char middleInitial = sc.next().charAt(0);

		sc.nextLine();
		System.out.print("Last Name: ");
		String lastName = sc.nextLine();

		System.out.print("Program: ");
		String course = sc.nextLine();

		System.out.print("Year Level: ");
		int yearLevel = sc.nextInt();
		
		System.out.print("Crush name: ");
		String crushName = sc.nextLine();
		
		System.out.print("Favorite Subject Code: ");
		String courseCode = sc.nextLine();
		
		System.out.print("Favorite Subject Description: ");
		String courseDescription = sc.nextLine();
		
		Student isko = new Student(studentNumber, firstName, middleInitial, 
										 lastName, course, yearLevel, crushName, courseCode, courseDescription);
		studentInfoList.add(isko);
		System.out.println("Student added!");
	}

	public static void retrieve() {
		System.out.print("Search Student: ");
		String studentNumber = sc.next();
		Student retrievedStudent = null;

		for(Student isko : studentInfoList) {
			if(isko.getStudentNumber().equals(studentNumber)) {
				retrievedStudent = isko;
				break;
			}
		}
		System.out.println(retrievedStudent);
	}

	public static void delete() {
		System.out.print("Delete Student: ");
		String studentNumber = sc.next();

		for(Student isko : studentInfoList) {
			if(isko.getStudentNumber().equals(studentNumber)) {
				studentInfoList.remove(isko);
				break;
			}
		}

		System.out.println("Student " + studentNumber + " deleted!");
	}

	public static void save() throws IOException {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        
		try{
			
			// SERIALIZATION...
	        File fout = new File(FILE_NAME);
	        fos = new FileOutputStream(fout);
	        oos = new ObjectOutputStream(fos);
	        oos.writeObject(studentInfoList);
	        oos.close();
        	
		} catch (IOException e) {
	        // standard file handling exception
	        e.printStackTrace();
	    } finally {
	        // make sure to close the files!
	        try {
				fos.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
			System.out.println("Saved.");
		}
}