/*  Objective
Today, we're delving into Inheritance. Check out the attached tutorial for learning materials and an instructional video.

Task
You are given two classes, Person and Student, where Person is the base class and Student is the derived class. Completed code for Person and a declaration for Student are provided for you in the editor. Observe that Student inherits all the properties of Person.

Complete the Student class by writing the following:

A Student class constructor, which has  parameters:
A string, .
A string, .
An integer, .
An integer array (or vector) of test scores, .
A char calculate() method that calculates a Student object's average and returns the grade character representative of their calculated average:
Grading.png

Input Format

The locked stub code in the editor reads the input and calls the Student class constructor with the necessary arguments. It also calls the calculate method which takes no arguments.

The first line contains , , and , separated by a space. The second line contains the number of test scores. The third line of space-separated integers describes .

Constraints

Output Format

Output is handled by the locked stub code. Your output will be correct if your Student class constructor and calculate() method are properly implemented.

Sample Input

Heraldo Memelli 8135627
2
100 80
Sample Output

 Name: Memelli, Heraldo
 ID: 8135627
 Grade: O
Explanation

This student had  scores to average:  and . The student's average grade is . An average grade of  corresponds to the letter grade , so the calculate() method should return the character'O */

import java.util.Scanner;

class Person {

    protected String firstName;

    protected String lastName;
    protected int idNumber;
    // Constructor

    Person(String firstName, String lastName, int identification) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }
    // Print person data
    public void printPerson() {
        System.out.println("Name: " + lastName + ", " + firstName + "\nID: " + idNumber);
    }
}
class Student extends Person {

    private int[] testScores;

    Student(String firstName, String lastName, int identification, int[] testScores) {

        super(firstName, lastName, identification);
        this.testScores = testScores;
    }

    char calculate() {
        int total = 0;

        for (int testScore : testScores) total += testScore;

        int avg = total / testScores.length;
        if (avg >= 90 && avg <= 100) return 'O';
        if (avg >= 80 && avg < 90) return 'E';
        if (avg >= 70 && avg < 80) return 'A';
        if (avg >= 55 && avg < 70) return 'P';
        if (avg >= 40 && avg < 55) return 'D';
        return 'T';
    }
}

public class Solution {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for (int i = 0; i < numScores; i++) {
            testScores[i] = scan.nextInt();
        }
        scan.close();
        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate());
    }
}
