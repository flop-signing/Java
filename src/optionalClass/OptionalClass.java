package optionalClass;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalClass {


    public static void main(String[] args) {


        List<String> list= Arrays.asList("Durefisan","Saba","Irin","Nidi","Nacho","Joselu","Asensio","Albarto");


/*        Optional<String> name=list.stream()
                .filter(str->str.contains("b"))
                .findFirst()
                ;*/

       // System.out.println(name.orElse("Not Found"));

        // Write with the method

     String name=list.stream()
                .filter(str->str.contains("b"))
                .findFirst()
                .orElse("Not found");

     System.out.println(name);


    }

}
