package combinatorpattern;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Customer {

    private final String name;
    private final String email;
    private final String phoneNUmber;
    private final LocalDate dob;

}
