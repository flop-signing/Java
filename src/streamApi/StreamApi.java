package streamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamApi {

    public static void main(String[] args) {
        List <Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);

   //     System.out.println(list);

        // suppose i want only even numbers
        // So i do a filter on the array
/*
        int sum=0;
        for(int i : list){
            if(i%2==0){
                i=i*2;
                sum+=i;
            }
        }

        System.out.println(sum);*/

        // We run this through
     /*   for(int num : list){
            System.out.println(num);
        }
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        list.forEach(n->System.out.println(n));*/


        // Stream creates a copy of main list
        // Stream can't use more than once

       /* // Defining Stream
        Stream<Integer> stream = list.stream();
        Stream<Integer> stream2 = stream.filter(x -> x % 2 == 0);
        Stream<Integer>stream3 = stream2.map(x->x*2);
        int result=stream3.reduce(0,(x,y)->x+y);

*/



        // Run everything in above in one line is

       int result= list.stream()
                .filter(e -> e % 2 == 0)
                .map(e -> e * 2)
                .reduce(0, (x, y) -> x + y);

       // We also use .sorted() to sort the value
      // Stream<Integer> res=list.stream().filter(e->e%2==0).sorted();

       System.out.println(result);

       // stream.forEach(System.out::println);

        // we can use ParallelStream() to run this in multiple thread.





    }
}
