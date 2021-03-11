package combinatorpattern;

import java.time.LocalDate;

import static combinatorpattern.CustomerRegistrationValidator.*;


public class Main {

    public static void main(String[] args) {


        Customer customer = new Customer(

                "Urszula",
                "ulazula@gmail.com",
                "+4200546874",
                LocalDate.of(2014, 5, 14)
        );

//        System.out.println(new CustomerValidatorService().isValid(customer));

        // Using combinator pattern
        ValidationResult result = isEmailValid()
                .and(isAnAdult())
                .and(isPhoneNumberValid())
                .apply(customer);

        System.out.println(result);

        if (result != ValidationResult.SUCCESS) {
            throw new IllegalStateException(result.name());
        }


    }

}
