package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorAndComparable {

    public static void main(String[] args) {
       /* List<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(29);
        list.add(22);
        list.add(13);
        list.add(12);
        list.add(55);

//        System.out.println(list);
//
//        Collections.sort(list);
//        System.out.println(list);


        // suppose we wanna sort the list as per our own logic then we use comparator


        // suppose we wanna sort according to the last digit of the number


        // this is an interface so we create an anonymous class
        Comparator<Integer> comparator = new Comparator<Integer>()
        {
            public int compare(Integer o1, Integer o2) {
                if( o1%10 > o2%10 )
                    return 1;// that means it compare and perform swap
                else return -1;
            }
        };
        Collections.sort(list, comparator);
        System.out.println(list);*/


     /*   Comparator<Student> comparator = new Comparator<Student>()
        {
            public int compare(Student o1, Student o2) {
                if( o1.getAge() > o2.getAge() )
                    return 1;// that means it compare and perform swap
                else return -1;
            }
        };*/

        List<Student> students = new ArrayList<>();
        students.add(new Student("John", 28));
        students.add(new Student("Jane", 27));
        students.add(new Student("Jack", 18));
        students.add(new Student("Jill", 34));
        students.add(new Student("Bob", 18));

        Collections.sort(students);
        for (Student student : students) {
            System.out.println(student);
        }

    }
}
