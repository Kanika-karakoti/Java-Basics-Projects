/* TO-DO-LIST  
 * 
 * PROBLEM STATEMENT:-
 * CREATE A COMMAND-LINE TO-DO-LIST APP IN JAVA THAT LETS USERS ADD,VIEW,AND DELETE TASKS DURING THE SESSIONS.
 * 
 * WHAT YOU'LL LEARN FROM THIS PROJECT:-
 * 1)USING ARRAYLIST FOR DYNAMIC LIST
 * 2)LOOPS AND SWITCH STATEMENTS.
 * 3)HANDLING USER INPUT WITH SCANNER
 * 4)STRUCTURING A BASIC CLI APP
 * 
*/
import java.util.Scanner;
import java.util.ArrayList;

class ToDoListApp{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<String> tasks = new ArrayList<>();//empty list
		int choice;
		String repeat;
		do
		{
			System.out.println("===== ENTER YOUR TO-DO-LIST IN MENU =======");
			System.out.println("1. View task");
			System.out.println("2. Add task");
			System.out.println("3. Delete task");
			System.out.println("4. Exist");
			
			System.out.println("Enter your choice number from (1 to 4): ");
			choice = sc.nextInt(); 
			sc.nextLine(); 
			
			//use switch case here
			switch(choice){
				case 1://view 
				if(tasks.isEmpty()){
					System.out.println("No, task yet!!!!");
				}else{
					for(int i = 0; i < tasks.size(); i++){
						System.out.println((i +1) + "." + tasks.get(i));
					}
				}
				break;
				
				case 2://add
				System.out.println("Enter the task: ");
				String task = sc.nextLine();
				tasks.add(task);
				System.out.println("Task added");
				break;
				
				case 3://Delete
				if(tasks.isEmpty()){
					System.out.println("No, task to delete !!!!");
				}else{
					for(int i = 0; i < tasks.size(); i++){
						System.out.println((i +1) + "." + tasks.get(i));
					}
					int index = sc.nextInt(); sc.nextLine();
					
					if(index > 0 && index <= tasks.size()){
						String remove = tasks.remove(index -1);
						System.out.println("Task is deleted now.");
						System.out.println("Deleted task was: "+ remove);
					}else{
						System.out.println("You enter invalid task!!!!");
					}
				}
				break;
				
				case 4://goodbye msg
				System.out.println("Good bye, have a sweet day");
				break;
				
				default:
				System.out.println("Invalid task try again.....");
			}
			
		}
		while(choice != 4);
			System.out.print("\nDo you want to start a new session? (yes/no): ");
            repeat = sc.nextLine().trim().toLowerCase();
		
		while(repeat.equals("yes")){
			System.out.println("Thanks for using the To-Do List App! Goodbye!");
			sc.close();
		}
	}
}