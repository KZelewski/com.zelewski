package combinatorpattern;

import java.time.LocalDate;

import static combinatorpattern.CustomerRegistrationValidator.*;
import static combinatorpattern.CustomerRegistrationValidator.ValidationResult.*;


public class Main {

    public static void main(String[] args) throws IllegalAccessException {
        Customer customer = new Customer(
                "Alice",
                "alice@gmail.com",
                "+0898787879878",
                LocalDate.of(2000, 1, 1)
        );

        //CustomerValidatorService Validator =  new CustomerValidatorService();
        System.out.println("Check if customer is valid:");

        boolean customerValid = new CustomerValidatorService().isValid(customer);
        System.out.println(customerValid);

        //Magic v2
        ValidationResult result = isAdult()
                .and(isEmailValid())
                .and(isPhoneNumberValid())
                .apply(customer);

        System.out.println(result);

        if(result != SUCCESS ){
            throw new IllegalAccessException(result.name());
        }
        System.out.println("TEST2");


    }
}