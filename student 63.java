import java.util.*;
class Student 
{
    	String name;
    	int regNumber;
    	int[] marks = new int[5];
	void getDetails() 
	{
        	Scanner scanner = new Scanner(System.in);
       		System.out.print("Enter student name: ");
        	name = scanner.nextLine();     
        	System.out.print("Enter register number: ");
        	regNumber = scanner.nextInt();
        	System.out.println("Enter marks for five subjects:");
        	for (int i = 0; i < 5; i++) 
		{	
			System.out.print("Subject " + (i + 1) + " marks: ");
            		marks[i] = scanner.nextInt();
                 }
    	}

    	void calculate() 
	{
        int total = 0;
        for (int mark : marks) 
	{
            total += mark;
        }
        double average = (double) total / marks.length;
        System.out.println("\nStudent Details:");
        System.out.println("Name: " + name);
        System.out.println("Register Number: " + regNumber);
        System.out.println("Marks in five subjects:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Subject " + (i + 1) + " marks: " + marks[i]);
        }
        System.out.println("Total marks: " + total);
        System.out.println("Average marks: " + average);
    }
    public static void main(String[] args) {
        Student student = new Student();
        student.getDetails();
        student.calculate();
    }
}