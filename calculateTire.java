import java.util.Scanner;

/**
 * Write a description of class calculateTire here.
 *
 * @author (your name)
 * @version (a version number or a date)
 * R 150 / 75 R R 4
 */
public class calculateTire
{
    public static final double R= 3.14159;
    public static void main(String [] args)
    {
        Scanner Keyboard=new Scanner(System.in);
        System.out.println("Please  enter the data of tire.");   
        String Characters=Keyboard.next();
        int firstNumber=Keyboard.nextInt();
        String secondCharacters=Keyboard.next();
        int secondNumber=Keyboard.nextInt();
        String thirdCharacters=Keyboard.next();
        int thirdNumber;
        String numberOrCharacters=Keyboard.next();
        if(numberOrCharacters.charAt(0)>57)
        {
            
            thirdNumber=Keyboard.nextInt();
            System.out.printf("%s %d / %d %s %s %d: %.0fcm\n",Characters,firstNumber, 
            secondNumber,thirdCharacters,numberOrCharacters,thirdNumber,
            calculate(firstNumber,secondNumber,thirdNumber));
        }
        else 
        {
            thirdNumber=Integer.parseInt(numberOrCharacters);
            System.out.printf("%s %d / %d %s %d: %.0fcm\n",Characters,firstNumber, 
            secondNumber,thirdCharacters,thirdNumber,
            calculate(firstNumber,secondNumber,thirdNumber));
    }
    }
    
    private static double calculate(int firstNumber,int secondNumber,int thirdNumber)
    {
        double i1=firstNumber*secondNumber/1000.0;
        double i2=thirdNumber*2.54;
        return (i1*2.0+i2)*R;
    }
}