package TryCatchFinally;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        int num=0;
        BufferedReader bufferedReader=null;
        try {
            bufferedReader=new BufferedReader(new InputStreamReader(System.in));
            num=Integer.parseInt(bufferedReader.readLine());

        }
       finally {
            bufferedReader.close();
        }
    }
}
