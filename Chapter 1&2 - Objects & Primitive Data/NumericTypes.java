/*
This program demonstrates how numeric types and
operators behave in Java.
*/

import java.util.Scanner;
public class NumericTypes
{
public static void main (String [] args)
{
Scanner scan = new Scanner(System.in);
// Identifier declarations
final double NUMBER = 2 ; // Number of scores
final int SCORE1 = 100; // First test score
final int SCORE2 = 95; // Second test score
final int BOILING_IN_F = 212; // Boiling temperature
double fToC; // Temperature Celsius
double average; // Arithmetic average
String output; // Line of output

String firstName; //First Name
String lastName; //Last Name
String fullName; //Full Name
char firstInitial; //First Initial
String fullName_Upper; //Full Name in upper case

double diameter; //Diameter of sphere
double radius; //Radius of sphere
double volume; //VOlume of sphere

// Find an arithmetic average.
average = (SCORE1 + SCORE2) / NUMBER;
output = SCORE1 + " and " + SCORE2 +
" have an average of " + average;
System.out.println(output);
// Convert Fahrenheit temperature to Celsius.
fToC = 5.0/9.0 * (BOILING_IN_F - 32);
output = BOILING_IN_F + " in Fahrenheit is " +
fToC + " in Celsius.";
System.out.println(output);
System.out.println(); // To leave a blank line
// Prompt the user for first name
System.out.println("Enter first name: ");
// Read the user's first name
firstName = scan.nextLine();
// Prompt the user for last name
System.out.println("Enter last name: ");
// Read the user's last name
lastName = scan.nextLine();
// Concatenate the user's first and last names
fullName = firstName + " " + lastName;
// Print out the user's full name
System.out.println(fullName);
System.out.println(); // To leave a blank line
// Get the first character from the user's first name
firstInitial = firstName.charAt(0);
// Print out the user's first initial
System.out.println("First Initial: " + firstInitial);
// Convert the user's full name to uppercase
fullName_Upper = fullName.toUpperCase();
// Print out the user's full name in uppercase
System.out.println("Your name in upper case: " + fullName_Upper);
System.out.println(); // To leave a blank line

// Prompt the user for a diameter of a sphere
System.out.println("Enter the diameter of a sphere: ");
// Read the diameter
diameter = scan.nextDouble();
// Calculate the radius
radius = diameter / 2.0;
// Calculate the volume
volume = (4/3) * Math.PI * Math.pow(radius, 3);
// Print out the volume
System.out.println("The volume is " + volume);
}
}