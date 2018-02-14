
package random.code;

import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class RandomCode {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Welcome to random code practice.");
        
        System.out.println("\nWhat would you like to do?");
        System.out.println("Enter 1 for a string exercise");
        System.out.println("Enter 2 for an average number calculator");
        System.out.println("Enter 3 for a BMI calculator");
        System.out.println("Enter 4 for an area calculator");
        System.out.println("Enter 5 for a CKI quiz");
        System.out.println("Enter 6 for a loan calculator");
        System.out.println("Enter 7 to find out your zodiac");
        System.out.println("Enter 8 for the Magic 8 Ball");
        System.out.println("Enter 9 for the Date & Time");
        System.out.println("Enter 10 for a quadratic root calculator");
        System.out.print("Choice: ");
        byte choice = input.nextByte();
        
          
        switch (choice) {
            //String Exercise
            case 1:
                System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                System.out.println("^^^^^^^^^^^^^^^^^^^^^^^Welcome to string exercises!^^^^^^^^^^^^^^^^^^^^");
                System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                
                System.out.println("\nHere in string exercises you will be playing "
                        + "around with the fuctions of strings.");
                System.out.print("To start off, please enter a word that you'd like"
                        + " to be used in this exercise: ");
                String word = input.next();
                
                System.out.println("\nGreat! The word that you typed is: " + word);
                System.out.println("\nNow please input what you would like to"
                        + " do with the word you typed");
                
                System.out.println("\nChoices are: ");
                System.out.println("\t1: Print");
                System.out.println("\t2: Length of String");
                System.out.println("\t3: Character At");
                System.out.println("\t4: Concat");
                System.out.println("\t5: To Lower Case");
                System.out.println("\t6: To Upper Case");
                System.out.println("\t7: Trim");
                System.out.println("\t8: Substring");
                System.out.print("\nChoice: ");
                byte stringChoice = input.nextByte();
                
                switch (stringChoice) {
                    //Print
                    case 1: 
                        System.out.println("\nYou chose to print the word you inputted");
                        System.out.println("The word that you inputted was: " + word);
                        System.out.println("\nThank you for using string exercises!");
                        break;
                        
                    //Length of String
                    case 2: 
                        System.out.println("\nYou chose to find the length of the string");
                        System.out.println("The length of the word, " + word + 
                                ", is " + word.length() + " letters long");
                        System.out.println("\nThank you for using string exercises!");
                        break;
                        
                    //Character At
                    case 3: 
                        System.out.println("\nYou chose to find the character at a "
                                + "specific spot");
                        System.out.print("Please enter the location in which "
                                + "you'd want to know the letter for: ");

                        byte character = input.nextByte();
                        System.out.println("\nThe location that you chose was, "
                                 + character + ", which is " + word.charAt(character) + " in "
                                         + "the word," + word);
                        System.out.println("\nThank you for using string exercises!");
                        break;
                        
                    //Concat
                    case 4:
                        System.out.println("\nYou chose concat!");
                        System.out.print("Enter a word that you would like to "
                                + "concatenate with the word,: " + word + " ");
                        String concat = input.next();
                        System.out.println("The words concatenated together is, "
                                + word.concat(concat));
                        System.out.println("\nThank you for using string exercises!");
                        break;
                        
                    //To Lower Case 
                    case 5:
                        System.out.println("\nYou chose to lowercase all words");
                        System.out.println("Your word all lowercased is : " + word.toLowerCase());
                        System.out.println("\nThank you for using string exercises!");
                        break;
                        
                    //To Upper Case 
                    case 6: 
                        System.out.println("\nYou chose to uppercase all words");
                        System.out.println("Your word all uppercased is : " + word.toUpperCase());
                        System.out.println("\nThank you for using string exercises!");
                        break;
                        
                    //Trim    
                    case 7: 
                        System.out.println("\nYou chose to trim the whitespaces in the words");
                        System.out.println("Your word trimmed is : " + word.trim());
                        System.out.println("\nThank you for using string exercises!");
                        break;
                        
                    //Substring
                    case 8: 
                        System.out.println("\nYou chose to substring part of the word you chose");
                        System.out.print("Please enter two values that you would like to substring: ");
                        byte sub1 = input.nextByte();
                        byte sub2 = input.nextByte();
                        String sub = word.substring(sub1, sub2);
                        System.out.println("The substring of the word " + word +
                                " from " + sub1 + " to " + sub2 + " is " + sub);
                        System.out.println("\nThank you for using string exercises!");
                        break;
                        
                    //End program if non-valid answer
                    default:
                        System.out.print("\nI'm sorry, that is an invalid choice. Please "
                        + "restart the program.");
                        break;
                }
                
                break;
                
            //Average Number Calculator    
            case 2:
                System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                System.out.println("^^^^^^^^^^^^^^^^^^^^^^Wecome to AVG Number Calculator!!^^^^^^^^^^^^^^^^");
                System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                System.out.println("\nThe AVG Number Calculator will average numbers "
                        + "up to 5 different combinations");
                System.out.print("Please enter the amount of numbers you want to average: ");
                byte number = input.nextByte();
                
                switch (number) {
                    //Averaging 1 number
                    case 1: 
                        System.out.print("Please enter the one number that you would like to average: ");
                        double average1 = input.nextDouble();
                        average1 = average1 / 1; 
                        System.out.println("\nThe average of these two numbers is: " + average1);
                        System.out.println("\nThank you for using AVG Number Calculator!");
                        break;
                    //Averaging 2 number
                    case 2:
                        System.out.print("Please enter the two numbers that you would like to average: ");
                        double average2 = input.nextDouble();
                        average2 = input.nextDouble() + average2;
                        average2 = average2 / 2; 
                        System.out.println("\nThe average of these two numbers is: " + average2);
                        System.out.println("\nThank you for using AVG Number Calculator!");
                        break;
                        
                    //Averaging 3 numbers 
                    case 3: 
                        System.out.print("Please enter the three numbers that you would like to average: ");
                        double average3 = input.nextDouble();
                        average3 = input.nextDouble() + average3;
                        average3 = input.nextDouble() + average3;
                        average3 = average3 / 3; 
                        System.out.println("\nThe average of these three numbers is: " + average3);
                        System.out.println("\nThank you for using AVG Number Calculator!");
                        break; 
                    
                    //Averaging 4 numbers     
                    case 4: 
                        System.out.print("Please enter the four numbers that you would like to average: ");
                        double average4 = input.nextDouble();
                        average4 = input.nextDouble() + average4;
                        average4 = input.nextDouble() + average4;
                        average4 = input.nextDouble() + average4;
                        average4 = average4 / 4; 
                        System.out.println("\nThe average of these four numbers is: " + average4);
                        System.out.println("\nThank you for using AVG Number Calculator!");
                        break;
                        
                    //Averaging 5 numbers    
                    case 5: 
                        System.out.print("Please enter the five numbers that you would like to average: ");
                        double average5 = input.nextDouble();
                        average5 = input.nextDouble() + average5;
                        average5 = input.nextDouble() + average5;
                        average5 = input.nextDouble() + average5;
                        average5 = input.nextDouble() + average5;
                        average5 = average5 / 5; 
                        System.out.println("\nThe average of these five numbers is: " + average5);
                        System.out.println("\nThank you for using AVG Number Calculator!");
                        break; 

                    default: 
                        System.out.println("\nI'm sorry, that is an invalid choice. Please "
                        + "restart the program.");
                        break;
                }
                
                
                
                break;
            
            //BMI Calculator    
            case 3:
                System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                System.out.println("^^^^^^^^^^^^^^^^^^^^^^^Welcome to BMI Calculator!^^^^^^^^^^^^^^^^^^^^^^");
                System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                
                //Asks user for imperial or metric scale
                System.out.print("Compute BMI in \"metric\" or \"imperial\"?: ");
                String scale = input.next();
                
                double BMI = 0;
        
                /***********************************************************************
                 ******************************IMPERIAL*********************************
                 **********************************************************************/
        
                //string of code asking the user to input their height in feet and inches
                if ("imperial".equals(scale)) { 
                    System.out.print("Please enter height in feet and inches: "); //prints out a request for users to enter height
                    double heightft = input.nextDouble(); //prompts user for height in ft
                    double heightina = input.nextDouble(); //prompts user for height in in based on the initial ft input
                    double heightinb = (heightft * 12); //int varibale that converts the ft inputted by user into inches 
                    double heightin = (heightina + heightinb); //int variable condensing the inches in to one variable name
        
                    //string of code asking the user to input their weight in lbs
                    System.out.print("Please enter weight in pounds: "); //prints out a request for users to enter weight
                    double weightlb = input.nextDouble(); //prompts user for weight in lbs
        
                    //string of code computing the BMI based on the measurements given by the user
                    //BMI is calculated by: (703 * [weight in lbs] / [height in inches]^2
                    BMI = (703.0F * weightlb) / (heightin * heightin); //calcualtes the BMI with the given variables
                    }
        
                /***********************************************************************
                 ********************************METRIC*********************************
                 **********************************************************************/
        
                else if ("metric".equals(scale)) {
                    System.out.print("Please enter height in centimeters: "); //prints out a request for users to enter height
                    double heightcm = input.nextDouble(); //prompts user for height in ft
                    double heightm = (0.01) * (heightcm);
        
                    //string of code asking the user to input their weight in kgs
                    System.out.print("Please enter weight in kilograms: "); //prints out a request for users to enter weight
                    double weightkg = input.nextDouble(); //prompts user for weight in kgs
        
                    //string of code computing the BMI based on the measurements given by the user
                    //BMI is calculated by: ([weight in kg] / [height in meter]^2)
                    BMI = (weightkg) / (heightm * heightm); //calcualtes the BMI with the given variables
                    }
                
                /***********************************************************************
                 **********************************BMI**********************************
                 **********************************************************************/
                String results = null;
                
                if (BMI < 18.5){
                    results = "underweight";
                }
                else if (BMI >= 18.5 && BMI < 25) { 
                    results = "healthy";
                }
                else if (BMI >= 25 && BMI < 30) { 
                    results = "overweight"; 
                }
                else if (BMI >= 30) {
                    results = "obese";
                }
                //Prints out BMI statement
                System.out.println("\nYour BMI is: " + BMI + ", which means that you are " + results + "!");
        
        
                //ending statement of the program
                System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                System.out.println("^\tThank you for using the BODY MASS INDEX (BMI) Calculator.");
                System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^"); 
                    break;
            
            //Area Calculator
            case 4:
                System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                System.out.println("^^^^^^^^^^^^^^^^^^^^^ ^^Welcome to Area Calculator!^^^^^^^^^^^^^^^^^^^^");
                System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                
                System.out.println("\nShape choices: Square, Rectangle, Circle, Triangle, "
                    + "Parallelogram, Semi Circle, Ellipse");
                System.out.print("What shape will you like to find the area of?: ");
                String shapea = input.next();
            
                //if statement for which shape to find the area of
                if (null != shapea) switch (shapea) {
                
                    //if the shape is a square
                    case "square":
                        System.out.print("Enter a side of the square: "); //asks for a side the square
                        double squareside = input.nextDouble(); //prompts user for answer
                        double squarearea = (squareside) * (squareside); //calculates the area
                        System.out.println("The area of the cube with a side length "
                                + "of " + squareside + " is " + squarearea + " units."); //displays the answer
                        System.out.println("Thank you for using Area Calculator!");
                        break;
                
                    //if the shape is a rectangle
                    case "rectangle":
                        System.out.print("Enter the length of the rectangle: "); //asks for the side of the length
                        double reclengtha = input.nextDouble(); //prompts user for length
                        System.out.print("Enter the width of the rectangle: "); //asks for the side of the width
                        double recwidtha = input.nextDouble(); //prompts user for width
                        double recarea = (reclengtha) * (recwidtha); //calculates the area of the rectangle and stores the value in the variable 'recarea'
                        System.out.println("The area of a rectangle with a length "
                                + "of " + reclengtha + " and width of " + recwidtha
                                + " equals " + recarea + " units."); //displays the answer
                        System.out.println("Thank you for using Area Calculator!");
                        break;
                
                    //if the shape is a circle    
                    case "circle":
                        System.out.print("Enter the radius of the circle: "); //asks user for the radius of the circle
                        double radiusa = input.nextDouble(); //prompts user for the radius
                        double circlearea = (3.14159 * radiusa * radiusa); //calcualtes the area of the circle ans stores the value in variable 'circlearea'
                        System.out.println("The area of a circle with a radius of "
                                + "" + radiusa + " equals to " + circlearea + " units.");
                        System.out.println("Thank you for using Area Calculator!");
                        break;
                    
                    //if the shape is a triangle
                    case "triangle":
                        System.out.print("Enter the base of the triangle: "); //asks user for the base of the triangle
                        double tribase = input.nextDouble(); // prompts user for the base
                        System.out.print("Enter the length of the triangle: "); //asks user for the length of the triangle
                        double trilength = input.nextDouble(); //prompts the user for the length
                        double triarea = (0.5 * tribase * trilength); //calculates the area of the triangle
                        System.out.println("The area of a triangle with a base "
                                + "of " + tribase + " and a length of " + trilength +
                                " is " + triarea + " units.");//prints out the answer
                        System.out.println("Thank you for using Area Calculator!");
                        break;
                    
                    //if the shape is a parallelogram
                    case "parallelogram":
                        System.out.print("Enter the base of the parallelogram: "); //asks user for the base of the parallelogram
                        double parbase = input.nextDouble(); //prompts user for the base
                        System.out.print("Enter the length of the parallelogram: "); //asks user for the length of the parallelogram
                        double parlength = input.nextDouble(); //prompts user for the length
                        double pararea = (parbase * parlength); //calculates the area of the parallelogram
                        System.out.println("The area of a parallelogram with a base "
                                + "of " + parbase + " and a length of " + parlength + 
                                " is " + pararea + " units."); //prints out the answer
                        System.out.println("Thank you for using Area Calculator!");
                        break;
                
                    //if the shape is a Semi Circle
                    case "semi circle":
                        System.out.print("Enter the radius of the semi-circle: ");
                        double semiradius = input.nextDouble();
                        double semiarea = (3.14159 * semiradius * semiradius) / (0.5);
                        System.out.println("The area of a semi-circle with a radius of "
                                + "" + semiradius + " equates to " + semiarea + " units.");
                        System.out.println("Thank you for using Area Calculator!");
                        break;
                
                    //if the shape is an ellipse
                    case "ellipse":
                        System.out.print("Enter the first radius point: ");
                        double radius1 = input.nextDouble();
                        System.out.print("Enter the second radius point: ");
                        double radius2 = input.nextDouble();
                        double ellipsearea = (3.14159 * radius1 * radius2);
                        System.out.println("The area of an ellipse with a focal point"
                            + " of " + radius1 + " and " + radius2 + " equates to "
                                    + "" + ellipsearea + " units.");
                        System.out.println("Thank you for using Area Calculator!");
                        break;
                
                    //if the input is different or misspelt    
                    default:
                        System.out.print("\nSorry, that is an invalid choice. "
                                + "Please restart program");
                        break;
            }
                
                break;
            
            //CKI Quiz
            case 5: 
                System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^Welcome to the CKI Quiz!^^^^^^^^^^^^^^^^^^^^^^^");
                System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                
                System.out.println("\nIn this quiz, you will be asked a question "
                        + "out of 10 in both multiple choice \nand free response "
                        + "on the basic information about Circle K International.");
                System.out.print("\nTo start, please enter your first name: ");
                String name = input.next();
                System.out.println("\nWelcome, " + name + ", do you have the "
                        + "basic knowledge of Circle K International? Let's find out.");
                
                int points = 0;
                
                //Question 1
                System.out.println("\nQuestion 1: What is NOT one of our DFIs this year?");
                System.out.println("a) American Foundation for Suicide Prevention");
                System.out.println("b) Pediatric Trauma Prevention Program");
                System.out.println("c) American Red Cross");
                System.out.println("d) Kiwanis Family House");
                System.out.print("Answer: ");
                String question1 = input.next();
                String answer1 = "c";
                if (question1.equalsIgnoreCase(answer1)){
                    System.out.println("\nYes! That's correct! The correct answer "
                            + "is the American Red Cross.");
                    System.out.println("+ 1 point");
                    points = 1;
                } 
                else {
                    System.out.println("\nI'm sorry, " + question1 + " is incorrect.");
                    System.out.println("The correct answer is the c)American Red Cross. Next Question.");
                }
                
                //Question 2
                System.out.println("\n\nQuestion 2: Who is the 2017-2018 District Governer?");
                System.out.println("a) Kathryn Calimag");
                System.out.println("b) Lawrence Sahagun");
                System.out.println("c) Ivan Hoz Kurland");
                System.out.println("d) Katelyn Duch");
                System.out.print("Answer: ");
                String question2 = input.next();
                String answer2 = "b";
                if (question2.equalsIgnoreCase(answer2)) {
                    System.out.println("\nYes! That's correct! The correct answer "
                            + "is Lawrence Sahagun.");
                    System.out.println("+1 point");
                    points = points + 1;
                }
                else {
                    System.out.println("\nI'm sorry, " + question2 + " is incorrect.");
                    System.out.println("The correct answer is b)Lawrence Sahagun. Next Question.");
                }
                
                //Question 3
                System.out.println("\n\nQuestion 3: Who is in charge of keeping track "
                        + "of the club's dispersement of funds?");
                System.out.print("Answer: The ");
                String question3 = input.next();
                String answer3 = "treasurer";
                if (question3.trim().equalsIgnoreCase(answer3)) {
                    System.out.println("\nYes! That is correct! The treasurer "
                            + "is the one in charge of \nkeeping track of the "
                            + "club's dispersment of funds.");
                    System.out.println("+1 point");
                    points = points + 1;
                }
                else {
                    System.out.println("\nI'm sorry, " + question3 + " is incorrect.");
                    System.out.println("The correct answer is the treasurer. Next question.");
                }
                
                //Question 4
                System.out.println("\n\nQuestion 4: Please type the division that SFSU is part of.");
                System.out.print("Answer: ");
                String question041 = input.next();
                String question042 = input.next();
                String question4 = question041 + question042;
                String answer4 = "goldengate";
                if (question4.trim().equalsIgnoreCase(answer4)) {
                    System.out.println("\nYes! That is correct! SFSU is part of Golden Gate Divison.");
                    System.out.println("#goldengateganggang");
                    System.out.println("+1 point");
                    points = points + 1;
                }
                else {
                    System.out.println("\nI'm sorry, " + question041 + " " + question042 + " is incorrect.");
                    System.out.println("SFSU is part of Golden Gate Division. Next question.");
                }
                
                //Question 5
                System.out.println("\n\nQuestion 5: Which of the following is NOT one of our three tenants?");
                System.out.println("a) Leadership");
                System.out.println("b) Fellowship");
                System.out.println("c) Inclusiveness");
                System.out.println("d) Service");
                System.out.print("Answer: ");
                String question5 = input.next();
                String answer5 = "c";
                if (question5.equalsIgnoreCase(answer5)) {
                    System.out.println("\nYes! That is correct! Inclusiveness is a core value of Key Club.");
                    System.out.println("+1 point");
                    points = points + 1; 
                }
                else {
                    System.out.println("\nI'm sorry, that is incorrect.");
                    System.out.println("Inclusiveness is actually a core value of Key Club, not Circle K.");
                    System.out.println("Next question.");
                }
                
                //Question 6
                System.out.println("\n\nQuestion 6: What position is the liason between A & E board?");
                System.out.println("(Please abbreiviate)");
                System.out.print("Answer: The ");
                String question6 = input.next();
                String answer6 = "AVP";
                if (question6.trim().equalsIgnoreCase(answer6)) {
                    System.out.println("\nYes, that is correct! The AVP is the liason between the A & E board");
                    System.out.println("+1 point");
                    points = points + 1;
                }
                else {
                    System.out.println("\nI'm sorry, that's incorrect.");
                    System.out.println("The liason between the A & E board is the AVP or Administrative Vice President");
                    System.out.println("Next Question.");
                }
                
                //Question 7 
                System.out.println("\n\nQuestion 7: What does 'DCM' stand for?");
                System.out.println("a)District Council Meeting");
                System.out.println("b)Division Council Meeting");
                System.out.println("c)District Central Meeting");
                System.out.println("d)Division Central Meeting");
                System.out.print("Answer: ");
                String question7 = input.next();
                String answer7 = "b";
                if (question7.trim().equalsIgnoreCase(answer7)) {
                    System.out.println("\nYes, that is correct! DCM stands for Divisional Council Meeting.");
                    System.out.println("+1 point");
                    points = points + 1;
                }
                else {
                    System.out.println("\nI'm sorry, that is incorrect. DCM stands for Divisional Council Meetings.");
                    System.out.println("Next Question.");
                }
                
                //Question 8
                System.out.println("\n\nQuestion 8: Who is our LTG? (First and Last Name)");
                System.out.print("Answer: ");
                String question081 = input.next();
                String question082 = input.next();
                String question8 = question081 + question082;
                String answer8 = "ryantsao";
                if (question8.trim().equalsIgnoreCase(answer8)) {
                    System.out.println("\nYes! That is correct! Ryan Tsao is our LTG!");
                    System.out.println("+1 point");
                    points = points + 1;
                }
                else {
                    System.out.println("\nI'm sorry, that is incorrect. Ryan Tsao is our LTG.");
                    System.out.println("Next Question.");
                }
                
                //Quesiton 9
                System.out.println("\n\nQuestion 9: What is the fee to be a DUES PAID Circle K member @ SF State?");
                System.out.print("Answer: $");
                byte question9 = input.nextByte();
                byte answer9 = 30;
                if (answer9 == question9) {
                    System.out.println("\nYes! That is correct! It costs $30 to be a CKI member.");
                    System.out.println("+1 point");
                    points = points + 1;
                }
                else {
                    System.out.println("\nI'm sorry, that is incorrect. It costs $30 for a CKI membership");
                    System.out.println("Next Question.");
                }
                
                
                //Question 10
                System.out.println("\n\nQuestion 10: What's DCON2k18's theme? [Hint: Two words]");
                System.out.print("Answer: ");
                String question0101 = input.next();
                String question0102 = input.next();
                String question10 = question0101 + question0102;
                String answer10 = "roadtrip";
                if (question10.trim().equalsIgnoreCase(answer10)) {
                    System.out.println("\nYES! THAT IS CORRECT, ROAD TRIP WHOOOOOOOO!");
                    System.out.println("+1 point");
                    points = points + 1;
                }
                else {
                    System.out.println("\nI'm sorry, that is incorrect. The theme for this year is: ROAD TRIP!!!!");
                }
                
                
                        
                
                //Concluding points
                if (points >= 8) {
                    System.out.println("\nWowie, congrats " + name + "! You scored: " + points +
                            " out of 10! Looks like you have quite the "
                                    + "understanding of Circle K. Great job!");
                    System.out.println("Thank you for using the CKI Quiz!");
                }
                else if (points < 8 && points >= 6) {
                    System.out.println("\nYikes, " + name + ", you scored: " + points + " out of "
                            + "10. you did alright, but you can "
                            + "do better. Or you should have a talk to your "
                            + "MD&E Chair.");
                    System.out.println("Thank you for using the CKI Quiz!");
                }
                else if (points < 6) {
                    System.out.println("\nOoo. That's not good, " + name + ". You scored: " + points +
                            " out of 10. But you can always learn more and do "
                                    + "better next time!");
                    System.out.println("Thank you for using the CKI Quiz!");
                }
                
                break;
            
            //Loan Calculator    
            case 6:
                System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                System.out.println("^^^^^^^^^^^^^^^^^^^^Welcome to the Loan Calculator^^^^^^^^^^^^^^^^^^^^^");
                System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");

                //Annual Interest Rate
                System.out.println("\nPlease enter your annual interest rate: (e.g. 8.35)");
                System.out.print("Annual Interest Rate: ");
                double annualInterestRate = input.nextDouble();
                
                //Converts Annual to Monthly 
                double monthlyInterestRate = annualInterestRate / 1200;
                
                //Years to pay of the loan
                System.out.println("\nEnter the amount of years you want to pay off the loan: (e.g. 10)");
                System.out.print("Years: ");
                double numberOfYears = input.nextDouble();
                
                //Loan amount
                System.out.println("\nEnter the loan amount: (e.g. 12000.95)");
                System.out.print("Loan: ");
                double loanAmount = input.nextDouble();
                
                //Calculates the loan
                double monthlyPayment = loanAmount * monthlyInterestRate / (1
                    - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
                double totalPayment = monthlyPayment * numberOfYears * 12;
                
                //Displays results
                System.out.println("\nYour monthly payment will be: " + monthlyPayment);
                System.out.println("Your total payment will be: " + totalPayment);
                
                break;
            
            //Zodiac and Chinese Zodiac
            case 7:
                System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^Welcome to the Zodiac^^^^^^^^^^^^^^^^^^^^^^^^^");
                System.out.println("^^^^^^^^^^^^^^^^^^^^^^and Chinese Zodiac Calendar^^^^^^^^^^^^^^^^^^^^^^");
                System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                
                System.out.println("\nHere in this program, you will find out your zodiac");
                System.out.println("and what chinese zodiac you are based on the year.");
                
                System.out.println("\nPlease enter the month that you were born in (e.g. January)");
                System.out.print("Month: ");
                String monthInWords = input.next();
                
                
                System.out.println("\nPlease enter the day that you were  born in (e.g. 01, 11, 21, 31, etc.)");
                System.out.print("Day: ");
                int day = input.nextInt();
                
                System.out.println("\nPlease enter the year that you were born in (e.g. 1999, 2000)");
                System.out.print("Year: ");
                int year = input.nextInt();
                
                //converts months into numbers
                int month = 0;
                if ("January".equalsIgnoreCase(monthInWords)) {
                    month = 1;
                }
                else if ("February".equalsIgnoreCase(monthInWords)) {
                    month = 2;
                }
                else if ("March".equalsIgnoreCase(monthInWords)) {
                    month = 3;
                }
                else if ("April".equalsIgnoreCase(monthInWords)) {
                    month = 4;
                }
                else if ("May".equalsIgnoreCase(monthInWords)) {
                    month = 5;
                }
                else if ("June".equalsIgnoreCase(monthInWords)) {
                    month = 6;
                }
                else if ("July".equalsIgnoreCase(monthInWords)) {
                    month = 7;
                }
                else if ("August".equalsIgnoreCase(monthInWords)) {
                    month = 8;
                }
                else if ("September".equalsIgnoreCase(monthInWords)) {
                    month = 9;
                }
                else if ("October".equalsIgnoreCase(monthInWords)) {
                    month = 10;
                }
                else if ("November".equalsIgnoreCase(monthInWords)) {
                    month = 11;
                }
                else if ("December".equalsIgnoreCase(monthInWords)) {
                    month = 12;
                }
                
                //computes zodiac
                String zodiac = null;
                
                //computes Aries
                if (month == 3 && day >= 21 || month == 4 && day <= 19) {
                    zodiac = "Aries";
                } 
                else if (month == 4 && day >= 20 || month == 5 && day <= 20) {
                    zodiac = "Taurus";
                }
                else if (month == 5 && day >= 21 || month == 6 && day <= 20) {
                    zodiac = "Gemini";
                }
                else if (month == 6 && day >= 21 || month == 7 && day <= 22) {
                    zodiac = "Cancer";
                }
                else if (month == 7 && day >= 23 || month == 8 && day <= 22) {
                    zodiac = "Leo";
                }
                else if (month == 8 && day >= 23 || month == 9 && day <= 22) {
                    zodiac = "Virgo";
                }
                else if (month == 9 && day >= 23 || month == 10 && day <= 22) {
                    zodiac = "Libra";
                }
                else if (month == 10 && day >= 23 || month == 11 && day <= 21) {
                    zodiac = "Scorpio";
                }
                else if (month == 11 && day >= 22 || month == 12 && day <= 21) {
                    zodiac = "Sagittarius";
                }
                else if (month == 12 && day >= 22 || month == 1 && day <= 19) {
                    zodiac = "Capricorn";
                }
                else if (month == 1 && day >= 20 || month == 2 && day <= 18) {
                    zodiac = "Aquarius";
                }
                else if (month == 2 && day >= 19 || month == 3 && day <= 20) {
                    zodiac = "Pisces";
                }
                
                //computes chinese zodiac
                String chineseZodiac = null;
                switch (year % 12) {
                    case 0:
                        chineseZodiac = "Monkey";
                        break;
                    case 1:
                        chineseZodiac = "Rooster";
                        break;
                    case 2:
                        chineseZodiac = "Dog";
                        break;
                    case 3:
                        chineseZodiac = "Pig";
                        break;
                    case 4:
                        chineseZodiac = "Rat";
                        break;
                    case 5:
                        chineseZodiac = "Ox";
                        break;
                    case 6:
                        chineseZodiac = "Tiger";
                        break;
                    case 7:
                        chineseZodiac = "Rabbit";
                        break;
                    case 8:
                        chineseZodiac = "Dragon";
                        break;
                    case 9:
                        chineseZodiac = "Snake";
                        break;
                    case 10:
                        chineseZodiac = "Horse";
                        break;
                    case 11:
                        chineseZodiac = "Sheep";
                        break;
                    default:
                        break;
                }
                
                
                
                //Prints out Zodiac and Chinese Zodiac
                System.out.println("\nSeeing that you were born on " + monthInWords +
                        " " + day + ", " + year + ", your zodiacs are: ");
                System.out.println("Zodiac: " + zodiac);
                System.out.println("Chinese Zodiac: " + chineseZodiac);
              
                break;    
            
            //Magic 8 Ball    
            case 8:
                System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                System.out.println("^^^^^^^^^^^^^^^^^^^^^^^Welcome to the Magic 8 Ball^^^^^^^^^^^^^^^^^^^^^");
                System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                
                System.out.println("\nAsk the Magic 8 Ball anything and it will tell you your fortune.");
                System.out.print("\nPlease state your question: ");
                String question = input.next();
                
                String response = null;
                double RNG = Math.random();
                if (RNG < 0.333333333333333) {
                    response = "Yes, that is certain";
                }
                else if (RNG >= 0.333333333333333 && RNG <= 0.666666666666666) {
                    response = "Maybe, that is in the unknown";
                }
                else if (RNG > 0.666666666666666 && RNG < 1) {
                    response = "No, that is not likely to happen";
                }
                
                
                System.out.println("\nThe Magic 8 Ball has responded with: " + response );
                break;
            
            //Prints out the Date and Time
            case 9:
                System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                System.out.println("^^^^^^^^^^^^^^^^^^^^^Welcome to the Calendar App!^^^^^^^^^^^^^^^^^^^^^^");
                System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                
                String months [] = {"January", "February", "March", "April", "May",
                    "June", "July", "August", "September", "October", "November", "December"};
                int yearTime;
                
                GregorianCalendar gcalendar = new GregorianCalendar();
                
                System.out.println("\nThe current date and time according to your system is: ");
                System.out.print("Date: ");
                System.out.print(months[gcalendar.get(Calendar.MONTH)]);
                System.out.print(" " + gcalendar.get(Calendar.DATE));
                System.out.print(", ");
                System.out.println(yearTime = gcalendar.get(Calendar.YEAR));
                System.out.print("Time: ");
                System.out.print(gcalendar.get(Calendar.HOUR) + ":");
                System.out.print(gcalendar.get(Calendar.MINUTE) + ":");
                System.out.println(gcalendar.get(Calendar.SECOND));
                
                if (gcalendar.isLeapYear(yearTime)) {
                    System.out.println("And this year is a leap year!");
                }
                else {
                    System.out.println("This year is not a leap year.");
                }
                break;
            
            //
            case 10: 
                System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                System.out.println("^^^^^^^^^^^^^Welcome to the Quadratic Root Calculator!^^^^^^^^^^^^^^^^^");
                System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                
                System.out.print("\nPlease enter the a value: ");
                double a = input.nextDouble();
                System.out.print("Please enter the b value: ");
                double b = input.nextDouble();
                System.out.print("Please enter the c value: ");
                double c = input.nextDouble();
                
                //computes the root with the quadratic formula (positive value)
                double quad = (b * b) - (4 * a * c);
                
                double rootPos = (((-b) + Math.sqrt(quad)) / (2 * a));
                
                double rootNeg = (((-b) - Math.sqrt(quad)) / (2 * a));
                
                //Displays roots 
                System.out.println("The roots of the quadratic is: " + rootNeg + " and " + rootPos);
                
                
                break;
                
                
            default:
                System.out.println("\nI'm sorry, that is an invalid choice. Please "
                        + "restart the program.");
                break;
        }
        
    }
    
}
