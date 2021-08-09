package streams;

import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static streams._Stream.Gender.FEMALE;
import static streams._Stream.Gender.MALE;

public class _Stream {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Asia", FEMALE),
                new Person("Benio", MALE),
                new Person("Cysia", FEMALE),
                new Person("Eryk", MALE),
                new Person("Eryk", MALE));

        System.out.println("Unique names:");
        people.stream()
                .map(person -> person.name)
                .collect(Collectors.toSet())
                .forEach(System.out::println);


        System.out.println("Length of each name:");
        people.stream()
                .map(person -> person.name)
                .mapToInt(String::length)
                .forEach(System.out::println);

        Predicate<Person> personPredicate234 = p1 -> FEMALE.equals(p1.gender);
        boolean ContainsOnlyFemale = people.stream()
                .allMatch(personPredicate234);
        System.out.println(ContainsOnlyFemale);

        boolean ContainsAnyFemale = people.stream()
                .anyMatch(personPredicate234);
        System.out.println(ContainsAnyFemale);
    }
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

    static enum Gender {
        MALE, FEMALE
    }
}











