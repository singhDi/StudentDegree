package students;

import students.StudentInterface;
import java.util.ArrayList;
import static java.lang.Double.sum;
import javax.swing.JOptionPane;
import java.util.*; 
import static javax.swing.Spring.sum;

public class StudentMainPage {

	public static double total;
	public static int choice;
	public static void displaySubMenu(){
		System.out.println();

	}

	public static void newAccount(){

		Scanner kb = new Scanner(System.in);
		Info st = new Info();



		System.out.println("\nCreate new Account, fill out information.");
		System.out.println("What type of student are you? "
				+ "\n1. Graduate"
				+ "\n2. UnderGraduate");
		choice = kb.nextInt();

		System.out.print("First Name: ");
		String newFname = kb.next();

		System.out.print("Last Name: ");
		String newLname = kb.next();

		System.out.println("Major: "  );
		String major = kb.next();

		System.out.print("Credits: ");
		double credits = kb.nextDouble();

		System.out.print("User Name: ");
		String userName = kb.next();

		System.out.print("Password: ");
		String newPass = kb.next();


		String result = st.addStudent(choice, newFname, newLname, newPass, major, credits);

		

		total = getInfo(st);
		if (choice == 1 && total < 9) {
			System.out.println("The student is Half time Graduate Student");
		}
		else if (choice == 2 && total < 12) {
			System.out.println("The student is Half time UnderGraduate Student");
		}
		else 

			System.out.println("The student is full time student");


		System.out.println(st.printStudentInfo());

	}
	public static double getInfo(Info b){
		double total = b.getTotalCredits();
		return total;
	}

	public static boolean studentExists(){   
		Info st = new Info();
		return false;
	}

	public static void main(String [] args){
		Scanner userInput = new Scanner(System.in);
		Boolean loggedIn = false;
		String Username,Password;
		int input1;
		do{
			do{
				System.out.println("_______________________________________________________________________"
						+ "\n Welcome to the Student Information System."
						+ "\n Are you an existing member? "
						+ "Or a new User?"
						+ "\n\n Enter: 1 (Login - Already have an account)"
						+ "\n Enter: 2 (Create new Account)"
						+ "\n Enter: 3 (Exit; Are you sure you would like to exit? )"
						+ "\n_______________________________________________________________________"
						+ "\n");

				System.out.print("Navigation Choice: ");
				input1 = userInput.nextInt();
				if(input1 < 1 || input1 > 3){
					JOptionPane.showMessageDialog(null, "Error: That is an invalid Choice");
				}
				switch(input1){
				case 1:      
					Scanner kb = new Scanner(System.in);  
					System.out.print("Username: ");
					String newUsername = kb.next();

					System.out.print("Password: ");
					String newPass = kb.next();

					int input2 = 0;
					while(input2 != 3) {
						System.out.println("\n Successfully Logged in as " + newUsername
								+ "\n\nOptions:"
								+ "\n       1. View your Student Info"
								+ "\n       2. Drop Credits"
								+ "\n       3. Exit the system: ");

						System.out.print("\nSelect Option: ");
						Scanner LoggedInUserInput = new Scanner(System.in);
						input2 = LoggedInUserInput.nextInt();

						if (input2 == 1) {
							System.out.println("Current Credits:" + total);

						}

						if (input2 == 2) {
							double dropcre = 0.0 ;
							System.out.print("Enter dropping credits: ");
							Scanner drop = new Scanner(System.in);
							dropcre = drop.nextInt();

							System.out.println("$" + dropcre + " has been dropped");
						
							System.out.println("\nCurrent Credits: " + (total - dropcre));
							total = total - dropcre;

						}

						if (input2 == 3 ){
							System.out.println("Thank you for using Student Information System!");

							System.exit(0);
						} 


					} 
					break;
				case 2: newAccount();
				while (loggedIn == false) {
					System.out.println("\nPlease re-enter your Username and Password for validation:");
					System.out.print("\nUsername: ");
					Username = userInput.next();

					System.out.print("Password: ");
					Password = userInput.next();

					loggedIn = true;
				}


				break;
				case 3: System.exit(0);
				break;
				}
			}while(input1 < 1 || input1 > 3);
		}while(input1 != 3);






	}
}