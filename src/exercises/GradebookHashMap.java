package exercises;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GradebookHashMap {
    public static void main(String[] args) {
        HashMap<String, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String idNumber;

        System.out.println("Enter your Id numbers (or ENTER to finish):");

        // Get student names and grades
        do {

            System.out.print("ID: ");
            idNumber = input.nextLine();

            if (!idNumber.equals("")) {
                System.out.print("Name: ");
                String name = input.nextLine();
                students.put(idNumber, name);

                // Read in the newline before looping back
                input.nextLine();
            }

        } while(!idNumber.equals(""));

    }
}
