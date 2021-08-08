package functionalinterface;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        System.out.println("Without predicate");
        System.out.println(isPhoneNumberIsValid("123123123"));

        System.out.println("With predicate");
        System.out.println(isPhoneNumberIsValidPredicate.test("48123123123"));

        System.out.println("Predicate with contain number:");
        System.out.println(isPhoneNumberIsValidPredicate.and(containNumber7).test("48123123123"));
        System.out.println(isPhoneNumberIsValidPredicate.and(containNumber7).test("47123123123"));
    }


    static boolean isPhoneNumberIsValid(String phonenumber){
        return phonenumber.startsWith("48") && phonenumber.length() == 11;
    }

    static Predicate<String> containNumber7 = number7 -> number7.contains("7");

    static Predicate<String> isPhoneNumberIsValidPredicate = phonenumber ->
            phonenumber.startsWith("48") && phonenumber.length() == 11;
}
