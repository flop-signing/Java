package methodReference;

import java.util.Arrays;
import java.util.List;

public class MethodReference {


    public static void main(String[] args) {

        List<String> names= Arrays.asList("Mehedi","Saba","Zim","Labib","Habib","Akash");

/*        List<String> unames=names.stream()
                .map(name->name.toUpperCase())
                .toList();*/

        List<String> unames=names.stream()
                .map(String::toUpperCase)  // this :: is method reference (Here toUpperCase is belong to String class that's why the type is string in a sense)
                .toList();

//        System.out.println(unames);
        unames.forEach(System.out::println);
    }
}
