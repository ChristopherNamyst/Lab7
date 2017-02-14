
import java.util.Scanner;


import static java.lang.System.*;

class Lab7Arrays {


    public static void main (String[] args) {
        Scanner scan = new Scanner(in);//Introduce a Scanner, User Input
        //Greet user
        out.println("Hello there. Welcome to my informative app that helps you get to know your students.");
        //Prompt user for input
        //start loop here
        String answer = "yes";
        do {
            out.println("Please enter a number from 1 to 20, to learn more about them: ");
            //start scan for input
            int number = scan.nextInt();
            //if user input is not to MY specs, I display an error message.
            if (number < 1 || number >= 21) {
                out.println("Incorrect input!,\nPlease enter an integer between 1 and 20: ");
            }
            int NUM_STUDENTS = 21;
            String[] studentNames = new String[NUM_STUDENTS];
            String[] favRecords = new String[NUM_STUDENTS];
            int[] studentAges = new int[NUM_STUDENTS];
            //student info stored
            studentNames[1] = "Christopher Paul's";
            favRecords[1] = "Off the Wall by Michael Jackson";
            studentAges[1] = 38;
            studentNames[2] = "Vivian's";
            favRecords[2] = "Are You Experienced by Jimi Hendrix";
            studentAges[2] = 26;
            studentNames[3] = "Gustavo's";
            favRecords[3] = "Donna Summer/ Greatest Hits";
            studentAges[3] = 24;
            studentNames[4] = "Hilda's";
            favRecords[4] = "Miles Davis/ Live at Carnegie Hall";
            studentAges[4] = 31;
            studentNames[5] = "Tyrone's";
            favRecords[5] = "OK Computer by Radiohead";
            studentAges[5] = 33;
            studentNames[6] = "Francisco's";
            favRecords[6] = "We're Only In It For The Money by The Mothers Of Invention";
            studentAges[6] = 32;
            studentNames[7] = "Angel's";
            favRecords[7] = "Blue Train by John Coltrane";
            studentAges[7] = 36;
            studentNames[8] = "Ignacio's";
            favRecords[8] = "Changes by David Bowie";
            studentAges[8] = 24;
            studentNames[9] = "Ira's";
            favRecords[9] = "Electric Mud by Muddy Waters";
            studentAges[9] = 25;
            studentNames[10] = "Paul's";
            favRecords[10] = "Fresh by Sly and The Family Stone";
            studentAges[10] = 28;
            studentNames[11] = "Neal's";
            favRecords[11] = "Resurection by Common Sense";
            studentAges[11] = 29;
            studentNames[12] = "Richie's";
            favRecords[12] = "Illadelph Halflife by The Roots";
            studentAges[12] = 28;
            studentNames[13] = "Nicole's";
            favRecords[13] = "License to Ill by The Beatsie Boys";
            studentAges[13] = 25;
            studentNames[14] = "Stephanie's";
            favRecords[14] = "Midnight Marauders by ATCQ";
            studentAges[14] = 26;
            studentNames[15] = "Genevieve's";
            favRecords[15] = "Frisko Disko by Mark Farina";
            studentAges[15] = 22;
            studentNames[16] = "Leland's";
            favRecords[16] = "The Perculator by Cajmere";
            studentAges[16] = 31;
            studentNames[17] = "Georgio's";
            favRecords[17] = "House's of the Holy By Led Zeppelin";
            studentAges[17] = 34;
            studentNames[18] = "Irving's";
            favRecords[18] = "Who's Afraid Of Detroit by Claude Van Stroke";
            studentAges[18] = 29;
            studentNames[19] = "Nellie's";
            favRecords[19] = "Purple Rain by Prince";
            studentAges[19] = 22;
            studentNames[20] = "Caleb's";
            favRecords[20] = "One by Metallica";
            studentAges[20] = 21;
            //student info displayed
            out.printf("%s favorite record is %s, and is %d years old. %n", studentNames[number], favRecords[number], studentAges[number]);


            //prompt user to continue
            System.out.println("Would you like to continue? yes/no");
            answer = scan.next().toLowerCase();
            //end loop here
        } while(answer.equalsIgnoreCase("yes"));


            System.out.println("Thank you for inquiring about your students, Im glad I could help!!" );

    }
}


