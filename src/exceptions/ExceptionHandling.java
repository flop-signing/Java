package exceptions;

import java.util.Scanner;

public class ExceptionHandling {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number1=scanner.nextInt();
        int number2=scanner.nextInt();
        int result;

        try {
            result=number1/number2;
            System.out.println(result);
        }
        catch (ArithmeticException e) {
            System.out.println("Something went wrong. "+e.getMessage());
        }
 /*       catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Something went wrong. "+e.getMessage());
        }
        catch(NullPointerException e) {
            System.out.println("Something went wrong. "+e.getMessage());
        }
        catch(NegativeArraySizeException e) {
            System.out.println("Something went wrong. "+e.getMessage());
        }*/


    }
}
