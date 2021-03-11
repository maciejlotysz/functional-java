package functionalinterface;

import lombok.Data;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {

    public static void main(String[] args) {

        // Normal java function
        Customer antonio = new Customer("Antonio", "999888777");
        greetCustomer(antonio);

        // Consumer Functional interface
        Customer carmen = new Customer("Carmen", "888999777");
        greetCustomerConsumer.accept(carmen);

        greetCustomerConsumerV2.accept(carmen, true);
        greetCustomerConsumerV2.accept(carmen, false);


    }

    static BiConsumer<Customer, Boolean> greetCustomerConsumerV2 = (customer, showPhoneNumber) ->
            System.out.println("Hello " + customer.getCustomerName()
                    + ", thanks for registering phone number "
                    + ( showPhoneNumber ? customer.customerPhoneNumber : "**********"));

    static Consumer<Customer> greetCustomerConsumer = customer ->
            System.out.println("Hello " + customer.getCustomerName()
                    + ", thanks for registering phone number "
                    + customer.customerPhoneNumber);

    static void greetCustomer(Customer customer) {
        System.out.println("Hello " + customer.getCustomerName()
                + ", thanks for registering phone number "
                + customer.customerPhoneNumber);
    }

    @Data
    static class Customer {

        private final String customerName;
        private final String customerPhoneNumber;
    }

}
