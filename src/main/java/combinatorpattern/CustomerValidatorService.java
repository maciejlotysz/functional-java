package combinatorpattern;

import java.time.LocalDate;
import java.time.Period;

public class CustomerValidatorService {

    private boolean isEmailValid(String email) {
        return email.contains("@");
    }

    private boolean isPhoneNUmberIsValid(String phoneNumber) {
        return  phoneNumber.startsWith("+48");
    }

    private boolean isAdult(LocalDate dob) {
        return Period.between(dob, LocalDate.now()).getYears() > 18;
    }

    public boolean isValid(Customer customer) {
        return isEmailValid(customer.getEmail())
                && isPhoneNUmberIsValid(customer.getPhoneNUmber())
                && isAdult(customer.getDob());
    }
}
