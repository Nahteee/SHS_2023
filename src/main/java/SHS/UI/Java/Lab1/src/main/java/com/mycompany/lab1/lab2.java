/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab1;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class lab2 {
    public static void main(String[]args){
        /*1.	Write a program that reads a Fahrenheit degree in double, 
        then converts it to Celsius and displays the result on the console. 
        The formula for the conversion is as follows:
        celsius = (Fahrenheit – 32) * 5 / 9
            
        
        Scanner temp = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter degree in Fahrenheit: ");
        double fahrenheit=temp.nextDouble();
        System.out.println("Current temperature is :" + fahrenheit + "celcius");
       
        double celcius = (fahrenheit-32)*5/9;
        System.out.println("Current temperature is :" + celcius + "celcius");
        
        /*2.	Write a program that reads in the radius and length of a cylinder
        and computes volume using the following formulas:
        area = radius * radius * PI
        volume = area * length
        
        Scanner r = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter the radius of the cylinder: ");
        int radius=r.nextInt();
        System.out.println("The radius of the cylinder is :" + radius);
        
        Scanner l = new Scanner(System.in); 
        System.out.println("Enter the length of the cylinder: ");
        int length=l.nextInt();
        System.out.println("The length of the cylinder is :" + length);
        
        double PI = 3.14;
        double area = radius*radius*PI;
        System.out.println("The area of the cylinder is: "+area);
        
        double volume = area*length;
        System.out.println("The volume of the cylinder is: "+volume);
        
        /*3.	Write a program that reads an integer between 0 and 1000 and adds 
        all the digits in the integer. 
        For example, if an integer is 943, the sum of all its digit is 16.
        
        Scanner read = new Scanner(System.in);
        System.out.print("Enter an integer between 0 - 1000: ");
        int integer=read.nextInt();
        System.out.println("The integer entered is :" + integer);
        
        int first = integer%10;
        System.out.println("First is: "+first);
        int second = integer/10%10;
        System.out.println("Second is: "+second);
        int third = integer/100%10;
        System.out.println("Third is: "+third);
        
        int total = first + second + third;
        System.out.println("Total of entered integer is: "+total);
        
        /*4.	Write a program that converts an uppercase letter 
                to a lowercase letter. 
        
        Scanner a = new Scanner(System.in);
        System.out.println("Enter capitalize text: ");
        String text = a.next();
        System.out.println("The text you entered is: "+text);
        System.out.println("After Convert: ");
        System.out.println("Text is: " + text.toLowerCase());
        
        /*5.	Write a program that receives an ASCII code (an integer between 0 and 128) 
        and displays its character.
        For example, if the user enters 97, the program displays character ‘a’.
        
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter an ASCII code
        // (an integer between 0 and 127)
	System.out.print("Enter an ASCII code: ");
	int i = input.nextInt();
        if(
            i>=0 && i<=128
        ){
            // Display ASCII code as character
            System.out.println((char)i);
        }else{
            System.out.println("error");
        }
        
        /*6.	Write a program that prompts the user to enter the month and year,
        and displays the number of days in the month.
        For example, January is 31 days, February is 28 days, March is 31 and etc.
        
        
        Scanner m = new Scanner(System.in);
        System.out.print("Enter the month: ");
        int month = m.nextInt();
        Scanner y = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = y.nextInt();
        if((month==2) && ((year%4==0) || ((year%100==0)&&(year%400==0))))
            System.out.println("Number of days in " +month+" is 29");

        else if(month==2)
            System.out.println("Number of days in " +month+" is 28");

        else if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12)
            System.out.println("Number of days in " +month+" is 31");

        else
            System.out.println("Number of days in " +month+" is 30");
    
        /*7 
        Scanner g = new Scanner(System.in);
        System.out.println("Please enter your grades: ");
        int grades = g.nextInt();
        if(grades>=80)
        {
            System.out.print("Grades=A+");
        }
        else if(grades>=75 && grades<80)
        {
           System.out.print("Grades=A");
        } 
        else if(grades>=70 && grades<75)
        {
            System.out.print("Grades=B+");
        }
        else if(grades>=65 && grades<70)
        {
            System.out.print("Grades=B");
        }
        else if(grades>=55 && grades<65)
        {
            System.out.print("Grades=C");
        }
        else if(grades>=50 && grades<55)
        {
            System.out.print("Grades=D");
        }
        else if(grades>=41 && grades<50)
        {
            System.out.print("Grades=F+");
        }
        else
        {
            System.out.print("Grades=F");
        }
        
        8.	Write a program that sum up all the values 
        in double typed of an array.
        The array capacity is 100. You are required 
        to use for-each construct (enhanced for).
        
        double[] ggg = new double[100];
        double sum=0;
        for (int d=0;d<100;d++){
            ggg[d]=d+1.0;
            sum = sum+ggg[d];
        }
        System.out.println(Arrays.toString(ggg));
        System.out.println("Sum is: "+sum);
        
        /*9.	Suppose that the tuition of a university is RM10000 this year and this tuition fee
        increases 5% every year. Write a program that uses a loop to compute the tuition 
        in ten years.
        double rate = 0.05;
	double fees = 10000;
	for (int year = 0; year < 10; year++) {
	// Increase tution by 5% every year
	fees += (fees * 0.05);
    }
         System.out.println("Total fees are: " +fees);
    }
      10.	Use do-while construct, write a program that prompts 
              the users to continue the program execution. “Yes” to continue 
              the program and “No” to terminate the program.  
        Scanner input = new Scanner(System.in);
        String prompt;
        do{
            System.out.println("Do you want to continue?");
            System.out.println("Yes to continue and No to terminate the program");
            prompt=input.nextLine();
        }while(prompt.equals("Yes"));
        System.out.println("The program is ended");
    }
    11.	Write a program that reads in investment amount, annual interest rate, 
    and number of years, and displays the future
    investment value using the following formula.*/
        Scanner input = new Scanner(System.in);

		// Prompt the user to enter the investment amount,
		// annual interest rate and number of years.
		System.out.print("Enter investment amount: ");
		double amount = input.nextDouble();
		System.out.print("Enter annual interest rate in percentage: ");
		double InterestRate = input.nextDouble();
		System.out.print("Enter number of years: ");
		int years = input.nextInt();

		// Calculate future investment value
		double futureInvestmentValue = 
			amount * Math.pow(1 + InterestRate/100, years);
		
		// Display result
		System.out.println("Accumulated value is $" + futureInvestmentValue);
    }

}

