package com.experion.assignment1;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class DifferenceBtwDates_19 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the first date");
        String d1 = scanner.nextLine();
        Date firstDate = convertStringtoDate(d1);
        System.out.println("Enter the second date");
        String d2 = scanner.nextLine();
        Date secondDate = convertStringtoDate(d2);
        
        findDifference(firstDate,secondDate);
        	
        
			

	}

	private static void findDifference(Date firstDate, Date secondDate) {
		// TODO Auto-generated method stub
	      long difference_In_Time
          = secondDate.getTime() - firstDate.getTime();

		 long difference_In_Days
		 
         = TimeUnit
               .MILLISECONDS
               .toDays(difference_In_Time)
           % 365;

     long difference_In_Years
         = TimeUnit
               .MILLISECONDS
               .toDays(difference_In_Time)
           / 365l;
     
     System.out.print(
             "Difference"
             + " between two dates is: ");
     System.out.println(
             difference_In_Years
             + " years, "
             + difference_In_Days
             + " days, ");
	}

	private static Date convertStringtoDate(String date) throws ParseException {
		// TODO Auto-generated method stub
		DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		Date convertedDate = formatter.parse(date);
		return convertedDate;
		
	}
	

}
