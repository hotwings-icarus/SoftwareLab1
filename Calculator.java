import java.util.*;
public class Calculator {
    private static Scanner input;
    public static void divide(float a, float b)
    {   if (b >0)
        {
            float c=a/b;
            System.out.println("result of division "+c);
        }
        else
        System.out.println("invalid input");
    }
    public static void addition(float a, float b)
    {
        float c = a + b;
        System.out.println("result of addition " + c);
    }

    public static void subtraction(float a, float b) {
        float c = a - b;
        System.out.println("result of subtraction " + c);
    }

    public static void multiplication(float a, float b) {
        float c = a * b;
        System.out.println("result of multiplication " + c);
    }
    public static void main (String[] args)
    {
        input = new Scanner(System.in);
        System.out.print("enter 1st num : ");
        float a = input.nextFloat();

        System.out.print("enter 2nd num : ");
        float b = input.nextFloat();

        divide(a,b);
        addition(a, b);
        subtraction(a, b);
        multiplication(a, b);

    }

}
