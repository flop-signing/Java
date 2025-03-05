package UserInputUsingBufferReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {

   /*     // Taking input from user by BufferedReader

        System.out.println("Enter number: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num=Integer.parseInt(br.readLine());
        System.out.println(num);

        br.close();*/


        // Taking input through Scanner
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        sc.nextInt();
        sc.nextFloat();

        // so all of the above are needed to take different type of user.

    }
}
