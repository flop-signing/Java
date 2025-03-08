package streamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ParallelStream {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(10000);

        Random random = new Random();

        for (int i = 1; i <= 10000; i++) {
            nums.add(random.nextInt(100));
        }
    //    System.out.println(nums);

        // multiplying everynumber with 2 and then sum it
        // Do it through the stream

//        int result=nums.stream()
//                .map(n->n*2)
//                .reduce(0, (x, y) -> x+y);
//       // System.out.println(result);


        // we use an alternate syntax of reduce() that is sum
        // sum is applicable when returning int
        //

        long start=System.currentTimeMillis();

        int result1=nums.stream()
                .map(i->i*2)
                .mapToInt(i->i)
                .sum();

        long end=System.currentTimeMillis();


        long startPara=System.currentTimeMillis();

        int result2=nums.parallelStream()
                .map(i->i*2)
                .mapToInt(i->i)
                .sum();

        long endPara=System.currentTimeMillis();




        System.out.println( result1 + " "+result2);
        System.out.println("Seq" + (end-start));
        System.out.println("Para" + (endPara-startPara));

    }
}
