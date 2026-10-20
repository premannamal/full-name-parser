import java.util.*;
public class FullNameParser {
    public static void main(String[] args) {
        System.out.println("Enter the first last name or first middle last name");
        Scanner scanner = new Scanner(System.in);
        String Name = scanner.nextLine();
        // System.out.println(Name);
        int wordCount = Name.trim().split("\\s+").length;
        // System.out.println(wordCount);

        String[] name_array = Name.split(" ");

        if (wordCount > 2) {
            System.out.println("first name: " + name_array[0]);
            System.out.println("middle name: " + name_array[1]);
            System.out.println("last name: " + name_array[2]);
        }
        else {
            System.out.println("first name: " + name_array[0]);
            System.out.println("last name: " + name_array[1]);
        }

    }
}