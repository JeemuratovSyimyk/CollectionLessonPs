package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> people = new ArrayList<>(
                List.of(
                        new Student("Akylai", 18, "Java"),
                        new Student("Aizada", 18, "Js"),
                        new Student("Manas", 20, "Js"),
                        new Student("Nursultan", 20, "Java"))
        );
        while (true) {
            switch (scanner.nextInt()) {
                case 1:
                    System.out.println(people);
                    break;
                case 2:
                    FilterGroup(people);
                    break;
                case 3:
                    getAge(people);
                    break;
                case 4:
                    getByInitialLatter(people);
                    break;
            }
        }
    }
    public static void FilterGroup(List<Student> people) {
        ArrayList<Student> Java = new ArrayList<>();
        ArrayList<Student> Js = new ArrayList<>();
        for (Student student : people) {
            if (student.getGroup().equals("Java")) {
                Java.add(student);

            } else {
                Js.add(student);
            }
        }
        System.out.println(Java);
        System.out.println(Js);
    }
    public static void getAge(List<Student>people){
        ArrayList<Student> age = new ArrayList<>();
        for (Student student : people) {
            if(student.getAge()> 18 &student.getAge()< 22){
                age.add(student);
            }
        }
        System.out.println(age);
    }
    public static void getByInitialLatter(List<Student>people){
        ArrayList<Student> name = new ArrayList<>();
        for (Student student: people){
            if(student.getName().startsWith("A")) {
                name.add(student);
            }
        }
        System.out.println(name);
    }
}
