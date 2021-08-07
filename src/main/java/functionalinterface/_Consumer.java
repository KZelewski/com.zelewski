package functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        Customer eric = new Customer("Eric", "513-513-513");

        System.out.println("Normal implementation");
        GreetConsumer(eric);

        System.out.println("Consumer function impelemtation");
        GreetConsumerFunction.accept(eric);

        System.out.println("Consumer function Bi");
        GreetConsumerFunctionBi.accept(eric,false);

    }

        static void GreetConsumer (Customer customer223){
            System.out.println("Hello " + customer223.CustomerName
                    + "! Thank's for register your phone number: "
                    + customer223.CustomerPhoneNumber);
        }

        static Consumer<Customer> GreetConsumerFunction
                = customer242 -> System.out.println("Hello " + customer242.CustomerName
                + "! Thank's for register your phone number: "
                + customer242.CustomerPhoneNumber);

        static BiConsumer<Customer, Boolean> GreetConsumerFunctionBi
                = (customer242, ShowNumber)->
                System.out.println("Hello " + customer242.CustomerName
                        + "! Thank's for register your phone number: "
                        + (ShowNumber ? customer242.CustomerPhoneNumber : "***-***-***"));

        static class Customer {
           private String CustomerName;
           private String CustomerPhoneNumber;

            Customer(String customerName, String customerPhoneNumber) {
                CustomerName = customerName;
                CustomerPhoneNumber = customerPhoneNumber;
            }
        }
}



