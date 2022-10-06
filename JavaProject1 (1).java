
    
package javaproject1;
import java.util.Scanner;
public class JavaProject1 {
    public static void main(String[] args) {
       
String input = "";

do
{
    //displays welcome message
    
    System.out.println("Welcome to my app!");
    System.out.println("This app shows the time it takes to get to a place given the speed and distance!!!");
        
//takes user input
        
        Scanner kb = new Scanner(System.in);
        System.out.println("miles:");
        
        Double miles = kb.nextDouble(); 
        
        //takes user input
        
        Scanner kb1 = new Scanner(System.in);
        System.out.println("Miles per hour:");
        
        Double speed = kb1.nextDouble(); 
        
//new variable for calculating time
        
double time = 0;
        
//formula for time 
        
time = miles/speed;
        
        System.out.println("Estimated travel time in Hours and Minutes: " + time);
        
        
        
        

     // message to display yes or no for continuation  
    
     System.out.print("Continue (y/n)");
    input = kb.next();
    
//while loop to go back to the program when 'y' is typed
} 
while(input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes"));
        
// end message outside while loop to display after user types 'n'
      
        System.out.println("Thanks for using the app!");
  }

 }     
       
            
        
       