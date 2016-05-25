package TemplatePattern;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by WeichengXu on 2016/5/23.
 */
public class TemplateEverydayDemo {

    private static void printContents(List<Person> people){
        for(Person person : people){
            System.out.println(person.getName());
        }
    }

    public static void main(String[] args) {
        Person bryan = new Person(39, "Bryan", "778-444-1111");
        Person mark = new Person(41, "Mark", "778-444-1234");
        Person chris = new Person(38, "Chris", "778-444-2323");

        List<Person> people = new ArrayList<Person>();

        people.add(bryan);
        people.add(mark);
        people.add(chris);

        System.out.println("Not sorted");
        printContents(people);

        Collections.sort(people);

        System.out.println("\nSorted by age");
        printContents(people);

    }
}
