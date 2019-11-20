package com.udemy.practice;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String courses = null;
    private String studentId;
    private int tuitionBalance = 0;
    private int costOfCourse =600 ;
    private static int id = 1000;

//constructor
    public Student(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Firstname");
        this.firstName = input.nextLine();
        System.out.println("Enter Lastname");
        this.lastName = input.nextLine();
        System.out.println("Enter \n 1. level 100 \n 2. level 200 \n 3. level 300 \n 4. level 400");
        this.gradeYear = input.nextInt();

        setStudentId();

    }

    //unique Id
    private void setStudentId(){
        id++;
        this.studentId = gradeYear +""+id;
    }

    public void enroll() {
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter course name or q to Quit");
            String course = input.nextLine();
            if (!course.equals("q")) {
                this.courses = courses + "\n " + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            } else {
                break;
            }
        }
        while (1 != 0);
    }
    private void viewBalance(){
        System.out.println("tuitionBalance :" +tuitionBalance );
    }

    public void payTuition(){
        viewBalance();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter amount you want to pay :N");
        int payment = input.nextInt();
        System.out.println("Thanks for payment of :N"+payment);
        tuitionBalance = tuitionBalance - payment;

    }
    public String toString(){
        return firstName +" "+ lastName +
                "\n Student Id: "+studentId+
                "\nGrade Year: "+gradeYear+
                "\n Courses: "+ courses+
                "\n Tuition Balance: "+tuitionBalance;
    }
      }

