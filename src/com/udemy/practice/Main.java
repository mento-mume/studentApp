package com.udemy.practice;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	 System.out.println("Enter number of students to be enrolled: ");
        Scanner input = new Scanner(System.in);
        int numberofStudents = input.nextInt();
        Student[] student = new Student[numberofStudents] ;

        for (int n=0; n<numberofStudents;n++){
            student[n] = new Student();
            student[n].enroll();
            student[n].payTuition();

        }
        for (int n=0; n<numberofStudents;n++){
            System.out.println(student[n].toString());

        }

    }
}
