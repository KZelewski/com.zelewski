package imperative;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static  imperative.Main.Gender.*;

public class Main<people, females> {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Asia", FEMALE),
                new Person("Benio", MALE),
                new Person("Cysia", FEMALE),
                new Person("DYZIO", MALE),
                new Person("Eryk", MALE));


        System.out.println("Imperative approach");
        List<Person> femalesImperative = new ArrayList<>();

        for (Person person : people) {
            if (FEMALE.equals(person.gender)) {
                femalesImperative.add(person);
            }
        }

        for (Person female : femalesImperative) {
            System.out.println(female);
        }


        System.out.println("Declarative approach");
        Predicate<Person> personPredicate = person -> FEMALE.equals(person.gender);

          List<Person> femalesDeclarative = people.stream()
                .filter(personPredicate)
                .collect(Collectors.toList());

        femalesDeclarative.forEach(System.out::println);


    }
    //
        static class Person {
            private final String name;
            private final Gender gender;

            Person(String name, Gender gender) {
                this.name = name;
                this.gender = gender;
            }

            @Override
            public String toString() {
                return "Person{" +
                        "name='" + name + '\'' +
                        ", gender=" + gender +
                        '}';
            }
        }

        enum Gender {
            MALE, FEMALE
        }


    }


