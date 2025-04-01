import java.sql.SQLOutput;
import java.util.Scanner;

public class Daniel {

    public static void main(String[] args) {
//        favoriteAnimalAndColor();
//        substringHW("Dublin Scioto High School");
//        hw3();
        hw4();
    }

    private static void hw4() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scanner.nextInt();

        if (num > 0) {
            System.out.println(num + " is positive");
        } else if (num < 0) {
            System.out.println(num + " is negative");
        } else {
            System.out.println(num + " is neither negative or positive");
        }

    }

    private static void hw3() {
        //You will be writing a program that is going to create a student's username based upon the first name, last name, and graduation year. Here are the steps you should follow:
        //Ask the user their first name (read their response into a String variable called 'first')
        //Ask the user their last name (read their response into a String variable called 'last')
        //Ask the user their graduation year. This should be read in as a String. (call this string variable gradYear)
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your first name?");
        String first = scanner.nextLine();
        System.out.println("What is your last name?");
        String last = scanner.nextLine();
        System.out.println("What year do you graduate?");
        String gradYear = scanner.nextLine();
        //Use the string methods that you have learned to create the username.
        // The username is a combination of the users first three letters from 'last', the underscore character, first initial from 'first',  and last two digits of 'gradYear.'
        // Andy Roh 2022
        // roh_a22
        // Daniel lee 2027
        // Lee_D27
        // Lee
        // 0123
        // Store the username in a String variable called 'username.' Note: you can assume the user has a last name of at least three characters
        String username = last.substring(0, 3) + "_" + first.substring(0,1) + gradYear.substring(2,4);
        //Output the username
        System.out.println(username);
        //Here is what the program looks like when running:
        //First name? Margot
        //Last name? Anderson
        //Graduation year? 2024
        //Your username is: And_M24
    }

    private static void substringHW2(String str) {
        //Read in the users favorite sport or activity into a variable called activity
        Scanner scanner = new Scanner(System.in);
        //Output a substring of activity by having the user enter the first start and the end of the substring to be outputted.
        System.out.println("What is your favorite sport/activty?");
        String favoriteActivity = scanner.nextLine();
        //Here is what the program should look like when it is running:
        //Favorite sport or activity? volleyball
        //Index of start of substring? 3
        System.out.println("Index of start of substring?");
        int startIndex = Integer.parseInt(scanner.nextLine());
        //Index of end of substring? 5
        System.out.println("Index of end of substring?");
        int endIndex = Integer.parseInt(scanner.nextLine());
        //The substring of volleyball from index 3 to 5 (inclusive) is ley
        System.out.println("The substring of " + favoriteActivity + " from index " + startIndex + " to " + endIndex + " (inclusive) is " + favoriteActivity.substring(startIndex, endIndex + 1));
        //PLEASE NOTE that we are counting the end index in our output!
    }

    private static void substringHW(String str) {
        // For you to do:
        // Dublin Scioto High School
        // 0123456789...
        // Output a substring of str starting at index 7 and going to the end
        System.out.println(str.substring(7));
        // Output a substring of str starting at index 0 and ending at index 5 (inclusive)
        System.out.println(str.substring(0,6));
        // Output a substring of str so that it outputs the word ‘Scioto’
        System.out.println(str.substring(7,13));
        // Output a substring of str so that it outputs ‘h S’
        System.out.println(str.substring(17,20));
    }

    private static void favoriteAnimalAndColor() {

        Scanner scanner = new Scanner(System.in);

        // Create the following String variables and assign a string:
        String favoriteAnimal = "Shark";
        String favoriteColor = "Red";

        // For each of the above Strings you are going to give the user two chances to guess a letter.
        // First attempt
        System.out.println("Guess a letter from my favorite animal!");
        String letter = scanner.nextLine();

        // If the letter is in the string you are going to tell them what position the letter is located.
        if (favoriteAnimal.contains(letter)) {
            System.out.println(letter + " is located at index: " + favoriteAnimal.indexOf(letter));
        } else { // If the letter is not in the string your program will say position 0
            System.out.println("Position 0");
            System.out.println("Here is another chance");
            letter = scanner.nextLine();

            if (favoriteAnimal.contains(letter)) {
                System.out.println(letter + " is located at index: " + favoriteAnimal.indexOf(letter));
            } else {
                System.out.println("Position 0");
            }
        }

        // Second attempt
        System.out.println("Guess a letter from my favorite color!");
        letter = scanner.nextLine();

        // If the letter is in the string you are going to tell them what position the letter is located.
        if (favoriteColor.contains(letter)) {
            System.out.println(letter + " is located at index: " + favoriteColor.indexOf(letter));
        } else { // If the letter is not in the string your program will say position 0
            System.out.println("Position 0");
            System.out.println("Here is another chance");
            letter = scanner.nextLine();

            if (favoriteColor.contains(letter)) {
                System.out.println(letter + " is located at index: " + favoriteColor.indexOf(letter));
            } else {
                System.out.println("Position 0");
            }
        }
    }

}
