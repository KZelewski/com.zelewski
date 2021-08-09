package optional;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        Optional.ofNullable("TEST")
                .ifPresentOrElse(
                        email -> System.out.println("Sending email to: " + email),
                        () -> System.out.println("Cannot send email"));


        //Java optional https://www.youtube.com/watch?v=1xCxoOuDZuU

        System.out.println("YouTube course:");
        Optional <String> opt1 = Optional.ofNullable("My text 1");
        String opt1_OrElse =  opt1
                .map(String::toUpperCase)
                .orElseGet( () -> "My text 1 - or else");

        Optional <String> opt2 = Optional.ofNullable(null);
        String opt2_OrElse =  opt2
                .map(String::toUpperCase)
                .orElseGet( () -> "My text 2 - or else");

        System.out.println(opt1_OrElse);
        System.out.println(opt2_OrElse);

        opt1.ifPresent(System.out::println);

        opt2.ifPresentOrElse(w2 -> System.out.println(w2),
                () -> System.out.println("Not exist"));

        Person person = new Person("Eryk","Eryczek@sloneczko.nasze");
        Person person2 = new Person("Zibi",null);
        System.out.println(person.getName() + " " + person.getEmail().orElse("Email not provided"));
        System.out.println(person2.getName() + " " + person2.getEmail().orElse("Email not provided"));

        // Second try to check if email exist
        if (person2.getEmail().isPresent()) {
            String getEmailP2 = person2.getEmail().get();
            System.out.println(getEmailP2);
        } else{
            System.out.println("Email is not provided (2)");
        }

    }
}

    class Person{
        private String name;
        private String email;

        Person(String name, String email) {
            this.name = name;
            this.email = email;
        }
        public String getName(){
            return name;
        }
        public Optional <String> getEmail(){
            return Optional.ofNullable(email);
        }

    }




