import java.util.*;

public class Students {

    public static void main(String[] args) {
        System.out.println("Enter number of students:");
        Scanner scnr = new Scanner(System.in);
        int numStudents = scnr.nextInt();
        String[] student = new String[numStudents];
        int[] age = new int[numStudents];
        Scanner scnrName = new Scanner(System.in);
        Scanner scnrAge = new Scanner(System.in);
        for(int i = 0; i < numStudents; i++){
            System.out.println("Enter name: ");
            student[i] = scnrName.nextLine();
            System.out.println("Enter age.");
            age[i] = scnrAge.nextInt();
        }
        for(int i = 0; i < numStudents; i++){
            if(age[i] >= 15) {
                System.out.println(student[i] + " can receive a vaccine.");
                System.out.println("The student is above the age limit being " + age[i]);
            }
        }
        scnr.close();
        scnrName.close();
        scnrAge.close();
        }
}
