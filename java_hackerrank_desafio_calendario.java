/*The Calendar class is an abstract class that provides methods for converting between a specific instant in time and a set of calendar fields such as YEAR, MONTH, DAY_OF_MONTH, HOUR, and so on, and for manipulating the calendar fields, such as getting the date of the next week.

You are given a date. You just need to write the method, , which returns the day on that date. To simplify your task, we have provided a portion of the code in the editor.

Example



The method should return  as the day on that date.

image

Function Description

Complete the findDay function in the editor below.

findDay has the following parameters:

int: month
int: day
int: year
Returns

string: the day of the week in capital letters
Input Format

A single line of input containing the space separated month, day and year, respectively, in    format.*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
            List<String> weekDay = new ArrayList<String>();
            int firstDay = 1;
            String weekDay2[] = {"MONDAY","TUESDAY", "WEDNESDAY","THURSDAY","FRIDAY","SATURDAY","SUNDAY"};
            Collections.addAll(weekDay,weekDay2);
           int leapYear = year;
		   if(leapYear%400==0){
                    if (month<=2)
                        leapYear--;
                }                    
            else if (leapYear%100!=0 && leapYear%4==0){
                if (month<=2)
                    leapYear--;
            } 
            while(leapYear>2001){
                if(leapYear%400==0){
                    day++;
                }                    
                else if (leapYear%100!=0 && leapYear%4==0){
                    day++;
                }
                
                leapYear--;
            }
            
                
            day = day + (year-2001)*365;
            switch(month){
                case 1:
                    //day = day+ 31;
                    break;
                case 2:
                    day = day+ 31;
                    break;
                case 3:
                    day = day+ 28+ 31;
                    break;
                case 4:
                    day = day+ 31+ 28+ 31;
                    break;
                case 5:
                    day = day+ 30+ 31+ 28+ 31;
                    break;
                case 6:
                    day = day+ 31+ 30+ 31+ 28+ 31;
                    break;
                case 7:
                    day = day+ 30+ 31+ 30+ 31+ 28+ 31;
                    break;
                case 8:
                    day = day+ 31+ 30+ 31+ 30+ 31+ 28+ 31;
                    break;
                case 9:
                    day = day+ 31+ 31+ 30+ 31+ 30+ 31+ 28+ 31;
                    break;
                case 10:
                    day = day+ 30+ 31+ 31+ 30+ 31+ 30+ 31+ 28+ 31;
                    break;
                case 11:
                    day = day+ 31+ 30+ 31+ 31+ 30+ 31+ 30+ 31+ 28+ 31;
                    break;
                case 12:
                    day = day+ 30+ 31+ 30+ 31+ 31+ 30+ 31+ 30+ 31+ 28+ 31;
                    break;
            }
			if(day<=7)
                day = day+7
            day = day % 7;
            if(day!=0)
                return weekDay.get(day-1);
            else
                return weekDay.get(6);
            
    }

}
