package streams;

import java.util.List;

import static streams._Stream.Gender.FEMALE;
import static streams._Stream.Gender.MALE;

public class _Stream {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Asia", FEMALE),
                new Person("Benio", MALE),
                new Person("Cysia", FEMALE),
                new Person("DYZIO", MALE),
                new Person("Eryk", MALE));

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











